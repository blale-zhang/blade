/**
 * 
 */
package org.blade.admin.service;

import java.util.List;

import org.blade.admin.entity.SitePlaceAnalysis;

/**
 * 渠道跟踪
 * @author blade
 *
 */
public interface SitePlaceAnalysisService {

	public SitePlaceAnalysis queryById(Long id);
	
	public int save(List<SitePlaceAnalysis> sitePlaceAnalysises);
	
	public int save(SitePlaceAnalysis sitePlaceAnalysis);
	
	public List<SitePlaceAnalysis> query(SitePlaceAnalysis sitePlaceAnalysis);
}
