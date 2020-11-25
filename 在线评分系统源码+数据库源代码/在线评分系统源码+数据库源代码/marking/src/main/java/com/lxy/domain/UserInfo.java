package com.lxy.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_user")
public class UserInfo  implements  Serializable {
	@Id
	
	private int id;//编号
	private String userName;//用户名
	private String password;//用户密码
	private String email;//邮箱
	private String touImage;//头像
	private char vaild ;//用户权限
	/**
	 * 
	 */
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param userName
	 * @param password
	 * @param email
	 * @param touImage
	 * @param vaild
	 */
	public UserInfo(int id, String userName, String password, String email, String touImage, char vaild) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.touImage = touImage;
		this.vaild = vaild;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTouImage() {
		return touImage;
	}
	public void setTouImage(String touImage) {
		this.touImage = touImage;
	}
	public char getVaild() {
		return vaild;
	}
	public void setVaild(char vaild) {
		this.vaild = vaild;
	}
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ ", touImage=" + touImage + ", vaild=" + vaild + "]";
	}
	
	
	 
}
