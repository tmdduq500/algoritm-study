class Solution {
    public String[] solution(String[] strings, int n) {
        int arr_len = strings.length;
        String temp="";
        String temp2="";
        
        for(int i=0; i<arr_len; i++){
            for(int j=i+1; j<arr_len; j++){
                if((strings[i].charAt(n))>(strings[j].charAt(n))){
                    temp=strings[i];
                    strings[i]=strings[j];
                    strings[j]=temp;
                }
                if((strings[i].charAt(n))==(strings[j].charAt(n))){
                        if(strings[i].compareTo(strings[j])>0){
                            temp2=strings[i];
                            strings[i]=strings[j];
                            strings[j]=temp2;
                        }
                    }
            }            
        }
        
        return strings;
    }
}