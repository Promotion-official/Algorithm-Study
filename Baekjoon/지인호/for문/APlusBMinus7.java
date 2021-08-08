package for_statement;

import java.util.Scanner;

public class APlusBMinus7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sb.append(String.format("Case #%d: %d\n", i, a + b));
        }

        System.out.println(sb);
    }
}
