package io_and_arithmetic_operation;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2588
public class Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a * (b % 10));
        System.out.println(a * (b % 100 /10));
        System.out.println(a * (b / 100));
        System.out.println(a * b);
    }
}
