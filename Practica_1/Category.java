package com.nebrija.jp;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Category {
	 String name;
	 static List<Category> Categories = new ArrayList<>();
	 List<Product> Products = new ArrayList<>();
	
	Category(String name){
		this.name = name;
		List<Product> ProductsU = new ArrayList<>();
		Products=ProductsU;
	}
	
	public List<Product> getProducts() {
		return Products;
	}

	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
		
	  static void printCategories() {
		System.out.println("-- Categories --");
		for(int i = 0; i < Categories.size(); i++) {
			System.out.println(Categories.get(i).getName());
		}
	} 
		 
	static void printProducts(Category c) {
		System.out.println("-- " + c.getName()+" --" + ": ");
		for(int i = 0; i < c.getProducts().size(); i++) {
			if(Product.euro==true) {
				System.out.println(c.getProducts().get(i).getName()+"   "+c.getProducts().get(i).getPrice()+"€    x"+c.getProducts().get(i).getQuantity());
			}
			else if(Product.dollar==true) {
				System.out.println(c.getProducts().get(i).getName()+"   "+c.getProducts().get(i).getPrice()*0.87+"$    x"+c.getProducts().get(i).getQuantity());
			}
			else if(Product.pound==true) {
				System.out.println(c.getProducts().get(i).getName()+"   "+c.getProducts().get(i).getPrice()*1.13+" £    x"+c.getProducts().get(i).getQuantity());
			}
		 }
	}
		
	static Category searchCategories(String name) {
		Category category = new Category(name);
		for(int i = 0; i < Categories.size(); i++) {
			if(name.equals(Categories.get(i).getName())) {
				category = Categories.get(i);
				return category;
			}
		}
	return category;
	}
		
	static Product searchProducts(String name) {
		Product searched = new Product("",name, 0, 0);
		for(int i = 0; i < Categories.size(); i++) {
			for(int j = 0; j < Categories.get(i).getProducts().size(); j++) {
				if(name.equals(Categories.get(i).getProducts().get(j).getName())){
					searched = Categories.get(i).getProducts().get(j);
					break;
				}
			}
		}
		return searched;
	}
	static void buyProduct() {
		printCategories();
		System.out.print("Select category: ");
		Scanner sc1 = new Scanner(System.in);
		String selC;
		selC = sc1.nextLine();
		Category selC1;
		selC1 = searchCategories(selC);
		if(selC1.getName() == null) {
			System.out.println("ERROR");
		} else {
			printProducts(selC1);
		}
		System.out.print("Select product: ");
		Scanner sc2 = new Scanner(System.in);
		String selP;
		selP = sc2.nextLine();
		Product selP1;
		selP1 = searchProducts(selP);
		if(selP1.getName() == null) {
			System.out.println("ERROR");
		} else {
			User.Users.get(User.selL).getBasket().add(selP1);
			selP1.quantity--;
			if(selP1.quantity==0) {
			selC1.getProducts().remove(selP1);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Category t=new Category("Lapices");
		Category t1=new Category("Rotuladores");
		t.Categories.add(t);
		t.Categories.add(t1);
		t.printCategories();
	}

}
