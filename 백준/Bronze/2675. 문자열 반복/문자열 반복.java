import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            String[] word = S.split("");

            calculate(R,word);
        }


    }

    static void calculate(int R, String[] word) {
        for ( int i = 0; i < word.length; i++) {
            for(int j = 0; j < R; j++) {
                System.out.print(word[i]);
            }
        }
        System.out.println();
    }
}
