package com.human.ex;

public class Java1029 {
	public static void functionA() {
		System.out.println("A�Լ� ����");
		functionB();
		System.out.println("A�Լ� ����");
	}
	public static void functionB() {
		System.out.println("B�Լ� ����");
		System.out.println("B�Լ� ����");
	}
	public static void functionC() {
		System.out.println("C�Լ� ����");
		System.out.println("C�Լ� ����");
	}
	public static void functionD() {
		System.out.println("D�Լ� ����");
		System.out.println("D�Լ� ����");
	}
	public static void main(String[] args) {
		System.out.println("�Լ� ����");
		functionA();
		functionC();
		functionD();
		System.out.println("�Լ� ����");
	}

}
