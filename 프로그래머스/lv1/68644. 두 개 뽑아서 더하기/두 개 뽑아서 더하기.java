import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        
        //List에 합한 값 넣기
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int sum=0;
        
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                sum=numbers[i]+numbers[j];
                arr.add(sum);
                sum=0;
            }
        }
        //중복 제거
        ArrayList<Integer> temp = new ArrayList<Integer>();
        
        for(Integer num : arr){
            if(!temp.contains(num))
                temp.add(num);
        }
        
        //Integer배열 Int배열로 변환
        int answer[]=new int[temp.size()];
        for(int k=0; k<temp.size(); k++){
            answer[k]=temp.get(k);
        }
        
        //정렬
        Arrays.sort(answer);
        return answer;
    }
}