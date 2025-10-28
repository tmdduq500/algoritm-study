class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = {};
        answer = new String[quiz.length];
        int answerIndex = 0;
        for (String s : quiz) {
            String[] split = s.split("="); // 3 - 4 / -3
            String[] split1 = split[0].split(" ");
            int tempAnswer = Integer.parseInt(split1[0]);
            for (int i = 1; i < split1.length - 1; i++) {
                switch (split1[i]) {
                    case "+":
                        i++;
                        tempAnswer += Integer.parseInt(split1[i]);
                        break;
                    case "-":
                        i++;
                        tempAnswer -= Integer.parseInt(split1[i]);
                        break;
                }
            }
            if (tempAnswer == Integer.parseInt(split[1].trim())) {
                answer[answerIndex] = "O";
            } else {
                answer[answerIndex] = "X";
            }
            answerIndex++;
        }
        return answer;
    }
}