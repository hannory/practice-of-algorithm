package org.home.programmers;

class Solution {
	public int[] solution(int[] answers) {
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		// 첫 번째 수포자 정답 개수 구하기
		for(int i = 0; i < answers.length; i++) {
			if(answers[i] == ((i % 5) + 1)) {
				num1 += 1;
			}
		}
		
		// 두 번째 수포자 정답 개수 구하기
		for(int i = 0; i < answers.length; i++) {
			if(i % 2 == 0) {
				if(answers[i] == 2) {
					num2 += 1;
				}
			} else {
				switch(i % 8) {
				case 1: if(answers[i] == 1) num2 += 1; break;
				case 3: if(answers[i] == 3) num2 += 1; break;
				case 5: if(answers[i] == 4) num2 += 1; break;
				case 7: if(answers[i] == 5) num2 += 1; break;
				}				
			}
		}
		
		// 세 번재 수포자 정답 개수 구하기
		for(int i = 0; i < answers.length; i++) {
			switch(i % 10) {
			case 0: case 1: if(answers[i] == 3) num3 += 1; break; 
			case 2: case 3: if(answers[i] == 1) num3 += 1; break;
			case 4: case 5: if(answers[i] == 2) num3 += 1; break;
			case 6: case 7: if(answers[i] == 4) num3 += 1; break;
			case 8: case 9: if(answers[i] == 5) num3 += 1; break;
			}
		}
		
		// 최고점 구하기
		int highest = num1;
		
		if(highest < num2) {
			highest = num2;
		}
		
		if(highest < num3) {
			highest = num3;
		}
		
		// console 출력
		for(int i = 0; i < answers.length; i++) {
			
		}
		
		System.out.println("첫 번재 수포자 정답 수 : " + num1);
		System.out.println("두 번재 수포자 정답 수 : " + num2);
		System.out.println("세 번재 수포자 정답 수 : " + num3);
		System.out.println("최고점 : " + highest);
		
		// answer 배열 구하기
		int count = 0;
		if(highest == num1) count++;
		if(highest == num2) count++;
		if(highest == num3) count++;

		int[] answer = new int[count];
		
		int j = 0;	// answer 배열 인덱스
		
		if(highest == num1) {
			answer[j] = 1;
			j++;
		}
		
		if(highest == num2) {
			answer[j] = 2;
			j++;
		}
		
		if(highest == num3) {
			answer[j] = 3;
		}
		
		// answer 배열 구하기 (기존 코드 : 디버깅도 힘들다. 배열 개수를 계속 선언해주고 있다.)
//		if(highest != 0) {
//			if(highest == num1) {
//				if(highest == num2) {
//					if(highest == num3) {
//						answer = new int[3];
//						
//						answer[0] = 1;
//						answer[1] = 2;
//						answer[2] = 3;
//					} else {
//						answer = new int[2];
//						
//						answer[0] = 1;
//						answer[1] = 2;
//					}
//				} else {
//					if(highest == num3) {
//						answer = new int[2];
//						
//						answer[0] = 1;
//						answer[1] = 3;
//					} else {
//						answer = new int[1];
//						
//						answer[0] = 1;
//					}
//				}
//			} else {
//				if(highest == num2) {
//					if(highest == num3) {
//						answer = new int[2];
//						
//						answer[0] = 2;
//						answer[1] = 3;
//					} else {
//						answer = new int[1];
//						
//						answer[0] = 2;
//					}
//				} else {
//					answer = new int[1];
//					
//					answer[0] = 3;
//				}
//			}
//		}
		
		return answer;
	}
}
