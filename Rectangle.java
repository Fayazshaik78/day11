package com.costractor;

public class Rectangle {
	int length ;
	int breadth;
public Rectangle () {
	length = 2;
	breadth = 3;
	
}
public Rectangle(int len, int bre) {
	length = len;
	breadth = bre;
}
public int area() {
	return length*breadth;
}

	public static void main(String[] args) {
	Rectangle rect = new Rectangle();
	Rectangle rect1 = new Rectangle(4,2);
	System.out.println("Defalut constractor values :"+ rect.area());
	System.out.println("parmitized constractor value "+ rect1.area());	
		
	}
	
	
	
	

}
