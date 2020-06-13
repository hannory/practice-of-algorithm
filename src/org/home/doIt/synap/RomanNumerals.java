package doItAlgorythm.com.home.synap;

import java.util.Scanner;

public class RomanNumerals {
	
	public static int romanToArabia(String rNum) {
		
		int aNum = 0;
		
		char[] charArr = rNum.toCharArray();
		
		if(charArr[0] == 'X') {
			
			if(charArr.length == 1) {
				aNum = 10;
			} else {
				
				if(charArr[1] == 'X') {
					
					if(charArr.length == 2) {
						aNum = 20;
					} else {
						
						if(charArr[2] == 'X') {
							
							if(charArr.length == 3) {
								aNum = 30;
							} else {
								//31 ~ 39인 경우
								int ones = romanOnes(rNum.substring(3));	//1의 자리수 구하기
								aNum = 20 + ones;
							}
							
						} else {
							//21 ~ 29인 경우
							int ones = romanOnes(rNum.substring(2));	//1의 자리수 구하기
							aNum = 20 + ones;
						}
					}
					
				} else {
					//11 ~ 19인 경우
					int ones = romanOnes(rNum.substring(1));	//1의 자리수 구하기
					aNum = 10 + ones;
				}
				
			}
			
		} else {
			System.out.println("첫번째가 X가 아니다");
			
			//1 ~ 9인 경우
			aNum = romanOnes(rNum);
		}

		return aNum;
	}
	
	public static int romanOnes(String rNum) {
		
		int aNum = 0;
		
		if(rNum.equals("I")) {
			aNum = 1;
		} else if(rNum.equals("II")) {
			aNum = 2;
		} else if(rNum.equals("III")) {
			aNum = 3;
		} else if(rNum.equals("IV")) {
			aNum = 4;
		} else if(rNum.equals("V")) {
			aNum = 5;
		} else if(rNum.equals("VI")) {
			aNum = 6;
		} else if(rNum.equals("VII")) {
			aNum = 7;
		} else if(rNum.equals("VIII")) {
			aNum = 8;
		} else {
			aNum = 9;
		}
		
		return aNum;
	}
	
	public static int compute(String rNum1, char symbol, String rNum2) {
		
		int aNum1 = romanToArabia(rNum1);
		int aNum2 = romanToArabia(rNum2);
		int result = 0;
		
		switch(symbol) {
		case '+' : result = aNum1 + aNum2; break;
		case '-' : result = aNum1 - aNum2; break;
		case '*' : result = aNum1 * aNum2; break;
		case '/' : result = aNum1 / aNum2; break;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------로마 숫자 계산기--------");
		System.out.println("로마 숫자는 I~XXXIX (1~39) 범위에서 입력해주세요.");
		System.out.print("첫 번째 로마 숫자 입력 : ");
		String rNum1 = sc.next();
		System.out.print("사칙 연산 입력(+, -, *, /) 입력 : ");
		char symbol = sc.next().charAt(0);
		System.out.print("두 번째 숫자 입력 : ");
		String rNum2 = sc.next();

		System.out.println("계산 결과 : " + compute(rNum1, symbol, rNum2));
	}
}





