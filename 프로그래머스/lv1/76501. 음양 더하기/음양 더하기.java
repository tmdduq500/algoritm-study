class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int len=absolutes.length;
        int sum=0;
        for(int i=0; i<len; i++){
            if(signs[i]==true){
                absolutes[i]=absolutes[i];
            }
            else{
                absolutes[i]=absolutes[i]*(-1);
            }
        }
        for(int j=0; j<len; j++){
            sum+=absolutes[j];
        }
        
        return sum;
    }
}