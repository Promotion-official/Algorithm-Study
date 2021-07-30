package function;

//https://www.acmicpc.net/problem/4673
public class SelfNumber {
    //에라토스테네스의 체 응용
    private static boolean[] numbers = new boolean[10000];
    public static void main(String[] args) {
        //문제에서 마지막 self number 가 9993이었으므로 9992 까지만 체크하면 된다.
        for (int i = 1; i <= 9992; i++) {
            int d = d(i);
            if(d < numbers.length)
                numbers[d] = true; //false 가 self number 이다
        }

        //문제에서 마지막 self number 가 9993이었으므로 굳이 마지막까지 확인할 필요가 없다
        for(int i = 1; i <= 9993; i++)
            if(!numbers[i]) System.out.println(i);
    }

    public static int d(int n) {
        int sum = n;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
