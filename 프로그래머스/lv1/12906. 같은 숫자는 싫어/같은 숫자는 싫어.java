import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        //가변적으로 추가하기위해 ArrayList로 선언
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        //영향 안 가는 값 선언
        int num =-1;
        
        //ArrayList에 중복안되는 값 대입
        for(int i=0; i<arr.length; i++){
           if(arr[i]!=num){
               temp.add(arr[i]);
               num=arr[i];
           }
        }
        //ArrayList를 int형 배열로 변환
        int[] answer = new int[temp.size()];
        for(int j=0; j<temp.size(); j++){
            answer[j]= temp.get(j).intValue();
        }
        return answer;
    }
}