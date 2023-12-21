import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] list = new int[N];
        for(int i = 0; i < list.length; i++){
            list[i] = i+1;
        }


        for (int k = 0; k < M; k++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st2.nextToken());
            int j = Integer.parseInt(st2.nextToken());

            int start = i-1;
            int end = j-1;
            while(start < end) {
                int temp = 0;

                temp = list[start];
                list[start]=list[end];
                list[end]=temp;
                start++;
                end--;
            }

        }

        for (int i : list) {
            System.out.print(i+" ");
        }

    }
}
