import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        StringBuffer sb = new StringBuffer(a);
        String reverseA = sb.reverse().toString();
        StringBuffer sb2 = new StringBuffer(b);
        String reverseB = sb2.reverse().toString();

        int lastA = Integer.parseInt(reverseA);
        int lastB = Integer.parseInt(reverseB);

        if (lastA > lastB) {
            System.out.println(lastA);
        }
        else {
            System.out.println(lastB);
        }

    }
}
