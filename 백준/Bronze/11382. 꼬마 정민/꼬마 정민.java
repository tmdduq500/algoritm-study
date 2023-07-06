import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long[] num = new long[3];
        for(int i = 0; i < 3; i++){
            num[i] = Long.parseLong(st.nextToken());
        }
        long sum = num[0]+num[1]+num[2];
        bw.write(String.valueOf(sum));
        bw.close();
    }
}
