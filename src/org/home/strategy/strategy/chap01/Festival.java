package org.com.strategy.chap01;

import java.util.Scanner;

public class Festival {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int caseNum = sc.nextInt();		
		
		for(int k = 0; k < caseNum; k++) {
			
			int dateNum = sc.nextInt();		
			int teamNum = sc.nextInt();		
			int[] dateArr = new int[dateNum]; 
			
			for(int i = 0; i < dateNum; i++) {
				dateArr[i] = sc.nextInt();
			};
			
			int total = 0;
			float avg = 0;
			float minAvg = 101;
			
			for(int m = 0; m < dateNum; m++) {
				// 팀의 수 별로 반복문의 최대 값
				for(int i = teamNum + m; i <= dateNum; i++) {
					for(int j = m; j < i; j++) {
						total += dateArr[j];
					}
					avg = (float) total / (float) (i - m);
					
					if(minAvg > avg) {
						minAvg = avg;
					}
					total = 0;
				}
			}
			System.out.println("minAvg : " + minAvg);
		}
		sc.close();
	}
}
