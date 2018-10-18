package com.nebrija.lfg;
import java.util.Scanner;


public class user {
	private String email;
	private String name;
	private String password;
    private Boolean exist;
    static String emailt;
	static String passwordt;
	static String namet;
	static user[] users = new user[5];
	static int selS;
	static int selL;
    
	
	user(String name, String email, String password, Boolean exist){
		this.name=name;
		this.email=email;
		this.password=password;
		this.exist=exist;
	}
	
	
	static void login() {
		int i=-1;
		System.out.println("Introduce your email: ");
		Scanner sc1 = new Scanner(System.in);
		emailt = sc1.nextLine();
		System.out.println("Introduce your password: ");
	    Scanner sc2 = new Scanner(System.in);
		passwordt = sc2.nextLine();
		do {
		 i=i+1;		
		}while(i<=5&&!users[i].email.equals(emailt)&&!users[i].password.equals(passwordt));
		
		if(users[i].email.equals(emailt)&&users[i].password.equals(passwordt)) {
			System.out.println("WELCOME");
		
		}
		else{
		    System.out.println("ERROR ERROR ERROR");
		}
	}
	
	
    static void signin() {
    	selS=0;
		System.out.println("Introduce your email: ");
		Scanner sc3 = new Scanner(System.in);
		emailt = sc3.nextLine();
		System.out.println("Introduce your password: ");
	    Scanner sc4 = new Scanner(System.in);
		passwordt = sc4.nextLine();
		System.out.println("Introduce your name: ");
		Scanner sc5 = new Scanner(System.in);
		namet = sc5.nextLine();
		if(users[selS].exist=true) {
			selS++;
		}
		else{
		
		}
    }
    
    
	static void Usermenu() {
	int select;
	users[0]=new user("luis", "luis@gmail.com", "password", true);
	do {
	System.out.println("Welcome to THE WAREHOUSE");
    System.out.println("   1. Log in ");
	System.out.println("   2. Sign in");
	System.out.println("   3. Exit");
	Scanner sc = new Scanner(System.in);
	select = sc.nextInt();
	
    switch(select) {
		case 1:
			int selL=0;
			System.out.println("Introduce your email: ");
			Scanner sc1 = new Scanner(System.in);
			emailt = sc1.nextLine();
			System.out.println("Introduce your password: ");
		    Scanner sc2 = new Scanner(System.in);
			passwordt = sc2.nextLine();
			do {
			 selL++;		
			}while(selL<=5&&!users[selL].email.equals(emailt)&&!users[selL].password.equals(passwordt));
			
			if(users[selL].email.equals(emailt)&&users[selL].password.equals(passwordt)) {
				System.out.println("WELCOME");
			
			}
			else{
			    System.out.println("ERROR ERROR ERROR");
			}
	break;
		case 2:
			selS=0;
			System.out.println("Introduce your email: ");
			Scanner sc3 = new Scanner(System.in);
			emailt = sc3.nextLine();
			System.out.println("Introduce your password: ");
		    Scanner sc4 = new Scanner(System.in);
			passwordt = sc4.nextLine();
			System.out.println("Introduce your name: ");
			Scanner sc5 = new Scanner(System.in);
			namet = sc5.nextLine();
			
			do {
				selS++;
			}while((selS<=5&&users[selS].exist==true));
			
			users[selS]=new user(namet, emailt, passwordt, true);
			
			
    case 3:
    	break;
	}
	}while(select!=3);
	}
    
	public static void main(String[] args) {
	Usermenu();	
	 
	}
}