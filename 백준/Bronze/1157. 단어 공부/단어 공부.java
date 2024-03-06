import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toUpperCase();

        String[] devideInput = input.split("");
        String[] removeDuplicate = Arrays.stream(devideInput).distinct().toArray(String[]::new);

        int[] count = new int[removeDuplicate.length];
        int max = 0;
        int maxIndex = 0;
        boolean checkDuptlicate = false;

        for (int i = 0; i < removeDuplicate.length; i++) {
            for (int j = 0; j < devideInput.length; j++ ) {
                if (removeDuplicate[i].equals(devideInput[j])) {
                    count[i]+=1;
                }
            }

            if(max < count[i]) {
                max = count[i];
                maxIndex = i;
                checkDuptlicate = false;
            }
            else if (max == count[i]) {
                checkDuptlicate = true;
            }
        }

        if (checkDuptlicate) {
            System.out.println("?");
        } else {
            System.out.println(removeDuplicate[maxIndex]);
        }
    }
}
