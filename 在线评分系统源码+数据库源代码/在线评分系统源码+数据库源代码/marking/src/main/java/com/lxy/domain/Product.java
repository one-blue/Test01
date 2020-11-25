package com.lxy.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="t_product")
public class Product {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;//产品编号
		private String productName;//产品名字
		private String productIntroduce;//产品介绍
		private String grade;//产品分数
		
		/**
		 * @param id
		 * @param productName
		 * @param productIntroduce
		 * @param grade
		 */
		public Product(int id, String productName, String productIntroduce, String grade) {
			super();
			this.id = id;
			this.productName = productName;
			this.productIntroduce = productIntroduce;
			this.grade = grade;
		}
		
		public Product() {
			super();
			// TODO Auto-generated constructor stub
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
		public String getProductIntroduce() {
			return productIntroduce;
		}
		public void setProductIntroduce(String productIntroduce) {
			this.productIntroduce = productIntroduce;
		}
		public String getGrade() {
			return grade;
		}

		public void setGrade(String grade) {
			this.grade = grade;
		}

		
		@Override
		public String toString() {
			return "Product [id=" + id + ", productName=" + productName + ", productIntroduce=" + productIntroduce
					+ ", grade=" + grade + "]";
		}
		
}
