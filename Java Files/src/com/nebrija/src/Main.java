package com.nebrija.src;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
	static int select;
	static Locale currentLocale = new Locale("es", "ES");
	static ResourceBundle introLabels = ResourceBundle.getBundle("MessagesBundle_es_ES");
	public Locale getCurrentLocale() {
		return currentLocale;
	}
	public static ResourceBundle getIntroLabels() {
		return introLabels;
	}
	static void main() {
	do {
	String label = Main.getIntroLabels().getString("option");
	System.out.println(label);
	label = Main.getIntroLabels().getString("warehouse");
	System.out.println(label);
	label = Main.getIntroLabels().getString("language");
    System.out.println(label);
    label = Main.getIntroLabels().getString("exit");
    System.out.println(label);
    Scanner sc = new Scanner(System.in);
	select = sc.nextInt();
	
		switch(select) {
			case 1:
				User.userMenu();
				break;
			case 2:
				Language.selectLanguage();
				break;
			case 3:
				break;
		}
	}while(select!=3);
	}

	public static void main(String[] args) {
		main();
	
	}
		
	}
