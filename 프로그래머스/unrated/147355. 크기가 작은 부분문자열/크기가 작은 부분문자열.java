class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int p_len = p.length();
        int t_len = t.length();
        int sum=0;
        
        for(int i=0; i<=t_len-p_len; i++){
            String cut=t.substring(i,i+p_len);
            long cut_num = Long.parseLong(cut);
            long p_num = Long.parseLong(p);

            if(cut_num<=p_num){
                sum++;
            }
        }
        return sum;
    }
}