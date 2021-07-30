package for_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//https://www.acmicpc.net/problem/15552
public class FastAPlusB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int a, b;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < t; i++) {
            String input = br.readLine();
            a = Integer.parseInt(input.split(" ")[0]);
            b = Integer.parseInt(input.split(" ")[1]);
            sb.append(a+b).append("\n");
        }

        System.out.println(sb);
    }
}
