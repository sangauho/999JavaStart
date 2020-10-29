package com.human.ex;

public class Java1029 {
	public static void functionA() {
		System.out.println("A함수 시작");
		functionB();
		System.out.println("A함수 종료");
	}
	public static void functionB() {
		System.out.println("B함수 시작");
		System.out.println("B함수 종료");
	}
	public static void functionC() {
		System.out.println("C함수 시작");
		System.out.println("C함수 종료");
	}
	public static void functionD() {
		System.out.println("D함수 시작");
		System.out.println("D함수 종료");
	}
	public static void main(String[] args) {
		System.out.println("함수 시작");
		functionA();
		functionC();
		functionD();
		System.out.println("함수 종료");
	}

}
