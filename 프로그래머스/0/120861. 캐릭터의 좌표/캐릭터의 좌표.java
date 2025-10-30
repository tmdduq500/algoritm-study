class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        for (String s : keyinput) {
            switch (s) {
                case "left":
                    answer[0] = answer[0] - 1;
                    if (Math.abs(answer[0]) > board[0]/2) answer[0] += 1;
                    break;
                case "right":
                    answer[0] = answer[0] + 1;
                    if (Math.abs(answer[0]) > board[0]/2) answer[0] -= 1;
                    break;
                case "up":
                    answer[1] = answer[1] + 1;
                    if (Math.abs(answer[1]) > board[1]/2) answer[1] -= 1;
                    break;
                case "down":
                    answer[1] = answer[1] - 1;
                    if (Math.abs(answer[1]) > board[1]/2) answer[1] += 1;
                    break;
            }
        }
        return answer;
    }
}