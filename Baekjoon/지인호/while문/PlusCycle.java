package while_statement;

import java.util.Scanner;

public class PlusCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = n;
        int count = 1;

        int left, right;
        while(true) {

            left = a / 10;
            right = a % 10;

            int sum = left + right;
            int next = (right * 10) + (sum % 10);

            if(next == n) break;

            a = next;
            count++;
        }

        System.out.println(count);
    }
}
