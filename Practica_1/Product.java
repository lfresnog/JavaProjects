package com.nebrija.lfg;
import java.util.Scanner;


public class Product {
	int category;
	static String name;
	int id;

	float price;
	static String selC;
	static Category selC1;
	static String selP;
	static Product selP1;
	static int select;
	boolean exist=true;
	

	
	Product( String name, int id, float price, boolean exist){
		this.name=name;
		this.id = id;
		this.price=price;
		this.exist = exist;
	}
	int getCategoryId() {
		return category;
	}
	
	static String getName() {
		return name;
	}
	
	int getId() {
		return id;
	}
	
	
	float getPrice() {
		return price;
	}
	
	
	static void buyP() {
		Category.printC();
		System.out.print("Select category: ");
		Scanner sc1 = new Scanner(System.in);
		selC = sc1.nextLine();
		selC1 = Category.searchC(selC);
		if(selC1.getName() == null) {
			System.out.println("ERROR");
		} else {
			selC1.printP();
		}
		Scanner sc2 = new Scanner(System.in);
		selP = sc2.nextLine();
		selP1 = Category.searchP(selP);
		if(getName() == null) {
			System.out.println("Error, product not found.");
		} else {
			user.basket.add(selP1);
			Category.pList.remove(selP1);
		}
	}
	static void showB() {
		if (user.basket.size() > 0) {
			System.out.println(user.basket.get(0).getName());
			for(int i = 0; i < user.basket.size(); i++) {
				System.out.println(user.basket.get(i).getName());
			}
			System.out.println(".");
		} else {
			System.out.println("Empty");
		}
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
