package org.home.strategy.chap06_exhaustiveSearch;

import java.util.Scanner;

class Boggle {
	
	final char board[][] = new char[5][5];
	
	public void boggle() {
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();		// 케이스의 수
		
		String board0 = sc.next();
		String board1 = sc.next();
		String board2 = sc.next();
		String board3 = sc.next();
		String board4 = sc.next();
		
		for(int x = 0; x < 5; x++) {
			board[0][x] = board0.charAt(x);			
			board[1][x] = board1.charAt(x);			
			board[2][x] = board2.charAt(x);			
			board[3][x] = board3.charAt(x);			
			board[4][x] = board4.charAt(x);			
		}
		
		int n = sc.nextInt();		// 단어의 수
		
		String[] words = new String[n];
		
		for(int i = 0; i < n; i++) {
			words[i] = sc.next();
			
			for(int j = 0; j > words[i].length(); j++) {
				char[] word = new char[words[i].length()];  
				word[j] = words[i].charAt(j);
				
				// 시작 점은 어디든 가능하게 모든 경우의 수를 조회해야 한다.
				System.out.println(words[i] + hasWord());
			}
		}
	}
		
	final int[] dx = {-1, -1, -1, 1, 1, 1, 0, 0};
	final int[] dy = {-1, 0, 1, -1, 0, 1, -1, 1};
	
	public String hasWord(int x, int y, char[] word) {
		// 기저 사례 1: 시작 위치가 범위 밖이면 ㅁ조건 실패
		if(!inRange(x, y)) return "NO";
		// 기저 사례 2: 첫 글자가 일치하지 않으면 실패
		
		return "NO";
	}
	
	public boolean inRange(int x, int y) {
		
		if(x > 2 || x < -2) {
			return false;
		}
		
		if(y > 2 || y < -2) {
			return false;
		}
		
		return true;
	}
}
