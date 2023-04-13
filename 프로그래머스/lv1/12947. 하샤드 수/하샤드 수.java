class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        //int를 int배열로 변환
        String temp = Integer.toString(x);
        int[]num = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
            num[i] = temp.charAt(i) - '0';
        
        //자릿수 합 계산
        int sum=0;
        for(int j=0; j<num.length; j++){
            sum+=num[j];
        }
        
        if(x%sum==0)    answer=true;
        else    answer=false;
        
        return answer;
    }
}