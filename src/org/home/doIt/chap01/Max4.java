package org.com.doIt.chap01;

public class Max4 {
	static int max4(int a, int b, int c, int d) {
		int max = a;
		
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		if(d > max) {
			max = d;
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("max4(3,10,1,4) : " + max4(3,10,1,4));
		System.out.println("max4(32,10,11,-4) : " + max4(32,10,11,-4));
	}
}
