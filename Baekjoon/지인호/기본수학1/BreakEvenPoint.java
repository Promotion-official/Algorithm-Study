package basic_math_one;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1712
public class BreakEvenPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(b >= c) System.out.println(-1);
        else System.out.println(a / (c-b) + 1);
    }
}