package net.go.shoppingbackend.dto;

public class Category {

	/**
	 * Private Fields
	 */
	private int id;
	private String name;
	private String description;
	private String imgaeUrl;
	private boolean active = true;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImgaeUrl() {
		return imgaeUrl;
	}

	public void setImgaeUrl(String imgaeUrl) {
		this.imgaeUrl = imgaeUrl;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
