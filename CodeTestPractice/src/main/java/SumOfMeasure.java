public class SumOfMeasure {
    public int solution(int n) {
        int answer = 0;
        int t = 1;
        while(t <=n){
            if(n%t ==0){
                answer += t;
            }
            t++;
        }
        return answer;
    }

    public int solution2(int num) {
        int answer = 0;
        for(int i = 1; i <= num/2; i++){
            if(num%i == 0) answer += i;
        }
        return answer+num;
    }

    public static void main(String[] args) {
        SumOfMeasure sumOfMeasure = new SumOfMeasure();
        System.out.println(sumOfMeasure.solution(12));
        System.out.println(sumOfMeasure.solution2(12));
    }
}
