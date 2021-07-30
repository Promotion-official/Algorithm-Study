package array;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1546
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double sum = 0;
        double[] scores = new double[n];
        double max = 0;

        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
            max = Math.max(max, scores[i]);
        }

        for (double score : scores) {
            sum += score / max * 100;
        }

        System.out.println(sum / n);
    }
}
