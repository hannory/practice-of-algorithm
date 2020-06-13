package org.home.strategy.chap06_exhaustiveSearch;

import java.util.ArrayList;
import java.util.Scanner;

public class NestedLoop {
	static int pickByLoop(int n) {
		int ret = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				for(int k = j + 1; k < n; k++) {
					for(int l = k + 1; l < n; l++) {
						System.out.println(i + " " + j + " " + k + " " + l);
						ret += 1;
					}
				}
			}
		}
		
		return ret;
	}
	
	static int recursiveCount(int n) {
		int ret = 0;
		
		if(n == 4) return 1;
	
		return ret + recursiveCount(n - 1);
	}
	
	// n: 전체 원소의 수
	// picked: 지금까지 고른 원소들의 번호
	// toPick: 더 고를 원소의 수
	// ret2: 재귀함수 이용 시 경우의 수
	static int ret2;
	
	static void pick(int n, ArrayList<Integer> picked, int toPick) {
		
		if(toPick == 0) { 
			printPicked(picked);
			ret2 += 1;
			return; 
		}
		// 고를 수 있는 가장 작은 번호를 계산한다.
		int smallest = picked.isEmpty()? 0 : picked.get(picked.size() - 1) + 1;
		// 이 단계에서 원소 하나를 고른다.
		for(int next = smallest; next < n; next++) {
			picked.add(next);
			pick(n, picked, toPick - 1);
			picked.remove(picked.size() - 1);
		}
	}
	
	static void printPicked(ArrayList<Integer> picked) {
		System.out.println(picked);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> picked = new ArrayList<Integer>();
		
		System.out.println("반복문 이용 : " + pickByLoop(n));
		
		pick(n, picked, 4);
		System.out.println("재귀함수 이용 : " + ret2);
	}
}














