package com.nebrija.lfg;
import java.util.ArrayList;
import java.util.List;

public class Category {
	static String name;
	static List<Category> cList = new ArrayList<Category>();
	static List<Product> pList = new ArrayList<Product>();

	
	Category(String name){
		this.name = name;
		cList.add(this);
	}
	
	 static void printC() {
			System.out.println("Categories: ");
			for(int i = 0; i < cList.size(); i++) {
				System.out.println(cList.get(i).getName());
			}
		} 
	 void printP() {
			System.out.println("-- " + this.getName()+" --" + ": ");
			for(int i = 0; i < pList.size(); i++) {
				if(Product.euro==true) {
					System.out.println(pList.get(i).getName()+"   "+Product.price+"€");
					}
					else if(Product.dollar==true) {
						System.out.println(pList.get(i).getName()+"   "+Product.price*0.87+"$");
						}
					else if(Product.pound==true) {
						System.out.println(pList.get(i).getName()+"   "+Product.price*1.13+" £");
						}
			}
		}
	 void printPB() {
		System.out.println("-- " + this.getName()+" --" + ": ");
		for(int i = 0; i < pList.size(); i++) {
			if(Product.euro=true) {
				System.out.println(user.basket.get(i).getName()+"   "+Product.price+"€");
				}
				else if(Product.dollar=true) {
					System.out.printf(user.basket.get(i).getName()+"   "+Product.price*0.87+"$");
					}
				else if(Product.pound=true) {
					System.out.printf(user.basket.get(i).getName()+"   "+Product.price*1.13+" £");
					}
		}
	}
	
	static Category searchC(String name) {
		Category category = new Category(name);
		for(int i = 0; i < cList.size(); i++) {
			if(name.equals(cList.get(i).getName())) {
				category = cList.get(i);
				break;
			}
		}
		return category;
	}
	static Product searchP(String name) {
		Product searched = new Product("",name, 1, 1);
		for(int i = 0; i < cList.size(); i++) {
			for(int j = 0; j < cList.get(i).pList.size(); j++) {
				if(name.equals(cList.get(i).pList.get(j).getName())){
					searched = cList.get(i).pList.get(j);
					break;
				}
			}
		}
		return searched;
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
