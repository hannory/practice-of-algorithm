package org.com.strategy.chap06_exhaustiveSearch;

import java.util.Scanner;

// 코드 6.1 : 1부터 n까지의 합을 계산하는 반복 함수와 재귀 함수
// 필수 조건: N >= 1
// 결과 : 1부터 n까지의 합을 반환
public class RecursiveSum {
	static int sum(int n) {
		int ret = 0;
		for(int i = 1; i <= n; i++) {
			ret += i;
		}
		return ret;
	}
	
	static int recursiveSum(int n) {
		// 재귀 호출의 기저 사례(base case)
		if(n == 1) return 1;
		return n + recursiveSum(n - 1); 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println("반복문 이용 : " + sum(n));
		System.out.println("재귀 함수 이용 : " + recursiveSum(n));
		
		sc.close();
	}
}
