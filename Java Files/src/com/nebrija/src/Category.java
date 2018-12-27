package com.nebrija.src;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Category {
	 String name;
	 static List<Category> Categories = new ArrayList<>();
	 List<Product> Products = new ArrayList<>();
	Category(String name){
		this.name = name;
		this.Products=Products;
		Categories.add(this);
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
	  static private void printCategories() {
		System.out.println("-- Categories --");
		for(int i = 0; i < Categories.size(); i++) {
			System.out.println(Categories.get(i).getName());
		}
	}  
	static private void printProducts(Category c) {
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
	private void addProduct(Product product) {
		Products.add(product);
	}
	static private Category searchCategories(String name) {
		Category category = new Category(name);
		for(int i = 0; i < Categories.size(); i++) {
			if(name.equals(Categories.get(i).getName())) {
				category = Categories.get(i);
			}
			else {
				category=null;
			}
		}
	return category;
	}
	static private Product searchProducts(String name) {
		Product searched = new Product("",name, 0, 0);
		for(int i = 0; i < Categories.size(); i++) {
			for(int j = 0; j < Categories.get(i).getProducts().size(); j++) {
				if(name.equals(Categories.get(i).getProducts().get(j).getName())){
					searched = Categories.get(i).getProducts().get(j);
				}
				else {
					searched=null;
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
		if(selC1 == null) {
			
		} else {
			printProducts(selC1);
			System.out.print("Select product: ");
			Scanner sc2 = new Scanner(System.in);
			String selP;
			selP = sc2.nextLine();
			Product selP1;
			selP1 = searchProducts(selP);
			if(selP1 == null) {
	
				
			} 
			else {
				User.Users.get(User.selL).getBasket().add(selP1);
				selP1.quantity--;
				if(selP1.quantity==0) {
				selC1.getProducts().remove(selP1);
				}
			}
		}
		
	}
	static public class Product {
		 String name;
		 int id;
		 float price;
		 String selC;
		 Category selC1;
		 String selP;
		 int quantity;
		 int select;
		 static String category;
		 static boolean euro=true;
		 static boolean dollar=false;
		 static boolean pound=false;
		
		boolean exist=true;
		
		public Product(String category, String name, float price, int quantity){
			this.category=category;
			this.name=name;
			this.price=price;
			this.quantity=quantity;
			for(int i = 0; i < Category.Categories.size(); i++) {
			if(category.equals(Category.Categories.get(i).getName())) {
				Category.Categories.get(i).addProduct(this);
		}
			else{
				Category.Categories.add(new Category(category));
			}
		}
}
		
		
		
		public  void setName(String name1) {
			name = name1;
		}

		public  void setQuantity(int quantity1) {
			quantity = quantity1;
		}
		
		 String getName() {
			return name;
		}
		
		int getId() {
			return id;
		}
		
		int getQuantity() {
			return quantity;
		}
		
		 public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			this.price = price;
		}

		 
		 public String getCategory() {
			return category;
		}

		public static void setCategory(String category1) {
			category = category1;
		}

		static void sellProduct() {
			Product selP1=new Product ("","",0,0);
			System.out.print("Add name: ");
			Scanner sc2 = new Scanner(System.in);
			selP1.setName(sc2.nextLine());
			System.out.print("Add quantity: ");
			Scanner sc3 = new Scanner(System.in);
			selP1.setQuantity(sc3.nextInt());
			System.out.print("Add price: ");
			Scanner sc4 = new Scanner(System.in);
			selP1.setPrice(sc4.nextFloat());
			System.out.print("In wich category: ");
			Scanner sc5 = new Scanner(System.in);
			setCategory(sc5.nextLine());
			Product selP2=new Product(selP1.getCategory(), selP1.getName(), selP1.getPrice(), selP1.getQuantity());
			Scanner sc1 = new Scanner(System.in);
			Category selC1;
			selC1 = Category.searchCategories(selP2.getCategory());
			if(selC1 == null) {
				Category.Categories.add(new Category(selP2.getCategory()));
			} 
			else {
				selC1.getProducts().add(selP2);
			}
		}
		
		 
		
		 static void currency() {
	      int select;
			System.out.println("Choose an option");
		    System.out.println("   1. € ");
			System.out.println("   2. $");
			System.out.println("   3. £");
			Scanner sc1 = new Scanner(System.in);
			select = sc1.nextInt();
			
		    switch(select) {
		    
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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Product("Lapices", "Verde", 2,2);
		new Product("Rotuladores","Rojo",3,3);
		printCategories();
	}

}
