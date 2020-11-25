package com.lxy.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_authority_user")
public class UserAuthority implements Serializable {
	@Id
	private int id;//编号
	private Integer  userId;//
	private Integer  authorityId;//
	/**
	 * 
	 */
	public UserAuthority() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param userId
	 * @param authorityId
	 */
	public UserAuthority(int id, Integer userId, Integer authorityId) {
		super();
		this.id = id;
		this.userId = userId;
		this.authorityId = authorityId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getAuthorityId() {
		return authorityId;
	}
	public void setAuthorityId(Integer authorityId) {
		this.authorityId = authorityId;
	}
	@Override
	public String toString() {
		return "UserAuthority [id=" + id + ", userId=" + userId + ", authorityId=" + authorityId + "]";
	}
	
	
}
