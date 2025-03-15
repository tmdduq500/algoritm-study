class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = {};
        int secondArrSize = num_list.length / n;
        answer = new int[secondArrSize][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < secondArrSize; j++) {
                answer[j][i] = num_list[j * n + i];
            }
        }
        return answer;
    }
}