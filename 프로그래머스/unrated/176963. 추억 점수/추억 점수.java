import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int cal=0;
        int len = photo.length;
        int[] answer = new int[len];
        
        //name과 yearning Map으로 조합
        HashMap<String, Integer> sum = new HashMap<>();
        for(int i=0; i<name.length; i++){
            sum.put(name[i], yearning[i]);
        }
        
        for(int j=0; j<len; j++){
            for(int k=0; k<photo[j].length; k++){
                cal+=sum.getOrDefault(photo[j][k],0);
            }
            answer[j]=cal;
            cal=0;
        }
        return answer;
    }
}