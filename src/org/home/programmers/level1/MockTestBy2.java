package org.home.programmers;

// 통과한 코드
class SolutionBy2 {
	public int[] solution(int[] answers) {
		int s1 = 0, s2 = 0, s3 = 0, count = 0, max = 0;
		// count : 정답을 담은 answers 배열 index 수
		
		int[] a1 = {1,2,3,4,5};
		int[] a2 = {2,1,2,3,2,4,2,5};
		int[] a3 = {3,3,1,1,2,2,4,4,5,5};
		
		int j = 0;		// 학생 배열의 인덱스 번호
		for(int i = 0; i < answers.length; i++) {
			
			if(answers[i] == a1[j]) {
				s1++; j++;		// 정답이면 s1 증가
			} else {
				j++;
			}
			
			if(j == a1.length) {
				j = 0;
			}
		}
		
		if(max < s1) max = s1;
		
		j = 0;
		for(int i = 0; i < answers.length; i++) {
			if(answers[i] == a2[j]) {
				s2++; j++;
			} else {
				j++;
			}
			
			if(j == a2.length) {
				j = 0;
			}
		}
		
		if(max < s2) max = s2;
		
		j = 0;
		for(int i = 0; i < answers.length; i++) {
			if(answers[i] == a3[j]) {
				s3++; j++;
			} else {
				j++;
			}
			
			if(j == a3.length) {
				j = 0;
			}
		}
		
		if(max < s3) max = 3;
		
		// answer의 index 번호 세기
		if(max == s1) count++;
		if(max == s2) count++;
		if(max == s3) count++;
		
		int[] answer = new int[count];
		
		int i = 0;
		
		if(max == s1) {
			answer[i] = 1;
			i++;
		}
		
		if(max == s2) {
			answer[i] = 2;
			i++;
		}
		
		if(max == s3) {
			answer[i] = 3;
		}
		
		return answer;
	}
	
}



















