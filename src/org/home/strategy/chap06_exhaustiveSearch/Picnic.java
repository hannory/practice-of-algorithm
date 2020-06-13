package org.home.strategy.chap06_exhaustiveSearch;

import java.util.Scanner;

public class Picnic {
	
	static boolean[] taken = new boolean[10];
	static int ret = 0;
	
	static int count(int n, boolean[][] areFriends) {

		for(int i = 0; i < n; i++) {
			if(taken[i] == false) {
				for(int j = 0; j < n; j++) {
					if(areFriends[i][j] == true || areFriends[j][i] == true) {
						taken[i] = taken[j] = true;
					}
				}
			}
		}
		
		ret += 1;
		
		
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		//학생의 수
		int m = sc.nextInt();		//친구 쌍의 수
		
		boolean[][] areFriends = new boolean[10][10];
		
		for(int i = 0; i < m; i++) {
			areFriends[sc.nextInt()][sc.nextInt()] = true;
		}
		
		for(int i = 0; i < n; i++) {
			taken[i] = false;
		}
		
		int result = count(n, areFriends);
		
		System.out.println(result);
		
		ret = 0;
		
		//친구 쌍 입력 확인
//		for(int i = 0; i < 10; i++) {
//			for(int j = 0; j < 10; j++) {
//				if(areFriends[i][j] == true) {
//					System.out.println("친구인 쌍 : areFriends[" + i + "][" + j + "]");
//				}
//			}
//		}
		
		sc.close();
	}
}
