class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int maxX = dots[0][0];
        int minX = dots[0][0];
        int maxY = dots[0][1];
        int minY = dots[0][1];

        for (int[] dot : dots) {
            if(maxX < dot[0]) maxX = dot[0];
            if(maxY < dot[1]) maxY = dot[1];
            if(minX > dot[0]) minX = dot[0];
            if(minY > dot[1]) minY = dot[1];
        }

        int width = Math.abs(maxX - minX);
        int height = Math.abs(maxY - minY);
        answer = width * height;
        return answer;
    }
}