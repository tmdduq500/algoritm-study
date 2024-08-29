class Solution {
    public int solution(int[][] sizes) {
        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }

        int width = sizes[0][0];
        int height = sizes[0][1];

        for(int i = 0; i < sizes.length; i++) {
            if (width < sizes[i][0]) {
                width = sizes[i][0];
            }

            if (height < sizes[i][1]) {
                height = sizes[i][1];
            }
        }

        return width * height;
    }
}