package com.nebrija.src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserTest {

	@Test
	void test() {
		User.logIn("root@gmail.com", "toor");
		assertEquals(User.isExist(),false);
		User.signIn("root", "root@gmail.com", "toor");
		assertEquals(User.getUsers().get(0).getName(), "root");
		User.logIn("root@gmail.com", "toor");
		assertEquals(User.isExist(),true);
	}

}
