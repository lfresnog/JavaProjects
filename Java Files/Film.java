package com.nebrija.jp;

import java.util.Scanner;

public class Film extends Product{
	
		public int time;
		public String director;
		
		Film(String category, String name, float price, int quantity, int pages, String autor) {
			super(category, name, price, quantity);
			this.time=time;
			this.director=director;
		}
		
		static void addFilm(){
			Film f1=new Film ("","",0,0,0,"");
			System.out.print("Add name: ");
			Scanner sc2 = new Scanner(System.in);
			f1.setName(sc2.nextLine());
			System.out.print("Add quantity: ");
			Scanner sc3 = new Scanner(System.in);
			f1.setQuantity(sc3.nextInt());
			System.out.print("Add price: ");
			Scanner sc4 = new Scanner(System.in);
			f1.setPrice(sc4.nextFloat());
			System.out.print("In wich category: ");
			Scanner sc5 = new Scanner(System.in);
			f1.setCategory(sc5.nextLine());
			System.out.print("Time(min): ");
			Scanner sc6 = new Scanner(System.in);
			f1.setTime(sc6.nextInt());
			System.out.print("Director: ");
			Scanner sc7 = new Scanner(System.in);
			f1.setDirector(sc7.nextLine());
			Scanner sc1 = new Scanner(System.in);
			Category selC1;
			selC1 = Category.searchCategories(f1.getCategory());
		    selC1.getProducts().add(f1);
		}

		public int getTime() {
			return time;
		}

		public void setTime(int time) {
			this.time = time;
		}

		public String getDirector() {
			return director;
		}

		public void setDirector(String director) {
			this.director = director;
		}

}
