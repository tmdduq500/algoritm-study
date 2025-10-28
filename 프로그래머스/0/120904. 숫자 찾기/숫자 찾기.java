class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String numStr = String.valueOf(num);
        String kStr = String.valueOf(k);

        answer = numStr.indexOf(kStr) + 1 == 0 ? -1 : numStr.indexOf(kStr) + 1; 
        return answer;
    }
}