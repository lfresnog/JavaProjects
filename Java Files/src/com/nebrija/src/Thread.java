package com.nebrija.src;

public class Thread{
	
	 class Client {
		 private String name;
		 private Product compra;
		 boolean test=false;
		 
		 public Client(String name, Product compra) {
				this.name = name;
				this.compra = compra;
				
			}
		 String getName() {
			 return name;
		 }
		 Product getCompra() {
			 return compra;
		 }
		
	}
	 
	 class Cashier extends Thread{
		 private int name;
		 public Cashier(int name) {
			 this.name=name;
		 }
		 
		 public void cash(Cashier cajera,Client cliente) {
			 cajera.join();
			 System.out.println("El producto" + cliente.getCompra().getName() + " ha sido cobrado por la cajera " + cajera.name + " al cliente " + cliente.getName());
			 cliente.test=true;
			 try {
				 Thread.sleep(200);
			 }catch(InterruptedException e) {
				 e.printStackTrace();
			 }
		 }
		 class Cashier2 extends Thread{
			 private Thread cajera;
			 public Cashier2(Thread cajera) {
				 this.cajera=cajera;
			 }
		 }
	 }
	
	private Client cliente;
	private Cashier cajera;

	public Thread(Cashier cajera, Client cliente){
		this.cajera=cajera;
		this.cliente=cliente;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client c1=new Client("A",new Product("Rotulador","Rotulador Verde",1,1));
		Client c2=new Client("B",new Product("Lapices","Lapiz Verde",1,1));
		Cashier cs1= new Cashier(1);
		Runnable p1 = new Thread(cs1, c1);
		Runnable p2 = new Thread(cs1, c2);
		new Thread(p1).start();
		new Thread(p2).start();
		System.out.println("Tareas terminadas");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.cajera.cash(this.cliente);
	}

}
