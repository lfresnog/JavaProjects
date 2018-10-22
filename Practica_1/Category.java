package com.nebrija.lfg;
import java.util.ArrayList;
import java.util.List;

public class Category {
	static String name;
	static List<Category> categorylist = new ArrayList<Category>();
	
	Category(String name){
		this.name = name;
		categorylist.add(this);
	}
	
	static void printCategories() {
		if (categorylist.size() > 0) {
			System.out.print("Categories: " + categorylist.get(0).getName());
			for(int i = 1; i < categorylist.size(); i++) {
				System.out.print(", " + categorylist.get(i).getName());
			}
			System.out.println(".");
		} else {
			System.out.println("There are no categories yet.");
		}
	}
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
