import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int[] list = new int[N];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < list.length; i++){
            list[i] = Integer.parseInt(st2.nextToken());
        }

        for(int j : list){
            if(j<X){
                System.out.print(j+" ");
            }
        }



    }
}
