package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2675
public class RepeatString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String input = br.readLine();
            int r = input.toCharArray()[0] - '0';
            String s = input.substring(2);
            for (char c : s.toCharArray()) {
                for (int j = 0; j < r; j++) {
                    output.append(c);
                }
            }
            output.append('\n');
        }

        System.out.println(output);
    }
}
