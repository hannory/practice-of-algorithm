package org.home.programmers;

import java.util.*;

// 1, 5, 6, 10, 11, 12, 13번문제가 틀리네요 왜일까요
class mathPlayer implements Comparable<mathPlayer>{
    int idx;
    int point;
    
    public mathPlayer(int idx, int point){
        this.idx = idx;
        this.point = point;
    }
    
    @Override
    public int compareTo(mathPlayer target) {

        if (this.point > target.point) {
            return -1;
        } else if (this.point < target.point) {
            return 1;
        }

        return 0;
    }
}

class SolutionBy1 {
    public int[] solution(int[] answers) {
        int[] player1 = {1,2,3,4,5};
        int[] player2 = {2,1,2,3,2,4,2,5};
        int[] player3 = {3,3,1,1,2,2,4,4,5,5};

        int playerSum1 = 0;
        int playerSum2 = 0;
        int playerSum3 = 0;
        int i = 0;
        int k1 = 0;
        int k2 = 0;
        int k3 = 0;
        
        while(i < answers.length)
        {
            System.out.println(answers[i]);
            if(i % 5 == 0 ) k1 = 0;
            if(i % 7 == 0 ) k2 = 0;
            if(i % 9 == 0 ) k3 = 0;

            if( answers[i] ==  player1[k1]) playerSum1++;
            if(answers[i] ==  player2[k2]) playerSum2++;
            if(answers[i] ==  player3[k3]) playerSum3++;

            i++;
            k1++;
            k2++;
            k3++;
        }
        
        PriorityQueue<mathPlayer> queue = new PriorityQueue<mathPlayer>();
        queue.offer(new mathPlayer(1,playerSum1));
        queue.offer(new mathPlayer(2,playerSum2));
        queue.offer(new mathPlayer(3,playerSum3));
        mathPlayer result1 = queue.poll();
        mathPlayer result2 = queue.poll();
        mathPlayer result3 = queue.poll();
        int answer[];
        
        if (result1.point == result2.point && result2.point == result3.point){
        	answer = new int[3];
        	answer[0]  = 1;
        	answer[1]  = 2;
        	answer[2]  = 3;
        } else if (result1.point == result2.point) {
        	answer = new int[2];
        
        	if(result1.idx> result2.idx){
        		answer[0]  = result2.idx;
        		answer[1]  = result1.idx;
        	} else {
        		answer[0]  = result1.idx;
        		answer[1]  = result2.idx;
        	}
        } else {
        	answer = new int[1];
        	answer[0]  = result1.idx;
        }        
        
        return answer;
    }
}
