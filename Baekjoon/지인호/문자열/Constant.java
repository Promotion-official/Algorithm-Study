package string;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2908
public class Constant {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();

        String[] input = s.split(" ");
        int a, b;

        a = Integer.parseInt(reverse(input[0]));
        b = Integer.parseInt(reverse(input[1]));

        System.out.println(Math.max(a, b));
    }

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
