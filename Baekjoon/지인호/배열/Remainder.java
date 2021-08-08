package array;

import java.util.Scanner;

//https://www.acmicpc.net/problem/3052
public class Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] result = new boolean[42];
        int count = 0;

        for(int i = 0; i < 10; i++) {
            result[sc.nextInt() % 42] = true;
        }

        for (boolean b : result) {
            if(b) count++;
        }

        System.out.println(count);
    }
}
