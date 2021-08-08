package for_statement;

import java.util.Scanner;

//https://www.acmicpc.net/problem/10950
public class APlusBMinus3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a, b;
        int[] answer = new int[t];
        for(int i = 0; i < t; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            answer[i] = a + b;
        }

        for(int el : answer) {
            System.out.println(el);
        }
    }
}
