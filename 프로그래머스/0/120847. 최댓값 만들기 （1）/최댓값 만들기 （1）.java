import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max1 = 0;
        int max2 = 0;
        max1 = Arrays.stream(numbers).max().getAsInt();

        int count = 0;
        for (int number : numbers) {
            if (max1 == number) {
                count++;
            }
        }
        if (count != 1) {
            answer = max1 * max1;
        } else {
            int finalMax = max1;
            int[] array = Arrays.stream(numbers).filter(i -> i != finalMax).toArray();
            max2 = Arrays.stream(array).max().getAsInt();
            answer = max1 * max2;
        }

        return answer;
    }
}