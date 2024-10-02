package programmers.level2;

public class 타켓넘버 {
        int cnt = 0;
        public int solution(int[] numbers, int target) {
            int answer = 0;
            dfs(0, numbers, -numbers[0], target);
            dfs(0, numbers, numbers[0], target);
            return cnt;
        }
        public void dfs(int idx, int[] numbers, int sum, int target){
            if(idx == numbers.length -1){
                if(sum == target){
                    cnt++;
                }
                return;
            }
            dfs(idx + 1, numbers, sum - numbers[idx+1], target);
            dfs(idx + 1, numbers, sum + numbers[idx+1], target);
        }
    }
