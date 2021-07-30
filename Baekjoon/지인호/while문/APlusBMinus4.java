package while_statement;

import java.util.Scanner;

public class APlusBMinus4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            sb.append(a + b).append('\n');
        }

        System.out.println(sb);
    }
}
