package for_statement;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2439
public class DrawStar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //6

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) { //0...5
            int j;
            for(j = n - i - 1; j > 0; j--) { //5 4 3 2 1
                sb.append(" ");
            }
            for(j = n - i - 1; j < n; j++) {
                sb.append("*");
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
