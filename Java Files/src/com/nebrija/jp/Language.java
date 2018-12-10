package com.nebrija.jp;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Language {
	static String UserMenu0 = null;
	static String UserMenu1 = null;
	static String UserMenu2 = null;
	static String UserMenu3 = null;
	static String Menu0 = null;
	static String Menu1 = null;
	static String Menu2 = null;
	static String Menu3 = null;
	static String Menu4 = null;
	static String Menu5 = null;
	
	static protected void setSpanish() {
		Properties spanish = new Properties();
		FileReader fich = null;
		try {
			fich = new FileReader("Languages\\ES.txt");
			spanish.load(fich);
			UserMenu0 = spanish.getProperty("UserMenu0");
			UserMenu1 = spanish.getProperty("UserMenu1");
			UserMenu2 = spanish.getProperty("UserMenu2");
			UserMenu3 = spanish.getProperty("UserMenu3");
			Menu0 = spanish.getProperty("Menu0");
			Menu1 = spanish.getProperty("Menu1");
			Menu2 = spanish.getProperty("Menu2");
			Menu3 = spanish.getProperty("Menu3");
			Menu4 = spanish.getProperty("Menu4");
			Menu5 = spanish.getProperty("Menu5");
	} catch (IOException e) {
		System.out.println("Error");
		}
	}
		static protected void setEnglish() {
			Properties english = new Properties();
			FileReader fich = null;
			try {
				fich = new FileReader("Languages\\EN.txt");
				english.load(fich);
				UserMenu0 = english.getProperty("UserMenu0");
				UserMenu1 = english.getProperty("UserMenu1");
				UserMenu2 = english.getProperty("UserMenu2");
				UserMenu3 = english.getProperty("UserMenu3");
				Menu0 = english.getProperty("Menu0");
				Menu1 = english.getProperty("Menu1");
				Menu2 = english.getProperty("Menu2");
				Menu3 = english.getProperty("Menu3");
				Menu4 = english.getProperty("Menu4");
				Menu5 = english.getProperty("Menu5");
		} catch (IOException e) {
			System.out.println("Error");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
