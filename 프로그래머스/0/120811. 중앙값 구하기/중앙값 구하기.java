import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        int length = array.length;
        int middle = length % 2 == 0 ? (length / 2)-1 : (length / 2 + 1)-1;
        IntStream sorted = Arrays.stream(array).sorted();
        int[] sortedArray = sorted.toArray();

        answer = sortedArray[middle];
        return answer;
    }
}