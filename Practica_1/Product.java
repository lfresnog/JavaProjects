package com.nebrija.jp;
import java.util.Scanner;

public class Product {
	
		 String name;
		 int id;
		 int select1;
		 static float price;
		 float price1;
		 String selC;
		 Category selC1;
		 String selP;
		 Product selP1;
		 int quantity;
		 int quantity1;
		 int select;
		 String category;
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
		
		 String getName() {
			return name;
		}
		
		int getId() {
			return id;
		}
		
		float getQuantity() {
			return quantity;
		}
		
		 void buyP() {
			Category.printCategories();
			System.out.print("Select category: ");
			Scanner sc1 = new Scanner(System.in);
			selC = sc1.nextLine();
			selC1 = Category.searchCategories(selC);
			if(selC1.getName() == null) {
				System.out.println("ERROR");
			} else {
				selC1.printProducts();
			}
			System.out.print("Select product: ");
			Scanner sc2 = new Scanner(System.in);
			selP = sc2.nextLine();
			selP1 = Category.searchProducts(selP);
			if(getName() == null) {
				System.out.println("ERROR");
			} else {
				User.basket.add(selP1);
				selP1.quantity--;
				if(selP1.quantity==0) {
				Category.Products.remove(selP1);
				}
			}
		}
		 void sellP() {
			Category.printCategories();
			System.out.print("Select category: ");
			Scanner sc1 = new Scanner(System.in);
			selC = sc1.nextLine();
			selC1 = Category.searchCategories(selC);
			if(selC1.getName() == null) {
				System.out.println("ERROR");
			} else {
				selC1.printProducts();
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
				Category.Categories.add(selP1);
			}
		}
		 
		
		 void currency() {
			 
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

		
		 void menuP() {
			int select;
			do {
				System.out.println("Choose an option");
				System.out.println("   1. Buy ");
				System.out.println("   2. Sell");
				System.out.println("   3. Basket");
				System.out.println("   4. €/$/£");
				System.out.println("   5. Exit");
				Scanner sc = new Scanner(System.in);
				select = sc.nextInt();
					
				switch(select) {
					case 1:
						//Product.buyP();
						break;
					case 2:
						//Product.sellP();
						break;
				    case 3:
				    	//Product.showB();
				    	break;
				    case 4:
				    	//Product.currency();
				    	break;
				    case 5:
				    	
			    }	
			}while(select!=5);
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
