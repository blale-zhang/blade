/**
 * 
 */
package org.blade.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.blade.admin.entity.SitePlaceAnalysis;

/**
 * 渠道跟踪信息
 * @author blade
 *
 */
@Mapper
public interface SitePlaceAnalysisMapper {

	/**
	 * 插入一条记录
	 * @param sitePlaceAnalysis 需要存储的信息
	 * @return
	 */
	public int insertOne(SitePlaceAnalysis sitePlaceAnalysis);
	
	/**
	 * 批量插入记录
	 * @param sitePlaceAnalysises 需要存储的信息
	 * @return
	 */
	public int insert(List<SitePlaceAnalysis> sitePlaceAnalysises);
	
	/**
	 * 根据id查询
	 * @param id 唯一标识
	 * @return
	 */
	public SitePlaceAnalysis selectById(Long id);
	
	/**
	 * 根据信息查询
	 * @param sitePlaceAnalysis 查询条件
	 * @return
	 */
	public List<SitePlaceAnalysis> select(SitePlaceAnalysis sitePlaceAnalysis);
}
