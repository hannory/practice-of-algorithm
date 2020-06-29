package org.home.baekjoon.array.Q_2920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// dks301 풀이
// 메모리 12803 KB, 64 ms
public class Main2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		String ascending = "1 2 3 4 5 6 7 8";
		String descending = "8 7 6 5 4 3 2 1";
		String output = input.equals(ascending)? "ascending" : (input.equals(descending)? "descending" : "mixed");
		
		System.out.println(output);
	}
}
