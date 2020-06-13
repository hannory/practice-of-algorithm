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
		
		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.print("a의 값 : ");
		int a = sc.nextInt();
		System.out.print("b의 값 : ");
		int b = sc.nextInt();
		System.out.print("c의 값 : ");
		int c = sc.nextInt();
		
		sc.close();
		
		System.out.println("나의 중앙값은 " + med3(a, b, c) + "입니다.");
		System.out.println("책의 중앙값은 " + medBook3(a, b, c) + "입니다.");
		
	}
}
