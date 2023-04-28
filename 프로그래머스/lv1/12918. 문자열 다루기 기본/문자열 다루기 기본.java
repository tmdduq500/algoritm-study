class Solution {
    public boolean solution(String s) {
        int len = s.length();
        
        boolean answer = s.matches("^[0-9]*$");
        if((len==4||len==6)&&answer) return true;
        else return false;
    }
}