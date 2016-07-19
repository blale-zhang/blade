package org.blade.admin.entity;

/**
 * 关键词
 * @author blade
 *
 */
public class KeyWord {
	
	public static int TYPE_PLAN = 1;
	public static int TYPE_GROUP = 2;
	public static int TYPE_KEY_WORD = 3;

	private Long id;
	private Long parentId;
	private String name;
	private Integer type;
	private String path;
	private String url;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	

}
