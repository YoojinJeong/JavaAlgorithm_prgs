package programmers.level2;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class 택배상자 {
    public static void main(String[] args) {
        int answer = solution(new int[] {4, 3, 1, 2, 5});
        System.out.println("answer: "+answer);
    }
    static public int solution(int[] order) {
        int answer = 0;
        int index = 0;
        Stack<Integer> sub = new Stack<>();

        for(int i = 0; i < order.length; i++){
            sub.add(i+1);
            while(!sub.isEmpty()){
                if(sub.peek() == order[index]){
                    sub.pop();
                    index++;
                    answer++;
                }else{
                    break;
                }
            }
        }

        return answer;
    }
}
