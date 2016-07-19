/**
 * 
 */
package org.blade.admin.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.blade.admin.entity.SitePlaceAnalysis;
import org.blade.admin.mapper.SitePlaceAnalysisMapper;
import org.blade.admin.service.SitePlaceAnalysisService;
import org.springframework.stereotype.Service;

/**
 * @author blade
 *
 */
@Service("sitePlaceAnalysisService")
public class SitePlaceAnalysisServiceImpl implements SitePlaceAnalysisService {

	@Resource
	private SitePlaceAnalysisMapper sitePlaceAnalysisMapper;
	
	@Override
	public SitePlaceAnalysis queryById(Long id) {
		return sitePlaceAnalysisMapper.selectById(id);
	}

	@Override
	public int save(List<SitePlaceAnalysis> sitePlaceAnalysises) {
		return sitePlaceAnalysisMapper.insert(sitePlaceAnalysises);
	}

	@Override
	public int save(SitePlaceAnalysis sitePlaceAnalysis) {
		return sitePlaceAnalysisMapper.insertOne(sitePlaceAnalysis);
	}

	@Override
	public List<SitePlaceAnalysis> query(SitePlaceAnalysis sitePlaceAnalysis) {
		return sitePlaceAnalysisMapper.select(sitePlaceAnalysis);
	}

}
