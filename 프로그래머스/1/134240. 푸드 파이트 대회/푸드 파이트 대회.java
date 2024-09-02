class Solution {
    public String solution(int[] food) {
        String answer = "";

        for (int i = 1; i < food.length; i++) {
            if(food[i] % 2 != 0) {
                food[i] = food[i] - 1;
            }
        }

        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer += i;
            }
        }
        StringBuilder sb = new StringBuilder(answer);
        answer += 0;
        answer += sb.reverse();
        
        return answer;
    }
}