package com.nebrija.jp;
import java.util.ArrayList;
import java.util.List;

public class Category {
	
	String name;
	static List<Category> Categories = new ArrayList<>();
	
	Category(String name){
		this.name = name;
		List<Product> Products = new ArrayList<>();
	}
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
		
	static void printCategories() {
		System.out.println("Categories: ");
		for(int i = 0; i < Categories.size(); i++) {
			System.out.println(Categories.get(i).getName());
		}
	} 
		 
	void printProducts() {
		System.out.println("-- " + this.getName()+" --" + ": ");
		for(int i = 0; i < Products.size(); i++) {
			if(Product.euro==true) {
				System.out.println(Products.get(i).getName()+"   "+Product.price+"€");
			}
			else if(Product.dollar==true) {
				System.out.println(Products.get(i).getName()+"   "+Product.price*0.87+"$");
			}
			else if(Product.pound==true) {
				System.out.println(Products.get(i).getName()+"   "+Product.price*1.13+" £");
			}
		 }
	}
		 
	void printPB() {
		System.out.println("-- " + this.getName()+" --" + ": ");
		for(int i = 0; i < Products.size(); i++) {
			if(Product.euro=true) {
				System.out.println(User.basket.get(i).getName()+"   "+Product.price+"€");
			}
			else if(Product.dollar=true) {
				System.out.printf(User.basket.get(i).getName()+"   "+Product.price*0.87+"$");
			}
			else if(Product.pound=true) {
				System.out.printf(User.basket.get(i).getName()+"   "+Product.price*1.13+" £");
			}
		}
	}
		
		static Category searchCategories(String name) {
			Category category = new Category(name);
			for(int i = 0; i < Categories.size(); i++) {
				if(name.equals(Categories.get(i).getName())) {
					category = Categories.get(i);
					break;
				}
			}
			return category;
		}
		
		static Product searchProducts(String name) {
			Product searched = new Product("",name, 1, 1);
			for(int i = 0; i < Category.Categories.size(); i++) {
				for(int j = 0; j < Categories.get(i).pList.size(); j++) {
					if(name.equals(Categories.get(i).pList.get(j).getName())){
						searched = Categories.get(i).pList.get(j);
						break;
					}
				}
			}
			return searched;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
