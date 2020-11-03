package com.human.ex;
class Rectangle{
	public double height =20;
	public double width =40;
	public double periphery() {
		return 2*height+2*width;
	}
	public double area() {
		return height*width;
	}
}
class Triangle{
	public double height =20;
	public double width =40;
	public double area() {
		return height*width/2;
	}
}
class Circle{
	public double radius =20;
	public double length() {
		return 2*radius*Math.PI;
	}
	public double square() {
		return Math.PI*radius*radius;
	}
}
public class Java1103 {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		r1.height=30;
		r1.width=40;
		System.out.println(r1.area());
		System.out.println(r1.periphery());

		r2.height=20;
		r2.width=30;
		System.out.println(r2.area());
		System.out.println(r2.periphery());
		
		//삼각형, 원 클래스를 만들어 보자
		Triangle r3=new Triangle();
		Triangle r4=new Triangle();
		r3.height=30;
		r3.width=40;
		System.out.println(r3.area());

		r4.height=20;
		r4.width=30;
		System.out.println(r4.area());
		
		
		
		Circle r5=new Circle();
		Circle r6=new Circle();
		r5.radius=30;
		System.out.println(r5.length());
		System.out.println(r5.square());
		
		r6.radius=10;
		System.out.println(r6.length());
		System.out.println(r6.square());
		
		
		// 직사각형 넓이 둘레를 구하는 프로그램을 만들어보자.
		//height=40;
		//width=50;
		//System.out.println(area());
		//System.out.println(periphery());

	}

}
