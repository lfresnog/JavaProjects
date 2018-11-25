package com.nebrija.jp;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
	private  String email;
	private  String name;
	private  String password;
	private Boolean exist;
	List<Product> basket = new ArrayList<Product>();
    static public List<User> Users=new ArrayList<>();
	private  int selS=0;
	public static int selL=0;

	User(String name, String email, String password){
		this.name=name;
		this.email=email;
		this.password=password;
		exist = new Boolean(true);
		List<Product> basketU = new ArrayList<Product>();
		basket=basketU;
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

	private void logIn() {
		selL=0;
		System.out.println("Introduce your email: ");
		Scanner sc1 = new Scanner(System.in);
		setEmail(sc1.nextLine());
		System.out.println("Introduce your password: ");
	    Scanner sc2=new Scanner(System.in);
		setPassword(sc2.nextLine());
		do {
		 selL++;
		}
		while(selL<selS&&!Users.get(selL).getEmail().equals(email)&&!Users.get(selL).getPassword().equals(password));
        if(selS==0) {
        	if(Users.get(0).getEmail().equals(email)&&Users.get(0).getPassword().equals(password)) {
    			System.out.println("Welcome "+ Users.get(0).getName());
    			selL=0;
    			Product.menuP();
    		}
    		else{
    		    System.out.println("The user/password is incorrect.");
    		}
        }
        else if(Users.get(selL).getEmail().equals(email)&&Users.get(selL).getPassword().equals(password)) {
			System.out.println("Welcome "+ Users.get(selL).getName());
			Product.menuP();
		}
		else{
		    System.out.println("The user/password is incorrect.");
		}

	}

	private void signIn() {
    	if (Users.get(selS).exist==true) {
			  selS++;
		  }

    	    System.out.println("Introduce your email: ");
			Scanner sc3 = new Scanner(System.in);
			setEmail(sc3.nextLine());
			System.out.println("Introduce your name: ");
		    Scanner sc4 = new Scanner(System.in);
		    setName(sc4.nextLine());
			System.out.println("Introduce your password: ");
			Scanner sc5 = new Scanner(System.in);
			setPassword(sc5.nextLine());

			Users.add(selS,new User(getName(), getEmail(), getPassword()));
    }

	void printUsers() {
		for(int i=0;i<Users.size();i++) {
			System.out.println(Users.get(i).getName());
			System.out.println(Users.get(i).getEmail());
			System.out.println(Users.get(i).getPassword());
		}
	} /*you could use toString() method to print if you add it to the class and the code would be much simpler:
       System.out.println(Users.get(i).toString())
	  */


	 void showBasket() {
		System.out.println("-- Basket --");
		if (Users.get(selL).getBasket().size() > 0) {
			for(int i = 0; i < Users.get(selL).getBasket().size(); i++) {
				if(Product.euro==true) {
				System.out.println(Users.get(selL).getBasket().get(i).getName()+"  "+Users.get(selL).getBasket().get(i).getPrice()+"�   x"+Users.get(selL).getBasket().get(i).getQuantity());
				}
				else if(Product.dollar==true) {
					System.out.println(Users.get(selL).getBasket().get(i).getName()+"  "+Users.get(selL).getBasket().get(i).getPrice()+"$   x"+Users.get(selL).getBasket().get(i).getQuantity());
					}
				else if(Product.pound==true) {
					System.out.println(Users.get(selL).getBasket().get(i).getName()+"  "+Users.get(selL).getBasket().get(i).getPrice()+"�   x"+Users.get(selL).getBasket().get(i).getQuantity());
					}
			}
		} else {
			System.out.println("Empty");
		}
	}



	void userMenu() {
		int select;
		do {
		System.out.println("Welcome to THE WAREHOUSE");
	    System.out.println("   1. Log in ");
		System.out.println("   2. Sign in");
		System.out.println("   3. Exit");
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


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User t=new User("","","");
		t.Users.add(0,new User("luis", "luis@gmail.com", "123"));
		t.Users.get(0).getBasket().add(new Product("Lapices", "Lapiz Rojo", 1, 2 ));
		t.Users.get(0).getBasket().add(new Product("Lapices", "Lapiz Verde", 5, 3 ));
		t.userMenu();
	}

}
