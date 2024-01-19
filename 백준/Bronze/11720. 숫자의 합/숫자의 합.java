import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String number = br.readLine();

        String[] numbers = new String[N];
        numbers = number.split("");

        int sum = 0;
        for( int i = 0; i < numbers.length; i++) {
            sum += Integer.parseInt(numbers[i]);
        }
        System.out.println(sum);
    }
}
