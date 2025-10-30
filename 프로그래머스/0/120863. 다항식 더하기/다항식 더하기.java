import java.util.Arrays;

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int xNum = 0;
        int naturalNum = 0;

        String[] split = polynomial.split(" ");
        System.out.println("split = " + Arrays.toString(split));
        for (String s : split) {
            if (s.contains("x")) {
                String[] split1 = s.split("x");
                if (split1.length == 0) {
                    xNum += 1;
                } else {
                    xNum += Integer.parseInt(split1[0]);
                }
            } else if (!s.contains("+")) {
                naturalNum += Integer.parseInt(s);
            }
        }

        if (xNum != 0 && naturalNum != 0) {
            if (xNum == 1) {
                answer = "x" + " + " + naturalNum;
            } else {
                answer = xNum + "x" + " + " + naturalNum;
            }
        } else if (xNum != 0) {
            if (xNum == 1) {
                answer = "x";
            } else {
                answer = xNum + "x";
            }
        } else if (naturalNum != 0) {
            answer = String.valueOf(naturalNum);
        }
        return answer;
    }
}