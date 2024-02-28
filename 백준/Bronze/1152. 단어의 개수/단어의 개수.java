import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().trim();

        List<String> inputList = List.of(input.split(" "));

        if (inputList.get(0) == "") {
            System.out.println(0);
        }
        else {
            System.out.println(inputList.size());
        }

    }
}
