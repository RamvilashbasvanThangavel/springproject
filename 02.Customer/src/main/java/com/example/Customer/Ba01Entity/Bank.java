package com.example.Customer.Ba01Entity;

public class Bank {
	private int id;
	private String branch;
	private String ifsc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	@Override
	public String toString() {
		return "Bank [id=" + id + ", branch=" + branch + ", ifsc=" + ifsc + "]";
	}

}
