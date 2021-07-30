package array;

import java.util.Scanner;

//https://www.acmicpc.net/problem/8958
public class OXQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {


            int scoreModifier = 0;
            int score = 0;
            for (char c : sc.nextLine().toCharArray()) {
                if(c == 'O') score += ++scoreModifier;
                else scoreModifier = 0;
            }

            sb.append(score).append('\n');
        }
        System.out.println(sb);
    }
}
