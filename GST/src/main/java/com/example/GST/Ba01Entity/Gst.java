package com.example.GST.Ba01Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gST")
public class Gst {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int hsn;
	private int percentage;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHsn() {
		return hsn;
	}

	public void setHsn(int hsn) {
		this.hsn = hsn;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Gst [id=" + id + ", hsn=" + hsn + ", percentage=" + percentage + "]";
	}

}
