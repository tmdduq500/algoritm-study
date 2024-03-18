import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();


        String[] croatiaAlphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int beforeCount = 0;
        int count = 0;

        for(int i = 0; i < input.length(); i++) {
            beforeCount = count;
            for(int j = 0; j < croatiaAlphabet.length; j++) {

                if (i + croatiaAlphabet[j].length() > input.length()) {
                    continue;
                }
                boolean compareWords = croatiaAlphabet[j].equals(input.substring(i, i + croatiaAlphabet[j].length()));

                if (compareWords) {
                    count++;
                    i = i + croatiaAlphabet[j].length()-1;
                    break;
                }
            }

            if (beforeCount >= count) {
                count++;
            }
        }

        System.out.println(count);
    }
}
