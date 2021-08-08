package basic_math_one;

import java.util.Scanner;

public class FoundFountain {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
        int sum = 0;
        int turn = 0;
        int cnt = 0;

        for( cnt = 0; sum < x; cnt++) {
            sum += cnt;
        }
        turn = x - sum;

        int sumOfDenominatorAndNumerator = cnt + 1;
        int denominator = turn;
        int numerator = sumOfDenominatorAndNumerator - denominator;
        System.out.printf("%d/%d", numerator, denominator);
    }
}
