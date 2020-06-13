package doItAlgorythm.com.home.chap01;

public class MIn4 {
	static int min4(int a, int b, int c, int d) {
		int min = a;
		
		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		if(d < min) {
			min = d;
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		System.out.println("min4(1,3,0,10) : " + min4(1,3,0,10));
		System.out.println("min4(1,3,0,-10) : " + min4(1,3,0,-10));
	}
}
