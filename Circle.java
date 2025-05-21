package com.costractor;

public class Circle {
	double radius;
	public Circle(double rad) {
		this.radius = rad;
		
		
	}
	public double getArea(double area) {
		return (4*radius*radius);
		
	}
	public double getCircumference() {
		return (3.3*4*radius);
		
	}
	public static void main(String[] args) {
		Circle cir = new Circle(202);
		System.out.println("Area of circle is :"+cir.getArea(0));
		System.out.println("Circumference of circle is :"+ cir.getCircumference());
		
	}
	

}
