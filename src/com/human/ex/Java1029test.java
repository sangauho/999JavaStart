package com.human.ex;
import java.util.*;

public class Java1029test {

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
				System.out.println("종료합니다.");
				x=0;
				break;
			}else if(b.equals(a1[w])) {
				System.out.print("pw>>");
				String c=scanner.next();
				if(a2[w].equals(c)) {
					System.out.println(b+"님이 로그인 하셨습니다.");
					x=0;
					if(w==0) {
						y=0;
					}else {
						y=1;
					}
					break;
				}else {}
			}else{
				System.out.println("입력하신 정보가 맞지 않습니다.");
				System.out.print("id>>");
				b=scanner.next();
			}
		}
		if(y==0) {
			while(z==1) {
				System.out.println("1.계정 추가 2.계정 삭제 3.모든 사용자 정보 확인\n"
						+ "4.id로 특정 사용자 정보 확인 5.종료");
				int d=scanner.nextInt();
				switch(d) {
				case 1:
					int admin1=0;
					System.out.print("id>>");
					String admin2=scanner.next();
					for(int i=1;i<a1.length;i++) {
						if(a1[i].equals(admin2)) {
							System.out.println("중복된 id가 존재합니다.");
						}else if(a1[i]==null) {
							admin1=i;
							break;
						}else {}
					}
					a1[admin1]=admin2;
					for(;;) {
						System.out.print("pw>>");
						admin2=scanner.next();
						System.out.print("중복확인 pw>>");
						String admin3=scanner.next();
						if(admin2.equals(admin3)) {
							a2[admin1]=admin2;
							break;
						}else {
							System.out.println("정확하지 않습니다.");
						}
					}
					System.out.print("잔액>>");
					int admin3=scanner.nextInt();
					a3[admin1]=admin3;
					break;
				case 2:
					System.out.print("id>>");
					String admin22=scanner.next();
					for(int i=1;i<a1.length;i++) {
						if(i==a1.length) {
							System.out.println("id가 존재하지 않습니다.");
							break;
						}else if(a1[i].equals(admin22)) {
							System.out.print(admin22+"의 모든 정보를 삭제하시겠습니까?(yes,no) ");
							String admin23=scanner.next();
							if(admin23.equals("yes")) {
								a1[i]="";
								a2[i]="";
								a3[i]=0;
								System.out.println("삭제되었습니다.");
								break;
							}else {
								break;
							}
						}else {}
					}
					break;
				case 3:
					System.out.println("id\tpw\t잔액");
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
							System.out.println("id가 존재하지 않습니다.");
							break;
						}else if(a1[i].equals(admin42)) {
							System.out.println("id\tpw\t잔액");
							System.out.println(a1[i]+"\t"+a2[i]+"\t"+a3[i]);
							break;
						}else {}
					}
					break;
				case 5:
					System.out.println("종료합니다.");
					z=0;
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
					break;
				}
			}
		}else {
			while(z==1) {
				System.out.println("1.입금 2.출금 3.확인 4.종료");
				int d=scanner.nextInt();
				switch(d) {
				case 1:
					System.out.print("입금할 금액(원)=>");
					int cus1=scanner.nextInt();
					a3[w]+=cus1;
					break;
				case 2:
					System.out.print("출금할 금액(원)=>");
					int cus2=scanner.nextInt();
					if(a3[w]<cus2) {
						System.out.println("잔액이 부족합니다.");
					}else {
						a3[w]-=cus2;
					}
					break;
				case 3:
					System.out.println(a1[w]+"님이 현재 보유하신 금액은 "+a3[w]+"원 입니다.");
					break;
				case 4:
					System.out.println("종료합니다.");
					z=0;
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
					break;
				}
			}
		}
		
	}

}
