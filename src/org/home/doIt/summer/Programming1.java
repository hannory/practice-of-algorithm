package doItAlgorythm.com.home.summer;

public class Programming1 {
	
	public static int solution(int p) {

		int answer = p + 1;
		
		do {
			System.out.println("do 진입");
			System.out.println("answer : " + answer);
			
			String str = Integer.toString(answer);
			char four = str.charAt(3);
			char three = str.charAt(2);
			char two = str.charAt(1);
			char one = str.charAt(0);

			if(answer >= 10000) {
				break;
			}
			
			if(four == three || four == two || four == one) {
				System.out.println("if문 첫 번째 조건 진입");
				
				answer += 1;
			} else if(three == two || three == one) {
				answer += 1;
			} else if(two == one) {
				answer += 1;
			} else {
				break;
			}
		} while(true);
		
		
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println("p보다 큰 아름다운 연도 : " + solution(2015));
	}
}
