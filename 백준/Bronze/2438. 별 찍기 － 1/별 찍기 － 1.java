import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        countStar(N);

    }

    static void countStar(int n) {
        for(int i=0; i<n; i++) {
            for(int j = 0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}