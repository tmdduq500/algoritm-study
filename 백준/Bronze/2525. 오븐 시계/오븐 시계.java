import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());

        if(B+C>=60){
            int plus_h= (B+C)/60;
            if(A+plus_h>23) {
                System.out.print(A + plus_h - 24 + " ");
                System.out.print((B + C) % 60);
            }else{
                System.out.print(A + plus_h+ " ");
                System.out.print((B + C) % 60);
            }
        }else{
            System.out.print(A+" ");
            System.out.print(B+C);
        }

    }
}


