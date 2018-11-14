package com.nebrija.jp;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User t=new User("","","");
		Category.Categories.add(new Category("Lapices"));
		t.Users.add(0,new User("luis", "luis@gmail.com", "123"));
		t.Users.get(0).getBasket().add(new Product("Lapices", "Lapiz Rojo", 1, 2 ));
		t.Users.get(0).getBasket().add(new Product("Lapices", "Lapiz Verde", 5, 3 ));
		t.userMenu();
	}

}
