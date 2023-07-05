import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 과목 갯수 입력
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        // 성적
        ArrayList<Float> score_arr =  new ArrayList<Float>();
        // 점수 입력
        for(int i = 0; i < N; i++) {
            score_arr.add(Float.parseFloat(st.nextToken()));
        }
        //최고점수 찾기
        score_arr.sort(Comparator.reverseOrder());
        float M = score_arr.get(0);

        //점수 바꾸기
        for(int i = 0; i < N; i++) {
            score_arr.set(i, score_arr.get(i)/M*100);
        }

        // 평균 구하기
        float sum = 0;
        for(int i = 0; i < N; i++) {
            sum += score_arr.get(i);
        }
        System.out.println(sum/N);
    }
}
