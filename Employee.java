package com.costractor;

public class Employee {
	String name;
	double salary;
	
	public Employee(String na, double sal) {
		this.name =  na;
		this.salary = sal;
		if(salary < 0 ) {
			salary = 0;
			
		}}
		public void displayDetails() {
			System.out.println("Name :"+name);
			System.out.println("salary : "+salary );
			
			
		}
		public static void main(String[] args) {
			Employee e = new  Employee("fayaz ", 200.4);
			e.displayDetails();
		}
	}
	


