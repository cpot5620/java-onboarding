package onboarding;

import java.sql.Wrapper;

public class Problem4 {
    public static String solution(String word) {
        Word answer = new Word(word);

        return answer.conversion();
    }
}
