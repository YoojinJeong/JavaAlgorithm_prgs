package programmers.level2;
import java.util.LinkedList;
import java.util.Queue;
public class 스킬트리 {
    public int solution(String skills, String[] skill_trees) {
        int answer = 0;
        char[] skills_arr = skills.toCharArray();

        for(int i = 0; i < skill_trees.length; i++){
            Queue<Character> queue = new LinkedList<>();
            for(char k : skills.toCharArray()){
                queue.add(k);
            }

            boolean flag = true;
            for(char ch : skill_trees[i].toCharArray()){
                if(hasSkill(skills_arr, ch)){
                    flag = false;
                    //System.out.println("*"+queue.peek());
                    if(queue.peek() == ch){
                        flag = true;
                        // System.out.println("current: " + ch + " stack.peek: "+queue.peek());
                        queue.poll();
                    }else{
                        flag = false;
                        break;
                    }
                }
            }
            if(flag) answer++;

        }

        return answer;
    }
    public static boolean hasSkill(char[] skills_arr, char ch){
        for(char k : skills_arr){
            if(ch == k){
                return true;
            }
        }
        return false;
    }
}
