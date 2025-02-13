class Solution {
    public int[] solution(int money) {
        int[] answer = {};
        
        answer = new int[2];

        int coffeyPrice = 5500;

        answer[0] = money / coffeyPrice;
        answer[1] = money % coffeyPrice;
        
        return answer;
    }
}