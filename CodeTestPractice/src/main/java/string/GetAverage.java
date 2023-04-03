package string;

import java.util.Arrays;

public class GetAverage {


    public double solution(int[] arr) {
        double answer = 0;
        for (int j : arr) {
            answer += j;
        }
        answer /= arr.length;
        return answer;
    }

    public int solution2(int[] array) {
        return (int) Arrays.stream(array).average().orElse(0);
    }

    public int solution3(int[] array) {
        if (array == null) {
            return 0;
        }
        int ret = 0;
            for (int n : array) {
                ret += n;
            }
        return ret / array.length;
    }

    public static void main(String[] args) {
        int x[] = {5, 4, 3};
        GetAverage getAverage = new GetAverage();
        System.out.println(" 평균값 : " + getAverage.solution(x));
        System.out.println(" 평균값 : " + getAverage.solution2(x));
        System.out.println(" 평균값 : " + getAverage.solution3(x));
    }
}
