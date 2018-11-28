package com.nebrija.jp;

import java.util.Scanner;

public class Book extends Product {
	public int pages;
	public String autor;
	
	Book(String category, String name, float price, int quantity, int pages, String autor) {
		super(category, name, price, quantity);
		this.pages=pages;
		this.autor=autor;
	}
	
	static void addBook(){
		Book b1=new Book ("","",0,0,0,"");
		System.out.print("Add name: ");
		Scanner sc2 = new Scanner(System.in);
		b1.setName(sc2.nextLine());
		System.out.print("Add quantity: ");
		Scanner sc3 = new Scanner(System.in);
		b1.setQuantity(sc3.nextInt());
		System.out.print("Add price: ");
		Scanner sc4 = new Scanner(System.in);
		b1.setPrice(sc4.nextFloat());
		System.out.print("In wich category: ");
		Scanner sc5 = new Scanner(System.in);
		b1.setCategory(sc5.nextLine());
		System.out.print("Pages: ");
		Scanner sc6 = new Scanner(System.in);
		b1.setPages(sc6.nextInt());
		System.out.print("Autor: ");
		Scanner sc7 = new Scanner(System.in);
		b1.setAutor(sc7.nextLine());
		Scanner sc1 = new Scanner(System.in);
		Category selC1;
		selC1 = Category.searchCategories(b1.getCategory());
	    selC1.getProducts().add(b1);
		
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
