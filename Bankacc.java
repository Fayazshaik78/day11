package com.costractor;

public class Bankacc {
	double balance;
	String customerName;
	String address;
	
	public Bankacc(double bal , String nm , String add) {
		System.out.println("... parametized Custructor");
		balance = bal;
		customerName=nm;
		address=add;
		

}
	public Bankacc() {
		balance = 0;
		customerName = "NA";
		address="NA";
		
		
		
	}
	public void withdraw(double ammount) {
		if(ammount <=0) {
			System.out.println("invalid ammount withdraw faild ");
		}
		else if (ammount > balance) {
			System.out.println("insafficent funds. withdraw failed");
			
			
		}
		else {
			balance -= ammount;
			System.out.println("withdraw :"+ ammount + "balance"+ balance);
			
		}
	}
	
		public void deposite(double ammount) {
			if(ammount >0) {
				balance += ammount;
				System.out.println("depposite : " +ammount + "balance :" + balance);
				
			}
			else {
					System.out.println("invalid ammount .dipposite faild ");
					
				
				}
		}
			
		public void updateAddress(String newAddress)	{
			
			address = newAddress;
			System.out.println("address updated successfully to :" + newAddress);
			
			
			
		}
		public void updateCustomerName(String newCustomerName) {
			customerName = newCustomerName;
			System.out.println("Customer name updated successfully to :"+ newCustomerName);
			
		}
		public void displayAccountInfo() {
	        System.out.println("Customer Name: " + customerName);
	        System.out.println("Address: " + address);
	        System.out.println("Balance: " + balance);
	    }
		 
		public static void main(String[] args) {
			
			Bankacc bank = new Bankacc(3000, "fayaz" , "amberpet");
			bank.deposite(5000); 
			bank.deposite(1000);
			bank.withdraw(2200);
			bank.withdraw(200);
			bank.updateAddress("amberpet branch");
			bank.updateCustomerName("fayaz");
			bank.displayAccountInfo();
		}
				
		
			
	
		
	}
		



