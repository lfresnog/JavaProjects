package com.nebrija.src;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Language {
	private static int select;
	
	
	static void selectLanguage(){
		
		System.out.println(Main.getIntroLabels().getString("option"));
		System.out.println(Main.getIntroLabels().getString("spanish"));
		System.out.println(Main.getIntroLabels().getString("english"));
		Scanner sc = new Scanner(System.in);
		select = sc.nextInt();
		switch(select) {
		case 1:
			Locale currentLocale = new Locale("es", "ES");
			Main.introLabels = ResourceBundle.getBundle("MessagesBundle", currentLocale);
			break;
		case 2:
			currentLocale = new Locale("en", "US");
			Main.introLabels = ResourceBundle.getBundle("MessagesBundle", currentLocale);
			break;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
