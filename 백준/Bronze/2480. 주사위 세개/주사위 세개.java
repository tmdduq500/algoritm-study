import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer[] dice= new Integer[3];
        for(int i=0; i< 3; i++){
            dice[i] = Integer.parseInt(st.nextToken());
        }

        if( dice[0]==dice[1] && dice[1]==dice[2]){
            System.out.println(10000+ dice[0]*1000);
        }
        else if(dice[0]==dice[1]) System.out.println(1000+dice[0]*100);
        else if(dice[0]==dice[2]) System.out.println(1000+dice[0]*100);
        else if(dice[1]==dice[2]) System.out.println(1000+dice[1]*100);
        else{
            Arrays.sort(dice, Collections.reverseOrder());
            System.out.println(dice[0]*100);
        }
    }
}
