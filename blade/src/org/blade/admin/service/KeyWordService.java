/**
 * 
 */
package org.blade.admin.service;

import org.blade.admin.entity.KeyWord;

/**
 * @author blade
 *
 */
public interface KeyWordService {

	/**
	 * 
	 * @param id
	 */
	public KeyWord queryById(Long id);
	
	/**
	 * 
	 * @param keyWord
	 */
	public void save(KeyWord keyWord);
	
}
