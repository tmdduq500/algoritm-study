class Solution {
    public String solution(String s) {
        int len = s.length();
        String answer="";
        
        if(len%2==0){
            answer=s.substring((len/2)-1,len/2+1);
            return answer;
        }
        else{
            answer=String.valueOf(s.charAt((len/2)));
            return answer;
        }
    }
}