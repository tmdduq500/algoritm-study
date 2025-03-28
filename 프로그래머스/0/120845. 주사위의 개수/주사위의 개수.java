class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int first = box[0] / n;
        int second = box[1] / n;
        int third = box[2] / n;

        answer = first * second * third;
        return answer;
    }
}