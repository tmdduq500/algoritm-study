import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> temp=new ArrayList<Integer>();
        ArrayList<Integer> answer=new ArrayList<Integer>();
        
        int arr_len=array.length;  //7
        int com_len=commands.length;    //3

        //조건에 맞게 Integer배열에 넣기
        for(int i=0; i<com_len; i++){
            for(int j=(commands[i][0])-1; j<=(commands[i][1])-1; j++){
                temp.add(array[j]);
            }
            Collections.sort(temp);
            answer.add(temp.get((commands[i][2])-1));
            temp.clear();
        }
        
        
        
        //Integer배열->int배열
        int ans[]= new int[answer.size()];
        for(int k=0; k<answer.size(); k++){
            ans[k]=answer.get(k).intValue();
        }
        
        return ans;
    }
}