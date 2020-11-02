package com.human.ex;
import java.util.*;
public class BlackJack {
	public static int deck[]=new int[52];
	public static int p1Deck[]=new int[10];
	public static int p2Deck[]=new int[10];
	public static int deckIndex=52;
	public static int p1DeckIndex=0;
	public static int p2DeckIndex=0;
	public static String cardShape[]= {"�����̵�","���̾�","��Ʈ","Ŭ�ι�"};
	public static String cardNumber[]=
		{"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	public static void newCard() {
		for(int i=0;i<deck.length;i++) {
			deck[i]=i;
		}
	}
	public static void mixCard() {
		for(int i=0;i<10000;i++) {
			int randomIndex=(int)(Math.random()*52);
			int temp=deck[0];
			deck[0]=deck[randomIndex];
			deck[randomIndex]=temp;
		}
	}
	public static void displayCard() {
		for(int i=0;i<deck.length;i++) {
			System.out.println(cardShape[deck[i]/13]+cardNumber[deck[i]%13]);
		}
	}
	public static void displayP1Card() {
		System.out.println("P1Card....");
		for(int i=0;i<p1DeckIndex;i++) {
			System.out.println(cardShape[p1Deck[i]/13]+cardNumber[p1Deck[i]%13]);
		}
	}
	public static void displayP2Card() {
		System.out.println("P2Card....");
		for(int i=0;i<p2DeckIndex;i++) {
			System.out.println(cardShape[p2Deck[i]/13]+cardNumber[p2Deck[i]%13]);
		}
	}
	public static void getP1Card() {
		//deck�迭���� p1Deck���� ī�� �ű��
		//deck�� ������ �ִ� ī����� deckIndex
		//p1Deck�� ������ �ִ� ī����� p1DeckIndex
		p1Deck[p1DeckIndex]=deck[deckIndex-1];
		deckIndex--;
		p1DeckIndex++;
	}
	public static void getP2Card() {
		p2Deck[p2DeckIndex]=deck[deckIndex-1];
		deckIndex--;
		p2DeckIndex++;
	}
	public static int p1Scoure() {
		int returnValue=0;
		//A 1 or 11
		//J Q K 10
		for(int i=0;i<p1DeckIndex;i++) {
			int countNum=(p1Deck[i]%13)+1;
			if(countNum>10) {
				countNum=10;
			}
			returnValue+=countNum;
		}
		for(int i=0;i<p1DeckIndex;i++) {
			if(p1Deck[i]%13==0) {
				if(returnValue+10>21) {
				}else {
					returnValue+=10;
				}
				break;
			}
		}
		return returnValue;
	}
	public static int p2Scoure() {
		int returnValue=0;
		//A 1 or 11
		//J Q K 10
		for(int i=0;i<p2DeckIndex;i++) {
			int countNum=(p2Deck[i]%13)+1;
			if(countNum>10) {
				countNum=10;
			}
			returnValue+=countNum;
		}
		for(int i=0;i<p2DeckIndex;i++) {
			if(p2Deck[i]%13==0) {
				if(returnValue+10>21) {
				}else {
					returnValue+=10;
				}
				break;
			}
		}
		return returnValue;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int i=1;
		while(i==1) {
			//���ο� ī�� ����
			deckIndex=52;
			newCard();
			//ī�带 ���´�.
			mixCard();
			//ī�� �����ֱ�
			//displayCard();
			int x=1,y=1;
			//p1ī�� �ޱ�
			p1DeckIndex=0;
			p2DeckIndex=0;
			getP1Card();
			getP1Card();
			displayP1Card();
			//p2ī�� �ޱ�
			getP2Card();
			getP2Card();
			displayP2Card();
			for(;;) {
				if(x==1) {
					System.out.println("P1.ī�带 �� �����ðڽ��ϱ�?(1.�� 2.�ƴϿ�)=>");
					x=scanner.nextInt();
					if(x==1) {
						getP1Card();
						displayP1Card();
						if(p1Scoure()>21) {
							x=2;
						}else {}
					}else {}
				}else if(y==1) {
					System.out.println("P2.ī�带 �� �����ðڽ��ϱ�?(1.�� 2.�ƴϿ�)=>");
					y=scanner.nextInt();
					if(y==1) {
						getP2Card();
						displayP2Card();
						if(p2Scoure()>21) {
							y=2;
						}else {}
					}else {}
				}else if(x==2&&y==2) {
					break;
				}else {}
			}
			displayP1Card();
			System.out.println(p1Scoure());
			displayP2Card();
			System.out.println(p2Scoure());
			if((p1Scoure()>21&&p2Scoure()>21)||p1Scoure()==p2Scoure()) {
				System.out.println("���º�");
			}else if((p1Scoure()<=21&&p2Scoure()>21)||(p1Scoure()<=21&&p1Scoure()>p2Scoure())) {
				System.out.println("P1�� �¸�");
			}else if((p1Scoure()>21&&p2Scoure()<=21)||(p1Scoure()<=21&&p1Scoure()>p2Scoure())) {
				System.out.println("P2�� �¸�");
			}else {}
			System.out.print("�ٽ��ϱ�(1.�� 2.�ƴϿ�)=>");
			i=scanner.nextInt();
		}
	
	}

}