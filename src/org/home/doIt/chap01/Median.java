package doItAlgorythm.com.home.chap01;

import java.util.Scanner;

public class Median {
	static int med3(int a, int b, int c) {
		
		int med = 0;
		
		if(a <= b) {
			if(c <= a) {
				med = a;
			} else {
				if(b <= c) {
					med = b;
				} else {
					med = c;
				}
			}
		} else {
			if(c <= b) {
				med = b;
			} else {
				if(a <= c) {
					med = a;
				} else {
					med = c;
				}
			}
		}
		
		return med;
	}
	
	static int medBook3(int a, int b, int c) {
		if(a >= b) {
			if(b >= c) {
				return b;
			} else if ( a <= c) {
				return a;
			} else {
				return c;
			}
		} else if (a > c) {
			return a;
		} else if (c > b) {
			return b;
		} else {
			return c;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ������ �߾Ӱ��� ���մϴ�.");
		System.out.print("a�� �� : ");
		int a = sc.nextInt();
		System.out.print("b�� �� : ");
		int b = sc.nextInt();
		System.out.print("c�� �� : ");
		int c = sc.nextInt();
		
		sc.close();
		
		System.out.println("���� �߾Ӱ��� " + med3(a, b, c) + "�Դϴ�.");
		System.out.println("å�� �߾Ӱ��� " + medBook3(a, b, c) + "�Դϴ�.");
		
	}
}
