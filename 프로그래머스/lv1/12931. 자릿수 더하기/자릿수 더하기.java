import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String temp = Integer.toString(n);
        int[] digits = new int[temp.length()];
        
        for (int i = 0; i < temp.length(); i++)
            digits[i] = temp.charAt(i) - '0';
        
        for(int j=0; j<digits.length; j++){
            answer+=digits[j];
        }

        return answer;
    }
}