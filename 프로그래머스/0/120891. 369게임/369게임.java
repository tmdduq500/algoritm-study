class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String orderStr = String.valueOf(order);
        String[] split = orderStr.split("");

        for (String s : split) {
            int i = Integer.parseInt(s);
            if (i != 0 && i % 3 == 0) {
                answer++;
            }
        }
        return answer;
    }
}