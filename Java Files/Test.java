package com.nebrija.jp;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	
	void testUser() {
		User test1=new User("test","test","test");
		test1.Users.add(0,test1);
		test1.Users.get(0).getBasket().add(new Product("Lapices", "Lapiz Rojo", 1, 2 ));
		test1.Users.get(0).getBasket().add(new Product("Lapices", "Lapiz Verde", 5, 3 ));
		
		assertEquals(test1.getName(),"test");
		assertEquals(test1.getEmail(),"test");
		assertEquals(test1.getPassword(),"test");
		assertEquals(test1.getBasket().get(0).getName(),"Lapiz Rojo");
		assertEquals(test1.getBasket().get(1).getPrice(),5);
	}
		
		
	void testMenu() {	
		Category test=new Category("l");
		Category test0=new Category("v");
		test.Categories.add(0,test);
		test.Categories.add(1,test0);
		test.Categories.get(0).getProducts().add(new Product("Lapices", "Lapiz Rojo", 1, 2 ));
		test.Categories.get(1).getProducts().add(new Product("Lapices", "Lapiz Verde", 5, 3 ));
		test.Categories.get(0).buyProduct();
		
		assertEquals(test.Categories.get(0).getName(),"l");
		assertEquals(test.Categories.get(1).getName(),"v");
		assertEquals(test.getProducts().get(0).getName(),"Lapiz Rojo");
		assertEquals(test.getProducts().get(1).getQuantity(),3);
		assertEquals(test.getProducts().get(0).getQuantity(), 1);
	}	
}
