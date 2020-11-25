package com.lxy.domain;

import java.util.Date;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="t_time")
public class Time {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;//编号
	@Column(name="product_name")
	private String productName;//产品名字
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date startTime;//产品评价开始时间
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date endTime;//产品评价结束时间
	/**
	 * 
	 */
	public Time() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param productName
	 * @param startTime
	 * @param endTime
	 */
	public Time(int id, String productName, Date startTime, Date endTime) {
		super();
		this.id = id;
		this.productName = productName;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	@Override
	public String toString() {
		return "Time [id=" + id + ", productName=" + productName + ", startTime=" + startTime + ", endTime=" + endTime
				+ "]";
	}
	
}
