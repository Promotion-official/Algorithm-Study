package array;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2562
public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idx = 0, max = 0;
        for(int i = 0; i < 9; i++) {
            int n = sc.nextInt();
            if(max < n) {
                idx = i;
                max = n;
            }
        }

        System.out.println(max + "\n" + (idx + 1));
    }
}
