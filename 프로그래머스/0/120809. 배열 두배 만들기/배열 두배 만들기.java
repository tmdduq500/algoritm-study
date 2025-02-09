class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        
        int arrLength = numbers.length;
        answer = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            answer[i] = numbers[i]* 2;
        }
            
        return answer;
    }
}