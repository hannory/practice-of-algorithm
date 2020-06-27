package org.home.programmers.level1;

class Year2016 {
	public String solution(int a, int b) {
		String answer = "";
		
		int c = 0;		// 요일 구하기 위해 더할 변수
		
		// 하기 변수의 분개는 수도응로 계산해야 하므로 비권장
		switch(a) {
		case 1 : case 4 : case 7 : c = 4; break;
		case 3 : case 11: c = 1; break;
		case 6 : c = 2; break;
		case 9 : case 12: c = 3; break;
		case 10 : c = 5; break;
		case 5 : c = 6; break;
		}
		
		switch(((b % 7) + c) % 7) {
		case 0 : answer = "SUN"; break;
		case 1 : answer = "MON"; break;
		case 2 : answer = "TUE"; break;
		case 3 : answer = "WED"; break;
		case 4 : answer = "THU"; break;
		case 5 : answer = "FRI"; break;
		case 6 : answer = "SAT"; break;
		}
		
		return answer;
		
	}
}


















