package com.lxy.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="t_score")
public class Score {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;//编号
	private String userName;//用户名
	private String score;//评分分数
	private String productName;//产品名字
	/**
	 * 
	 */
	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param userName
	 * @param score
	 * @param productName
	 */
	public Score(int id, String userName, String score, String productName) {
		super();
		this.id = id;
		this.userName = userName;
		this.score = score;
		this.productName = productName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "Score [id=" + id + ", userName=" + userName + ", score=" + score + ", productName=" + productName + "]";
	}
	
}
