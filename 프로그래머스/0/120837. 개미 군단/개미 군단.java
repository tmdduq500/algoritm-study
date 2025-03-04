import java.util.*;
class Solution {
    public int solution(int hp) {
        int answer = 0;
        int[] ants = new int[3];
        Map<String, Integer> map = new HashMap<>();
        map.put("general", 5);
        map.put("soldier", 3);
        map.put("worker", 1);

        int generalNums = 0;
        int soldierNums = 0;
        int workerNums = 0;
        int remainHp = 0;

        generalNums = hp / map.get("general");
        if(hp % map.get("general") != 0){
            remainHp = hp % map.get("general");
            soldierNums = remainHp / map.get("soldier");
            if(remainHp % map.get("soldier") != 0){
                remainHp = remainHp % map.get("soldier");
                workerNums = remainHp / map.get("worker");
            }
        }

        answer = generalNums + soldierNums + workerNums;
        return answer;
    }
}