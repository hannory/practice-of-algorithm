package org.home.strategy.chap07_divideAndConquer;

import java.util.ArrayList;

// 두 큰 수를 곱하는 O(n^2) 시간 알고리즘
class MultiplyN2 {
	// num[]의 자리수 올림을 처리한다.
	public void normalize(ArrayList<Integer> num) {
		num.add(0);
		// 자리수 올림을 처리한다.
		for(int i = 0; i + 1 < num.size(); i++) {
			if(num.get(i) < 0) {
				int borrow = (Math.abs(num.get(i)) + 9) / 10;
				num.set(i + 1, num.get(i + 1) - borrow);
				num.set(i, num.get(i) + borrow * 10);
			} else {
				num.set(i+1, num.get(i) / 10);
				num.set(i, num.get(i) % 10);
			}
		}
	
		//while(num.size() > 1 && num.get(num.size() - 1) == 0) num.add();
	}
}
