package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Bookdetails")
public class Bookmodel {
	@Id
	private int id;
	private String bname;
	private float price;
	private int qty;
	private String aname;
	public Bookmodel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bookmodel(int id, String bname, float price, int qty, String aname) {
		super();
		this.id = id;
		this.bname = bname;
		this.price = price;
		this.qty = qty;
		this.aname = aname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	

}
