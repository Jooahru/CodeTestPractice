package String;

public class EvenOrOdd {
    String evenOrOdd(int num) {
        String answer = "";
        if(num%2 == 0){
            answer = "Even";
        }else{
            answer = "Odd";
        }
        return answer;
    }

    String evenOrOdd2(int num) {
        return num % 2 == 0 ? "Even": "Odd";
    }

    public static void main(String[] args) {
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        System.out.println("결과 : " + evenOrOdd.evenOrOdd(3));
        System.out.println("결과 : " + evenOrOdd.evenOrOdd(2));
        System.out.println("결과 : " + evenOrOdd.evenOrOdd2(3));
        System.out.println("결과 : " + evenOrOdd.evenOrOdd2(2));
    }
}
