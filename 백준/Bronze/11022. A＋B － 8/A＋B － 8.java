import java.io.*;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int[] sum = new int[T];
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            sum[i] = A + B;
            bw.write("Case #"+Integer.toString(i+1)+": ");
            bw.write(Integer.toString(A)+" + "+Integer.toString(B));
            bw.write(" = "+Integer.toString(sum[i]));
            bw.newLine();

        }

        bw.flush(); // 남아있는 데이터 모두 출력
        bw.close();

    }
}
