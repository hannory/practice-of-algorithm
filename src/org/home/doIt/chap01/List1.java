package doItAlgorythm.com.home.chap01;

import java.util.Scanner;

public class List1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ��� �Է��ϼ��� : ");
		int n = sc.nextInt();
		
		if(n == 1) {
			System.out.println("�� ���� 1�Դϴ�.");
		} else if(n == 2) {
			System.out.println("�� ���� 2�Դϴ�.");
		} else if(n == 3) {
			System.out.println("�� ���� 3�Դϴ�.");
		}
	}
}
