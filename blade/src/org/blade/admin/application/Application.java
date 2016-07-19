package org.blade.admin.application;

import java.util.Date;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.blade.admin.entity.KeyWord;
import org.blade.admin.entity.SitePlaceAnalysis;
import org.blade.admin.entity.User;
import org.blade.admin.service.KeyWordService;
import org.blade.admin.service.RoleService;
import org.blade.admin.service.SitePlaceAnalysisService;
import org.blade.admin.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
@ComponentScan( basePackages = {"org.blade.admin"} )
@ImportResource({
		"classpath:applicationContext-mybatis.xml",
	"classpath:applicationContext-shiro.xml"})
@EnableAutoConfiguration
public class Application {

	@Resource
	private UserService userService;
	
	@Resource
	private RoleService roleService;
	
	@Resource
	private KeyWordService keyWordService;
	
	@Resource
	private SitePlaceAnalysisService sitePlaceAnalysisService;
	
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
    
    @RequestMapping("/usr/query/{id}")
    User user(@PathVariable("id")String id ) {
        return userService.findById(id);
    }
    
    @RequestMapping("/usr/role/query/{id}")
    User showUserAndRole(@PathVariable("id")String id ) {
        return userService.findUserAndRoleById(id);
    }
    
    @RequestMapping("/role/delete/{id}")
    int delete(@PathVariable("id")Long id ){
    	return roleService.removeById(id);
    }
    
    @RequestMapping("/login/{userName}/{password}")
    public void login(@PathVariable("userName")String userName,
    		@PathVariable("password")String password ){
    	
    	UsernamePasswordToken token = new UsernamePasswordToken(userName, password);  
        token.setRememberMe(true); 
        Subject currentUser = SecurityUtils.getSubject();  
        try {
            currentUser.login(token);
        } catch ( UnknownAccountException uae ) {
        } catch ( IncorrectCredentialsException ice ) { 
        } catch ( LockedAccountException lae ) { 
        } catch ( ExcessiveAttemptsException eae ) { 
        }  
    }
 
    @RequestMapping("/keyWord/{id}")
    public KeyWord getKeyWord(@PathVariable("id") Long id){
    	return keyWordService.queryById(id);
    }

    @RequestMapping("/sitePlaceAnalysis/{id}")
    public SitePlaceAnalysis getSitePlaceAnalysis(@PathVariable("id") Long id){
    	return sitePlaceAnalysisService.queryById(id);
    }
    
    @RequestMapping("/now")
    String hehe() {
        return "现在时间：" + (new Date()).toLocaleString();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}