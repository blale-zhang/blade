/**
 * 
 */
package org.blade.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.blade.admin.entity.KeyWord;

/**
 * 关键词
 * @author blade
 *
 */
@Mapper
public interface KeyWordMapper {

	/**
	 * 批量插入记录
	 * @param keyWords 需要保存的信息
	 * @return
	 */
	public int insert(List<KeyWord> keyWords);
	
	/**
	 * 插入一条记录
	 * @param keyWord 需要保存的信息
	 * @return
	 */
	public int insertOne(KeyWord keyWord);
	
	/**
	 * 根据id进行查询
	 * @param id 记录id
	 * @return
	 */
	public KeyWord selectById(Long id);
	
	
	/**
	 * 查询
	 * @param keyWord 查询条件
	 * @return
	 */
	public List<KeyWord> select(KeyWord keyWord);

	
}
