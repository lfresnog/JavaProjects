package com.nebrija.jp;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	
	void testUser() {
		User test=new User("test","test","test");
		test.Users.add(0,test);
		test.Users.get(0).getBasket().add(new Product("Lapices", "Lapiz Rojo", 1, 2 ));
		test.Users.get(0).getBasket().add(new Product("Lapices", "Lapiz Verde", 5, 3 ));
				
		assertEquals(test.getName(),"test");
		assertEquals(test.getEmail(),"test");
		assertEquals(test.getPassword(),"test");
		assertEquals(test.getBasket().get(0).getName(),"Lapiz Rojo");
		assertEquals(test.getBasket().get(1).getPrice(),5);
	}
	void testCategory() {
		Category test=new Category("test");
		test.Categories.add(0,test);
		test.Categories.get(0).getProducts().add(new Product("Lapices", "Lapiz Rojo", 1, 2 ));
		test.Categories.get(1).getProducts().add(new Product("Lapices", "Lapiz Verde", 5, 3 ));
				
		assertEquals(test.getName(),"test");
		assertEquals(test.getProducts().get(0).getName(),"Lapiz Rojo");
		assertEquals(test.getProducts().get(1).getQuantity(),3);
	}
	
}
