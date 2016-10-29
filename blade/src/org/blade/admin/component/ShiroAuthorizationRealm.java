package org.blade.admin.component;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.blade.admin.entity.sys.User;
import org.blade.admin.service.AuthorityService;
import org.blade.admin.service.UserService;
import org.springframework.stereotype.Component;

/**
 * SHIRO 框架验证组件
 * 
 * @author blade
 * @version 0.1
 * @since 2016/2/16 17:08
 */
@Component("shiroAuthorizationRealm")
public class ShiroAuthorizationRealm extends AuthorizingRealm {

	@Resource
	private UserService userService;
	
	@Resource
	private AuthorityService authorityService;
	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		//获取当前登录的用户名,等价于(String)principals.fromRealm(this.getName()).iterator().next()
		String currentUsername = (String)super.getAvailablePrincipal(principals);
		SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();
		//实际中可能会像上面注释的那样从数据库取得
		if(null!=currentUsername && "BBjava".equals(currentUsername)){
			//添加一个角色,不是配置意义上的添加,而是证明该用户拥有admin角色  
			simpleAuthorInfo.addRole("admin");
			//添加权限
			simpleAuthorInfo.addStringPermission("admin:manage");
			System.out.println("已为用户[jadyer]赋予了[admin]角色和[admin:manage]权限");
			return simpleAuthorInfo;
		}else if( null != currentUsername && "玄玉".equals(currentUsername)){
			System.out.println("当前用户[玄玉]无授权");
			return simpleAuthorInfo;
		}
		//若该方法什么都不做直接返回null的话,就会导致任何用户访问/admin/listUser.jsp时都会自动跳转到unauthorizedUrl指定的地址
		//详见applicationContext.xml中的<bean id="shiroFilter">的配置
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken authcToken) throws AuthenticationException {
			//获取基于用户名和密码的令牌
			//实际上这个authcToken是从LoginController里面currentUser.login(token)传过来的
			//两个token的引用都是一样的,本例中是org.apache.shiro.authc.UsernamePasswordToken@33799a1e
			UsernamePasswordToken token = (UsernamePasswordToken)authcToken;
			/*				
			此处无需比对,比对的逻辑Shiro会做,我们只需返回一个和令牌相关的正确的验证信息
			说白了就是第一个参数填登录用户名,第二个参数填合法的登录密码(可以是从数据库中取到的,本例中为了演示就硬编码了)
			这样一来,在随后的登录页面上就只有这里指定的用户和密码才能通过验证*/
			User user = userService.findUserByNameAndPassword(token.getUsername(), new String(token.getPassword()));
			if(user != null){
				AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(user.getName(), user.getPassword(), this.getName());
				this.setSession(User.NAME, user);
				return authcInfo;
			}
			//没有返回登录用户名对应的SimpleAuthenticationInfo对象时,就会在LoginController中抛出UnknownAccountException异常
			return null;
	}
	
	/**
	 * 将一些数据放到ShiroSession中,以便于其它地方使用
	 * @see 比如Controller,使用时直接用HttpSession.getAttribute(key)就可以取到
	 */
	private void setSession(Object key, Object value){
		Subject currentUser = SecurityUtils.getSubject();
		if(null != currentUser){
			Session session = currentUser.getSession();
			System.out.println("Session默认超时时间为[" + session.getTimeout() + "]毫秒");
			
			if(null != session){

				session.setAttribute(User.NAME, value);
				//TODO query the authorities of current user.
				User user = (User)value;
				/*List<Map<String, Object>> authorites = authorityManager.queryAllTheAuthorities(user.getId());
				Map fastAuthorites = new HashMap();
				for(Map auth : authorites){
					fastAuthorites.put(MapUtils.getObject(auth, KeyWords.URL), auth);
				}
				session.setAttribute(KeyWords.USER_AUTH, fastAuthorites);*/
			}
		}
	}

}
