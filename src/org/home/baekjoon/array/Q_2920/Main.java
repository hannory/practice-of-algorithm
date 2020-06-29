package org.home.baekjoon.array.Q_2920;

import java.util.Scanner;

//메모리 14344 KB, 시간 112 ms
public class Main {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[8];
		
		for(int i = 0; i < 8; i++) {
			arr[i] = sc.nextInt();
		}
		
		String result = "mixed";
		
		if (arr[0] == 1) {
			result = "ascending";
			
			for(int i = 1; i < 8; i++) {
				if(arr[i] != i + 1) { 
					result = "mixed";
					break;
				}
			}
			
			
		} else if (arr[0] == 8) {
			result = "descending";

			for(int i = 0; i < 8; i++) {
				if(arr[i] != 8 - i) {
					result = "mixed";
					break;
				}
			}
		}
		
		System.out.println(result);
		
		sc.close();
		
	}
}
