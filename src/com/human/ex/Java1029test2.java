package com.human.ex;
import java.util.*;

public class Java1029test2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String[] a1 = new String[100];
		String[] a2 = new String[100];
		int[] a3 = new int[100];
		a1[0]="admin";	a1[1]="rlfehd1";	a1[2]="rlfehd2";
		a2[0]="0000";	a2[1]="1111";		a2[2]="2222";
		a3[0]=0;		a3[1]=142000;		a3[2]=534000;
		int w=0,x=1,y=2,z=1;
		System.out.print("id>>");
		String b=scanner.next();
		while(x==1) {
			for(int i=0;i<a1.length;i++) {
				if(b.equals(a1[i])) {
					w=i;
					break;
				}else {}
			}
			if(b.equals("exit")){
				x=end();
				break;
			}else if(b.equals(a1[w])) {
				System.out.print("pw>>");
				String c=scanner.next();
				if(a2[w].equals(c)) {
					x=login(b);
					if(w==0) {
						y=0;
					}else {
						y=1;
					}
					break;
				}else {}
			}else{
				error();
				System.out.print("id>>");
				b=scanner.next();
			}
		}
		if(y==0) {
			while(z==1) {
				int d=view(1);
				switch(d) {
				case 1:
					int admin1=0;
					System.out.print("id>>");
					String admin2=scanner.next();
					for(int i=1;i<a1.length;i++) {
						if(a1[i].equals(admin2)) {
							System.out.println("�ߺ��� id�� �����մϴ�.");
						}else if(a1[i]==null) {
							admin1=i;
							break;
						}else {}
					}
					a1[admin1]=admin2;
					for(;;) {
						System.out.print("pw>>");
						admin2=scanner.next();
						System.out.print("�ߺ�Ȯ�� pw>>");
						String admin3=scanner.next();
						if(admin2.equals(admin3)) {
							a2[admin1]=admin2;
							break;
						}else {
							error();
						}
					}
					System.out.print("�ܾ�>>");
					int admin3=scanner.nextInt();
					a3[admin1]=admin3;
					break;
				case 2:
					System.out.print("id>>");
					String admin22=scanner.next();
					for(int i=1;i<a1.length;i++) {
						if(i==a1.length) {
							System.out.println("id�� �������� �ʽ��ϴ�.");
							break;
						}else if(a1[i].equals(admin22)) {
							System.out.print(admin22+"�� ��� ������ �����Ͻðڽ��ϱ�?(yes,no) ");
							String admin23=scanner.next();
							if(admin23.equals("yes")) {
								a1[i]="";
								a2[i]="";
								a3[i]=0;
								System.out.println("�����Ǿ����ϴ�.");
								break;
							}else {
								break;
							}
						}else {}
					}
					break;
				case 3:
					System.out.println("id\tpw\t�ܾ�");
					for(int i=1;i<a1.length;i++) {
						if(a1[i]==null) {
						}else {
							System.out.println(a1[i]+"\t"+a2[i]+"\t"+a3[i]);
						}
					}
					break;
				case 4:
					System.out.print("id>>");
					String admin42=scanner.next();
					for(int i=1;i<a1.length;i++) {
						if(i==a1.length) {
							System.out.println("id�� �������� �ʽ��ϴ�.");
							break;
						}else if(a1[i].equals(admin42)) {
							System.out.println("id\tpw\t�ܾ�");
							System.out.println(a1[i]+"\t"+a2[i]+"\t"+a3[i]);
							break;
						}else {}
					}
					break;
				case 5:
					z=end();
					break;
				default:
					error();
					break;
				}
			}
		}else {
			while(z==1) {
				int d=view(2);
				switch(d) {
				case 1:
					a3[w]=in(a3[w]);
					break;
				case 2:
					a3[w]=out(a3[w]);
					break;
				case 3:
					check(a1[w],a3[w]);
					break;
				case 4:
					z=end();
					break;
				default:
					error();
					break;
				}
			}
		}
		
	}

	public static int in(int a) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("�Ա��� �ݾ�(��)=>");
		int cus=scanner.nextInt();
		a+=cus;
		return a;
	}
	public static int out(int a) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("����� �ݾ�(��)=>");
		int cus=scanner.nextInt();
		if(a<cus) {
			System.out.println("�ܾ��� �����մϴ�.");
		}else {
			a-=cus;
		}
		return a;
	}
	public static void check(String a,int b) {
		System.out.println(a+"���� ���� �����Ͻ� �ݾ��� "+b+"�� �Դϴ�.");
	}
	public static int end() {
		System.out.println("�����մϴ�.");
		int a=0;
		return a;
	}
	public static void error() {
		System.out.println("�߸� �Է��ϼ̽��ϴ�.");
	}
	public static int login(String a) {
		System.out.println(a+"���� �α��� �ϼ̽��ϴ�.");
		int b=0;
		return b;
	}
	public static int view(int a) {
		Scanner scanner=new Scanner(System.in);
		int b=0;
		switch(a) {
		case 1:
			System.out.println("1.���� �߰� 2.���� ���� 3.��� ����� ���� Ȯ��\n"
					+ "4.id�� Ư�� ����� ���� Ȯ�� 5.����");
			b=scanner.nextInt();
			break;
		case 2:
			System.out.println("1.�Ա� 2.��� 3.Ȯ�� 4.����");
			b=scanner.nextInt();
			break;
		default:
			break;
		}
		return b;
	}
}
