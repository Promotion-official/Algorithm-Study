package string;

import java.util.Scanner;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/1152
public class NumOfWord {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();

        StringTokenizer tokenizer = new StringTokenizer(s, " ");
        System.out.println(tokenizer.countTokens());
    }
}
