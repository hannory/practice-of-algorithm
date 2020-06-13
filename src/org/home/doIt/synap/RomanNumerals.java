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
								//31 ~ 39�� ���
								int ones = romanOnes(rNum.substring(3));	//1�� �ڸ��� ���ϱ�
								aNum = 20 + ones;
							}
							
						} else {
							//21 ~ 29�� ���
							int ones = romanOnes(rNum.substring(2));	//1�� �ڸ��� ���ϱ�
							aNum = 20 + ones;
						}
					}
					
				} else {
					//11 ~ 19�� ���
					int ones = romanOnes(rNum.substring(1));	//1�� �ڸ��� ���ϱ�
					aNum = 10 + ones;
				}
				
			}
			
		} else {
			System.out.println("ù��°�� X�� �ƴϴ�");
			
			//1 ~ 9�� ���
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
		System.out.println("--------�θ� ���� ����--------");
		System.out.println("�θ� ���ڴ� I~XXXIX (1~39) �������� �Է����ּ���.");
		System.out.print("ù ��° �θ� ���� �Է� : ");
		String rNum1 = sc.next();
		System.out.print("��Ģ ���� �Է�(+, -, *, /) �Է� : ");
		char symbol = sc.next().charAt(0);
		System.out.print("�� ��° ���� �Է� : ");
		String rNum2 = sc.next();

		System.out.println("��� ��� : " + compute(rNum1, symbol, rNum2));
	}
}





