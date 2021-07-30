package if_statement;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1330
public class CompareTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        String compareStatement = "";
        if(a > b) compareStatement = ">";
        else if (a < b) compareStatement = "<";
        else compareStatement = "==";

        System.out.println(compareStatement);
    }
}
