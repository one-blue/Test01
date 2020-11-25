package com.lxy.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_index")
public class Index {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;//编号
	private String indexImage;//主页3个图片
	private String imgName;//主页3个图片的名称
	
	public Index() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Index(int id, String indexImage, String imgName) {
		super();
		this.id = id;
		this.indexImage = indexImage;
		this.imgName = imgName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIndexImage() {
		return indexImage;
	}
	public void setIndexImage(String indexImage) {
		this.indexImage = indexImage;
	}
	
	public String getImgName() {
		return imgName;
	}
	public void setImgName(String imgName) {
		this.imgName = imgName;
	}
	@Override
	public String toString() {
		return "Index [id=" + id + ", indexImage=" + indexImage + ", imgName=" + imgName + "]";
	}
	
}
