package for_statement;

import java.util.Scanner;

//https://www.acmicpc.net/problem/8393
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((int)((n + 1) * (n/(double)2)));
    }
}
