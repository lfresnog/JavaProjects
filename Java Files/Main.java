package com.nebrija.jp;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Category> c1=Category.getInstance();
		User t=new User("","","");
		Category Books=new Category("Books");
		c1.add(Books);
		Books.getProducts().add(new Book("Books","La historia interminable",2,2,631,"Michael Ende"));
		Category Films=new Category("Films");
		c1.add(Books);
		Books.getProducts().add(new Book("Films","Cadena Perpetua",2,2,144,"Frank Darabont"));
		
		c1.add(new Category("Films"));
		t.Users.add(0,new User("luis", "luis@gmail.com", "123"));
		t.Users.get(0).getBasket().add(new Product("Lapices", "Lapiz Rojo", 1, 2 ));
		t.Users.get(0).getBasket().add(new Product("Lapices", "Lapiz Verde", 5, 3 ));
		t.userMenu();
	}

}
