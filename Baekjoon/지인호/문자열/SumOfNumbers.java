package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/11720
public class SumOfNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfNumbers = Integer.parseInt(br.readLine());
        String numbers = br.readLine();

        int sum = 0;

        for (char c : numbers.toCharArray()) {
            sum += c - '0';
        }

        System.out.println(sum);
    }
}
