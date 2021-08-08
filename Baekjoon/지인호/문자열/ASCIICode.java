package string;

import java.util.Scanner;

//https://www.acmicpc.net/problem/11654
public class ASCIICode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char a = sc.nextLine().toCharArray()[0];
        System.out.printf("%d", (int)a);
    }
}
