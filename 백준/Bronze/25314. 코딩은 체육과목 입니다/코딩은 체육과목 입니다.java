import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int a = N/4;
        int b = N%4;

        if( b>0){
            for(int i=0; i<a+1; i++){
                System.out.print("long ");
            }
        }else{
            for(int i=0; i<a; i++){
                System.out.print("long ");

            }
        }
        System.out.println("int");
    }
}
