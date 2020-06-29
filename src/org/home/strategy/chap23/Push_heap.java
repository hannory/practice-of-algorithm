package org.home.strategy.chap23;

import java.util.ArrayList;

public class Push_heap {
	// 정수를 담는 최대 힙 heap에 새 원소 newValue를 삽입한다.
	static void push_heap(ArrayList<Integer> heap, int newValue) {
		// 힙의 맨 끝에 newValue를 삽입한다.
		heap.add(newValue);
		// 현재 newValue의 위치
		int idx = heap.size() - 1;
		// 루트에 도달하거나 newValue 이상으 ㅣ원소를 가진 조상을 만날 때까지
		while(idx > 0 && heap.get((idx - 1) / 2) < heap.get(idx)) {
			swap(heap.get(idx), heap.get((idx - 1) / 2));
			idx = (idx -1) / 2;
		}
	}
	
	static int swap(int a, int b) {
		int t;
		
		t = a;
		a = b;
		b = t;
		
		return t;
	}
}
