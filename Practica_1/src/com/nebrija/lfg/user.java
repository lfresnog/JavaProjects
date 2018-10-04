package com.nebrija.lfg;
import java.io.FileReader;
import java.util.Properties;

public class user {
	
	public static void main(String[] args) {
		
	 try(FileReader reader =  new FileReader("data")) {
		 
	        Properties properties = new Properties();
	        properties.load(reader);
	        
	        String email = properties.getProperty("email");
	        String user = properties.getProperty("user");
	        String password = properties.getProperty("password");

	        System.out.println(email);
	        System.out.println(user);
	        System.out.println(password);

	       }
	 
	 catch (Exception e) {
		 
	       e.printStackTrace();
	       
	       }
	}
}