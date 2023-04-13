class Solution {
    public int[] solution(long n) {
        int num=(int)n;
        
        String temp = Long.toString(n);
        int length=temp.length();
        
        int[] numbers = new int[length];
        int[] answer = new int[length];
        
        for (int i = 0; i < length; i++){
            numbers[i] =temp.charAt(i) - '0';
        }
        
        for (int j=0; j<length; j++){
            answer[j]=numbers[(length-1)-j];
        }
        
        return answer;
    }
}