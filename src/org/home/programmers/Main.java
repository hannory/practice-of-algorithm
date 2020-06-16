package org.home.programmers;

public class Main {

	public static void main(String[] args) {
		int[] answers1 = {1,2,3,4,5};
		int[] answers2 = {1,3,2,4,2,2,1,2,3,2,4,2,5};
		int[] answers3 = {1,5,2,2,4,5,3};
		int[] answers4 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int[] answers5 = {1,3,3,4,5};
		int[] answers6 = {2,1,2,3,2,4,2,5};
		
		int[] answer = new Solution().solution(answers6);
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}

//		int[] answer = new SolutionBy2().solution(answers5);
//		for(int i = 0; i < answer.length; i++) {
//			System.out.print(answer[i] + " ");
//		}

	}

}
