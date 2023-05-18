import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

class Solution {
    public String solution(int a, int b) {
        String answer="";
        LocalDate date = LocalDate.of(2016, a, b);
        // 2. DayOfWeek 객체 구하기
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        // 3. 숫자 요일 구하기
        int dayOfWeekNumber = dayOfWeek.getValue();
        
        switch(dayOfWeekNumber){
            case 1:answer = "MON";
                break;
            case 2:answer = "TUE";
                break;
            case 3:answer = "WED";
                break;
            case 4:answer = "THU";
                break;
            case 5:answer = "FRI";
                break;
            case 6:answer = "SAT";
                break;
            case 7:answer = "SUN";
                break;    
        }
        return answer;
    }
}