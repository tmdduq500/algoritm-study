class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
         int i = 0;
        for (int j = 0; j < k-1; j++) {
            if ((i + 2) > numbers.length - 1) {
                answer = numbers[(i + 2) % (numbers.length)];
                i = i + 2;
            } else {
                answer = numbers[i + 2];
                i = i + 2;
            }
        }


        return answer;
    }
}