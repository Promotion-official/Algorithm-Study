package if_statement;

import java.util.Scanner;

//https://www.acmicpc.net/problem/9498
public class TestScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        String rank = "";
        if(score >= 90) rank = "A";
        else if(score >= 80) rank = "B";
        else if(score >= 70) rank = "C";
        else if(score >= 60) rank = "D";
        else rank = "F";

        System.out.println(rank);
    }
}
