package com.nebrija.src;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class User {
	private static  String email;
	private static  String name;
	private static  String password;
	private List<Product> basket;
    public static final List<User> Users=new ArrayList<>();
	private static  int selS=0;
	public static int selL=0;
	static boolean exist;
	
	
	public static List<User> getUsers() {
		return Users;
	}

	public static boolean isExist() {
		return exist;
	}

	User(String name, String email, String password){
		this.name=name;
		this.email=email;
		this.password=password;
		this.basket=new ArrayList<Product>();
	}
	
	public List<Product> getBasket() {
		return basket;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public static void logIn(String email, String password) {
		selL=0;
		
		if(Users.isEmpty()) {
    		System.out.println("The user/password is incorrect.");
		    exist=false;
		    userMenu();
    	}
		else {
			for(int i = 0; i < Users.size(); i++) {
				if(Users.get(i).getName().equals(email)&&Users.get(i).getPassword().equals(password)) {
	    			System.out.println("Welcome "+ Users.get(i).getName());
	    			selL=i;
	    			exist=true;
	    			userMenu();
	    		}
	    		else{
	    		    System.out.println("The user/password is incorrect.");
	    		    exist=false;
	    		    userMenu();
	    		}
			}
		}
        
	}
	
	public static void signIn(String user, String email, String password) {
   	
			Users.add(new User(user, email, password));
			selS++;
    }
	
	private static void printUsers() {
		for(int i=0;i<Users.size();i++) {
			System.out.println(Users.get(i).getName());
			System.out.println(Users.get(i).getEmail());
			System.out.println(Users.get(i).getPassword());
		}
	}
	
	 public static void showBasket() {
		System.out.println("-- Basket --");
		if (Users.get(selL).getBasket().size() > 0) {
			for(int i = 0; i < Users.get(selL).getBasket().size(); i++) {
				if(Product.euro) {
				System.out.println(Users.get(selL).getBasket().get(i).getName()+"  "+Users.get(selL).getBasket().get(i).getPrice()+"€   x"+Users.get(selL).getBasket().get(i).getQuantity());
				}
				else if(Product.dollar) {
					System.out.println(Users.get(selL).getBasket().get(i).getName()+"  "+Users.get(selL).getBasket().get(i).getPrice()+"$   x"+Users.get(selL).getBasket().get(i).getQuantity());
					}
				else if(Product.pound) {
					System.out.println(Users.get(selL).getBasket().get(i).getName()+"  "+Users.get(selL).getBasket().get(i).getPrice()+"£   x"+Users.get(selL).getBasket().get(i).getQuantity());
					}
			}
		} else {
			System.out.println("Empty");
		}
	}
	
	
	 public static void userMenu() {	 
		int select;
		do {
			
		String label = Main.getIntroLabels().getString("option");
		System.out.println(label);
		label = Main.getIntroLabels().getString("hi");
		System.out.println(label);
		label = Main.getIntroLabels().getString("log");
	    System.out.println(label);
	    label = Main.getIntroLabels().getString("sign");
		System.out.println(label);
		label = Main.getIntroLabels().getString("exit");
		System.out.println(label);
		Scanner sc = new Scanner(System.in);
		select = sc.nextInt();
		
	    switch(select) {
			case 1:
			label = Main.getIntroLabels().getString("getEmail");
			System.out.println(label);
			sc = new Scanner(System.in);
			email = sc.nextLine();
			label = Main.getIntroLabels().getString("getPassword");
			System.out.println(label);
			sc = new Scanner(System.in);
			password = sc.nextLine();
			logIn(email, password);
		break;
		
			case 2:
			label = Main.getIntroLabels().getString("getUser");
			System.out.println(label);
			sc = new Scanner(System.in);
			name = sc.nextLine();
			label = Main.getIntroLabels().getString("getEmail");
			System.out.println(label);
			sc = new Scanner(System.in);
			email = sc.nextLine();
			label = Main.getIntroLabels().getString("getPassword");
			sc = new Scanner(System.in);
			System.out.println(label);
			password = sc.nextLine();
			signIn(name, email, password); 
			break;
			  		
	    case 3:
	    	Main.main();
	    	break;
	    case 4:
	    	printUsers();
	    	break;
	    case 5:
	    	showBasket();
	    	break;
	    	
		}
		}while(select!=3);
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
			}

}
