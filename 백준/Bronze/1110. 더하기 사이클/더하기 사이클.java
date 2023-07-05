import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        // 수 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if (N < 0 || N > 99) {
            System.out.println("N은 0부터 99까지의 수");
            return; // 프로그램 종료
        }
        ArrayList<Integer> arr = new ArrayList<Integer>();
        if( N < 10) {
            arr.add(0);
            arr.add(N);
        }
        else {
            arr.add(N/10);  //2
            arr.add(N%10);  //6
        }
        // 싸이클 돌리기
        int sum = 0;
        while(true){
            if(arr.get(arr.size()-2)+ arr.get(arr.size()-1) < 10 ){
                arr.add(arr.get(arr.size()-2)+ arr.get(arr.size()-1));
            }else{
                arr.add((arr.get(arr.size()-2)+ arr.get(arr.size()-1))%10);
            }
            sum = arr.get(arr.size()-2) * 10 + arr.get(arr.size()-1);
            if(sum == N) {
                System.out.println(arr.size()-2);
                break;
            }
            else continue;
        }

    }
}
