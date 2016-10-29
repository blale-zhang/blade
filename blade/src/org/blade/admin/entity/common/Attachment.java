/**
 * 
 */
package org.blade.admin.entity.common;

import org.blade.admin.entity.base.BaseEntity;

/**
 * 
 * @author blade
 *
 */
public class Attachment extends BaseEntity<String> {

	
	private String path;
	
	private int type;
	
	private String extendName;
	
	private String name;
	
	private String relatedId;
	

	public String getRelatedId() {
		return relatedId;
	}

	public void setRelatedId(String relatedId) {
		this.relatedId = relatedId;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getExtendName() {
		return extendName;
	}

	public void setExtendName(String extendName) {
		this.extendName = extendName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
