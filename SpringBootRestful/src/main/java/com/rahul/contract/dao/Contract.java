package com.rahul.contract.dao;

/**
 * @author Rahul Vashishta
 * @created on Nov 4, 2016 11:22:23 PM
 */
public class Contract {

	private String name;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int contractNumber) {
		this.id = contractNumber;
	}

	@Override
	public String toString() {
		return "Contract [name=" + name + ", id=" + id + "]";
	}

}
