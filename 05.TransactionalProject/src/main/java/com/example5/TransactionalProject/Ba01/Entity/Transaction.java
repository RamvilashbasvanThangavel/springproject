package com.example5.TransactionalProject.Ba01.Entity;

public class Transaction {
	public Sender sender;
	public Recevier recevier;

	public Sender getSender() {
		return sender;
	}

	public void setSender(Sender sender) {
		this.sender = sender;
	}

	public Recevier getRecevier() {
		return recevier;
	}

	public void setRecevier(Recevier recevier) {
		this.recevier = recevier;
	}

}
