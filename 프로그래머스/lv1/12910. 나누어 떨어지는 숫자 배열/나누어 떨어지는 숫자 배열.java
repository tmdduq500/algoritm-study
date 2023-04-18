class Solution {
    public int[] solution(int[] arr, int divisor) {
        int num=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]%divisor==0){
                num++;
            }
        }
        
        if(num==0){
            int[] answer={-1};
            return answer;
        }
        
        int[] answer = new int[num];
        
        for(int j=0; j<arr.length;j++){
            if(arr[j]%divisor==0){
                answer[num-1]=arr[j];
                num--;
            }
            if(num==0){
                break;
            }
        }
        int temp=0;
        for(int p=0; p<answer.length; p++){
            for(int q=p+1; q<answer.length; q++){
                if(answer[p]>answer[q]){
                    temp=answer[p];
                    answer[p]=answer[q];
                    answer[q]=temp;
                }
            }
        }
        
        return answer;
        
    }
}