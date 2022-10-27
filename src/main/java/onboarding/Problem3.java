package onboarding;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            answer += numberOfClap(i);
        }

        return answer;
    }

    public static int numberOfClap(int num) {
        int count = 0;

        while (num > 0) {
            count = (num % 10 == 3 || num % 10 == 6 || num % 10 == 9)
                    ? (count + 1)
                    : count;
            num /= 10;
        }

        return count;
    }
}
