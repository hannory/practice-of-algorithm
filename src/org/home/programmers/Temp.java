package org.home.programmers;

class Temp {
	public int[] solution(int[] answers) {
		int s1 = 0, s2 = 0, s3 = 0, count = 0, max = 0;
		
		int[] a1 = {1,2,3,4,5};
		int[] a2 = {2,1,2,3,2,4,2,5};
		int[] a3 = {3,3,1,1,2,2,4,4,5,5};
		
		int j = 0;
		for(int i = 0; i < answers.length; i++) {
			if(answers[i] == a1[j]) {
				s1++; j++;
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
			i++;
		}
		
		return answer;
	}
}
















