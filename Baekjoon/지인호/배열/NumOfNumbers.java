package array;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2577
public class NumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] result = new int[10];
        int a, b, c;
        long n;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        n = (long)a * b * c;

        while (n > 0) {
            result[(int)n % 10]++;
            n /= 10;
        }

        for (int element: result) {
            System.out.println(element);
        }
    }
}
