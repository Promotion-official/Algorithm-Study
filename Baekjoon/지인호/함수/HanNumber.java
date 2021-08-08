package function;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1065
public class HanNumber {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt(); //어차피 입력이 1개
        int numOfHanNumber = 0;
        for (int i = 1; i <= n; i++)
            if (isHanNumber(i)) numOfHanNumber++;

        System.out.println(numOfHanNumber);
    }

    public static boolean isHanNumber(int n) {
        int prev = n % 10; //이전값

        n /= 10;
        int r = (n % 10) - prev; //공차

        while (n > 0) {
            int a = n % 10;
            if (prev + r != a) return false;

            prev = a;
            n /= 10;
        }
        return true;
    }
}

