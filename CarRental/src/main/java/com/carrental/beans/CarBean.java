package com.carrental.beans;

public class CarBean {
	private String carid, name ,seater;
	private int quantity, issued;
	
	public CarBean(String carid, String name, String seater, int quantity, int issued) {
		super();
		this.carid = carid;
		this.name = name;
		this.seater = seater;
		this.quantity = quantity;
		this.issued = issued;
	}
	
	

	

	public CarBean(String carid, String name, String seater, int quantity) {
		super();
		this.carid = carid;
		this.name = name;
		this.seater = seater;
		this.quantity = quantity;
	}





	public CarBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCarid() {
		return carid;
	}

	public void setCarid(String carid) {
		this.carid = carid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSeater() {
		return seater;
	}

	public void setSeater(String seater) {
		this.seater = seater;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getIssued() {
		return issued;
	}

	public void setIssued(int issued) {
		this.issued = issued;
	}

	
	
	
}
