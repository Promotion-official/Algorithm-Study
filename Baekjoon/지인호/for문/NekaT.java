package for_statement;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2742
public class NekaT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i = n; i >= 1; i--) {
            sb.append(i).append('\n');
        }

        System.out.println(sb);
    }
}
