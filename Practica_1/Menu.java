package com.nebrija.lfg;
import java.util.Scanner;

public class Menu {
	static int select;
	static String exit;

	static void menuP() {
			do {
				System.out.println("Choose an option");
			    System.out.println("   1. Buy ");
				System.out.println("   2. Sell");
				System.out.println("   3. Basket");
				System.out.println("   4. €/$/£");
				System.out.println("   5. Exit");
				Scanner sc = new Scanner(System.in);
				select = sc.nextInt();
				
			    switch(select) {
					case 1:
						Product.buyP();
				break;
					case 2:
						Product.sellP();		  		
			    case 3:
			    	Product.showB();
			    	break;
			    case 4:
			    	Product.currency();
			    case 5:
			    	
			    }	
				}while(select!=5);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
