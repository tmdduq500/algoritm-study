import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        Set<Integer> divisors = new TreeSet<>();
        for (int i = 1; i * i <= n; i++) {      
            if (n % i == 0) {                   
                divisors.add(i);                
                divisors.add(n / i);            
            }
        }

        answer = divisors.stream()          
                .mapToInt(Integer::intValue)
                .toArray();      
        return answer;
    }
}