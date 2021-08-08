package for_statement;

import java.util.Scanner;

public class LessThanX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(a < x) sb.append(a).append(" ");
        }

        System.out.println(sb);
    }
}
