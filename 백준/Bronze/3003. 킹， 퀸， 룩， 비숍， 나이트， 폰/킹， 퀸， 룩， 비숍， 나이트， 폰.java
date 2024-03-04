import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] chessInput = new int[chess.length];

        for (int i = 0; i < chess.length; i++) {
            chessInput[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < chess.length; i++) {
            System.out.print(chess[i] - chessInput[i]+ " ");
        }
    }
}
