package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/10818
public class MinMax {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int min = 1000000 , max = -1000000;

        for(int num : arr) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        System.out.println(min + " " + max);
    }
}
