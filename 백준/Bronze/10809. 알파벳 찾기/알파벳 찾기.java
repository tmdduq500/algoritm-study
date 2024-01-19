import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word  = br.readLine();

        String[] alphabet = {
                "a","b","c","d","e","f","g", "h","i","j","k","l","m",
                "n","o","p","q","r","s","t","u","v","w","x","y","z"
        };

        int[] checkPosition = new int[alphabet.length];
        for(int i = 0; i <alphabet.length; i++) {
            if(word.indexOf(alphabet[i])!=-1) {
                checkPosition[i] = word.indexOf(alphabet[i]);
            }
            else {
                checkPosition[i] = -1;
            }
        }

        for(int i : checkPosition) {
            System.out.print(i + " ");
        }
    }
}
