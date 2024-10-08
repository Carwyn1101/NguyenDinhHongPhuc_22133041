package LapTrinhWeb_Cha.models;

import java.io.Serializable;



public class CategoryModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int cateid;
	private String catename;
	private String images;
	private boolean acitve;
	private int status;
	//Tạo constructor, getters/setters
	public CategoryModel(int cateid, String catename, String images, boolean acitve) {
		super();
		this.cateid = cateid;
		this.catename = catename;
		this.images = images;
		this.acitve = acitve;
	}
	public CategoryModel() {
		super();
	}
	public int getCateid() {
		return cateid;
	}
	public void setCateid(int cateid) {
		this.cateid = cateid;
	}
	public String getCatename() {
		return catename;
	}
	public void setCatename(String catename) {
		this.catename = catename;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public boolean isAcitve() {
		return acitve;
	}
	public void setAcitve(boolean acitve) {
		this.acitve = acitve;
	}
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
}

