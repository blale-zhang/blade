/**
 * 
 */
package org.blade.admin.service.impl;

import javax.annotation.Resource;

import org.blade.admin.entity.KeyWord;
import org.blade.admin.mapper.KeyWordMapper;
import org.blade.admin.service.KeyWordService;
import org.springframework.stereotype.Service;

/**
 * @author blade
 *
 */
@Service("keyWordService")
public class KeyWordServiceImpl implements KeyWordService {

	/* (non-Javadoc)
	 * @see org.blade.admin.service.KeyWordService#queryById(java.lang.Long)
	 */
	
	@Resource
	private KeyWordMapper keyWordDao;
	
	@Override
	public KeyWord queryById(Long id) {
		return keyWordDao.selectById(id);
	}

	/* (non-Javadoc)
	 * @see org.blade.admin.service.KeyWordService#save(org.blade.admin.entity.KeyWord)
	 */
	@Override
	public void save(KeyWord keyWord) {
		
		keyWordDao.insertOne(keyWord);

	}

}
