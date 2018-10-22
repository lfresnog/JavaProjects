package com.nebrija.lfg;

public class Product {
	int category;
	String name;
	int id;
	int quantity;
	float price;
	boolean exist=true;

	
	Product(String quantity, String name, int id, int quantity1, float price, boolean exist){
		this.category= category;
		this.name=name;
		this.id = id;
		this.quantity = quantity1;
		this.price=price;
		this.exist = exist;
		}
	int getCategoryId() {
		return category;
	}
	
	String getName() {
		return name;
	}
	
	int getId() {
		return id;
	}
	
	
	int getStock() {
		return quantity;
	}
	
	float getPrice() {
		return price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
