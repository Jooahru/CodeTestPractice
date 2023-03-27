import java.util.ArrayList;
import java.util.Scanner;

/*
 뒤집어서 소수인 숫자 찾기*/
public class Array6 {

    public boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> solution(int num, int[] numArray) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            int tmp = numArray[i];
            int res = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if (isPrime(res)) {
                answer.add(res);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Array6 array6 = new Array6();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] numArray = new int[num];
        for (int i = 0; i < num; i++) {
            numArray[i] = kb.nextInt();
        }
        for (int x : array6.solution(num, numArray)) {
            System.out.print(x + " ");
        }
    }

}
