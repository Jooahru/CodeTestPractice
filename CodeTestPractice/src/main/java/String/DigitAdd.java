package String;

public class DigitAdd {

    int digitAdd(int n) {
        int answer = 0;

        String[] NumberToString = Integer.toString(n).split("");
        for (String Number : NumberToString) {
            answer += Integer.parseInt(Number);
        }

        return answer;
    }

    public int digitAdd2(int n) {
        int answer = 0;

        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        DigitAdd digitAdd = new DigitAdd();
        System.out.println("결과 : " + digitAdd.digitAdd(123));
        System.out.println("결과 : " + digitAdd.digitAdd(456));
        System.out.println("결과 : " + digitAdd.digitAdd2(333));
        System.out.println("결과 : " + digitAdd.digitAdd2(123));
    }
}
