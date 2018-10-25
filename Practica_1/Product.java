package com.nebrija.lfg;
import java.util.Scanner;


public class Product {
	static String name;
	int id;
	static int select1;
	static float price;
	static float price1;
	static String selC;
	static Category selC1;
	static String selP;
	static Product selP1;
	static int quantity;
	static int quantity1;
	static int select;
	static String category;
	static boolean euro=false;
	 static boolean dollar=true;
	static boolean pound=false;
	
	boolean exist=true;


	
	Product(String category, String name, float price, int quantity){
		this.category=category;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	String getCategoryId() {
		return category;
	}
	
	static String getName() {
		return name;
	}
	
	int getId() {
		return id;
	}
	
	
	float getQuantity() {
		return quantity;
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
			user.lapiz.printP();
		}
		System.out.print("Select product: ");
		Scanner sc2 = new Scanner(System.in);
		selP = sc2.nextLine();
		selP1 = Category.searchP(selP);
		if(getName() == null) {
			System.out.println("ERROR");
		} else {
			user.basket.add(selP1);
			selP1.quantity--;
			if(selP1.quantity==0) {
			Category.pList.remove(selP1);
			}
		}
	}
	static void sellP() {
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
		System.out.print("Add name: ");
		Scanner sc2 = new Scanner(System.in);
		selP = sc2.nextLine();
		System.out.print("Add quantity: ");
		Scanner sc3 = new Scanner(System.in);
		quantity1 = sc3.nextInt();
		System.out.print("Add price: ");
		Scanner sc4 = new Scanner(System.in);
		price1 = sc4.nextInt();
		selP1=new Product(selC, selP, price1, quantity1);
		if(getName() == null) {
			Category.pList.add(selP1);
		}
	}
	static void showB() {
		
		if (user.basket.size() > 0) {
			for(int i = 0; i < user.basket.size(); i++) {
				if(euro=true) {
				System.out.println(user.basket.get(i).getName()+"   "+Product.price+"€  ");
				}
				else if(dollar=true) {
					System.out.printf(user.basket.get(i).getName()+"   "+Product.price*0,87+"$  ");
					}
				else if(pound=true) {
					System.out.printf(user.basket.get(i).getName()+"   "+Product.price*1,13+" £  " );
					}
			}
		} else {
			System.out.println("Empty");
		}
	}
	
	static void currency() {
		 
		System.out.println("Choose an option");
	    System.out.println("   1. € ");
		System.out.println("   2. $");
		System.out.println("   3. £");
		Scanner sc1 = new Scanner(System.in);
		select1 = sc1.nextInt();
		
	    switch(select1) {
	    
	    case 1:
	    	euro=true;
	    	dollar=false;
	    	pound=false;
	    	break;
	    case 2:
	    	euro=false;
	    	dollar=true;
	    	break;
	    case 3:
	    	euro=false;
	    	dollar=false;
	    	pound=true;
	    	break;
	    }
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
