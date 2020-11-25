package com.lxy.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_authority")
public class Authority implements  Serializable {
	@Id
	
	private int id;//编号

	private String  authority;

	/**
	 * 
	 */
	public Authority() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param authority
	 */
	public Authority(int id, String authority) {
		super();
		this.id = id;
		this.authority = authority;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String toString() {
		return "Authority [id=" + id + ", authority=" + authority + "]";
	}
	
}
