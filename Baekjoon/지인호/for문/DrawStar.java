package for_statement;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2438
public class DrawStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                sb.append("*");
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
