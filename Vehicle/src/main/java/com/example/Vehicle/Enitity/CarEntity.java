package com.example.Vehicle.Enitity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "car")

public class CarEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String brand;
	private String model;
	private String colour;
	private int cc;
	private int prdMonth;
	private int prdYr;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public int getPrdMonth() {
		return prdMonth;
	}

	public void setPrdMonth(int prdMonth) {
		this.prdMonth = prdMonth;
	}

	public int getPrdYr() {
		return prdYr;
	}

	public void setPrdYr(int prdYr) {
		this.prdYr = prdYr;
	}

	@Override
	public String toString() {
		return "CarEntity [id=" + id + ", brand=" + brand + ", model=" + model + ", colour=" + colour + ", cc=" + cc
				+ ", prdMonth=" + prdMonth + ", prdYr=" + prdYr + "]";
	}

}
