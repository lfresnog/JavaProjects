package com.nebrija.jp;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User extends Language{
	private  String email;
	private  String name;
	private  String password;
	List<Product> basket = new ArrayList<>();
    public static List<User> Users=new ArrayList<>();
	private static  int selS=0;
	public static int selL=0;
	
	User(String name, String email, String password){
		this.name=name;
		this.email=email;
		this.password=password;
		List<Product> basket1 = new ArrayList<>();
		this.basket=basket1;
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
	
	public static void logIn(String User, String Password) {
		selL=0;
		do {
		 selL++;		
		}
		while(selL<selS&&!Users.get(selL).getName().equals(User)&&!Users.get(selL).getPassword().equals(Password));
        if(selS==0) {
        	if(Users.get(0).getName().equals(User)&&Users.get(0).getPassword().equals(Password)) {
    			System.out.println("Welcome "+ Users.get(0).getName());
    			selL=0;
    			Product.menuP();
    		}
    		else{
    		    System.out.println("The user/password is incorrect.");
    		}
        }
        else if(Users.get(selL).getName().equals(User)&&Users.get(selL).getPassword().equals(Password)) {
			System.out.println("Welcome "+ Users.get(selL).getName());
			Product.menuP();
		}
		else{
		    System.out.println("The user/password is incorrect.");
		}
        
	}
	
	static void signIn(String user, String email, String password) {
   	
			Users.add(selS,new User(user, email, password));
    }
	
	void printUsers() {
		for(int i=0;i<Users.size();i++) {
			System.out.println(Users.get(i).getName());
			System.out.println(Users.get(i).getEmail());
			System.out.println(Users.get(i).getPassword());
		}
	}
	
	 void showBasket() {
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
	
	

	/*void userMenu() {	 
		int select;
		do {
		System.out.println(UserMenu0);
	    System.out.println(UserMenu1);
		System.out.println(UserMenu2);
		System.out.println(UserMenu3);
		Scanner sc = new Scanner(System.in);
		select = sc.nextInt();
		
	    switch(select) {
			case 1:
			logIn();
		break;
			case 2:
			signIn(); 
			  		
	    case 3:
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
	*/


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User t=new User("","","");
		t.Users.add(0,new User("luis", "luis@gmail.com", "123"));
		t.Users.get(0).getBasket().add(new Product("Lapices", "Lapiz Rojo", 1, 2 ));
		t.Users.get(0).getBasket().add(new Product("Lapices", "Lapiz Verde", 5, 3 ));
		//t.userMenu();
	}

}
