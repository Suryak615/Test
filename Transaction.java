package com.dnpass.corejavatraining.day8.Collections;

import java.io.Serializable;

public class Transaction implements Serializable,Cloneable,Comparable<Transaction> {
protected Integer id;
protected ProductType type;
protected Double amount;
protected String city;
protected String currency;
public Transaction() {
	 super();
}
public Transaction(Integer id, ProductType type, Double amount, String city, String currency) {
	this.id = id;
	this.type = type;
	this.amount = amount;
	this.city = city;
	this.currency = currency;
}
public Integer getId() {
	return id;
}
public ProductType getType() {
	return type;
}
public Double getAmount() {
	return amount;
}
public String getCity() {
	return city;
}
public String getCurrency() {
	return currency;
}
public void setId(Integer id) {
	this.id = id;
}
public void setType(ProductType type) {
	this.type = type;
}
public void setAmount(Double amount) {
	this.amount = amount;
}
public void setCity(String city) {
	this.city = city;
}
public void setCurrency(String currency) {
	this.currency = currency;
}
@Override
public int compareTo(Transaction t1) {
	// TODO Auto-generated method stub
	return (int)Math.signum(amount-t1.getAmount());
}
@Override
public String toString() {
	return getId()+","+getType()+","+getAmount();
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((amount == null) ? 0 : amount.hashCode());
	result = prime * result + ((city == null) ? 0 : city.hashCode());
	result = prime * result + ((currency == null) ? 0 : currency.hashCode());
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((type == null) ? 0 : type.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj) {
		return true;
	}
	if (obj == null) {
		return false;
	}
	if (getClass() != obj.getClass()) {
		return false;
	}
	Transaction other = (Transaction) obj;
	if (amount == null) {
		if (other.amount != null) {
			return false;
		}
	} else if (!amount.equals(other.amount)) {
		return false;
	}
	if (city == null) {
		if (other.city != null) {
			return false;
		}
	} else if (!city.equals(other.city)) {
		return false;
	}
	if (currency == null) {
		if (other.currency != null) {
			return false;
		}
	} else if (!currency.equals(other.currency)) {
		return false;
	}
	if (id == null) {
		if (other.id != null) {
			return false;
		}
	} else if (!id.equals(other.id)) {
		return false;
	}
	if (type != other.type) {
		return false;
	}
	return true;
 }
}
