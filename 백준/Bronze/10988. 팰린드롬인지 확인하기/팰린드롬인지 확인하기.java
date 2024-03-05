import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] words = input.split("");
        int wordsLength = words.length;
        int wordsLengthcCenter = wordsLength/2;

        int count = 0;
        if (wordsLength % 2 == 0) {
            for (int i = 1; i <= wordsLengthcCenter; i++) {
                if (words[wordsLengthcCenter-i].equals(words[wordsLengthcCenter -1 + i])) {
                    count++;
                }
            }
        }
        else {
            for (int i = 1; i <= wordsLengthcCenter; i++) {
                if (words[wordsLengthcCenter-i].equals(words[wordsLengthcCenter + i])) {
                    count++;
                }
            }
        }

        if(count == wordsLengthcCenter){
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}
