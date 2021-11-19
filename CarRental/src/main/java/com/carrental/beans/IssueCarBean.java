package com.carrental.beans;

import java.sql.Date;

public class IssueCarBean {
	private String carid, renterid, rentername;
	private long rentermobile;
	private Date issueddate;
	private String returnstatus;

	public IssueCarBean() {
	}

	public IssueCarBean(String carid, String renterid, String rentername, long rentermobile, Date issueddate,
			String returnstatus) {
		super();
		this.carid = carid;
		this.renterid = renterid;
		this.rentername = rentername;
		this.rentermobile = rentermobile;
		this.issueddate = issueddate;
		this.returnstatus = returnstatus;
	}
	
	




	public IssueCarBean(String carid, String renterid, String rentername, long rentermobile) {
		
		this.carid = carid;
		this.renterid = renterid;
		this.rentername = rentername;
		this.rentermobile = rentermobile;
	}

	public String getCarid() {
		return carid;
	}

	public void setCarid(String carid) {
		this.carid = carid;
	}

	public String getRenterid() {
		return renterid;
	}

	public void setRenterid(String renterid) {
		this.renterid = renterid;
	}

	public String getRentername() {
		return rentername;
	}

	public void setRentername(String rentername) {
		this.rentername = rentername;
	}

	public long getRentermobile() {
		return rentermobile;
	}

	public void setRentermobile(long rentermobile) {
		this.rentermobile = rentermobile;
	}

	public Date getIssueddate() {
		return issueddate;
	}

	public void setIssueddate(Date issueddate) {
		this.issueddate = issueddate;
	}

	public String getReturnstatus() {
		return returnstatus;
	}

	public void setReturnstatus(String returnstatus) {
		this.returnstatus = returnstatus;
	}

	
}
