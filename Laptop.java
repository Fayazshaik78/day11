package com.costractor;
import java.util.Scanner;

public class Laptop {
	String brand;
	int ramsize;
	
	public Laptop(String br,int ram) {
		this.brand = br;
		this.ramsize=ram;
		
		
	}
	public void showSpace() {
		System.out.println("brand : "+brand);
		System.out.println("ramsize :"+ramsize);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter brand name:\n");
		String brand =sc.next();
		System.out.println("Enter ramSize:\n");
		int ramSize=sc.nextInt();
		Laptop lap=new Laptop(brand,ramSize);
		Laptop lap1 = new Laptop(" dell", 12);
	
		lap.showSpace();
		lap1.showSpace();
		sc.close();
	}

}
