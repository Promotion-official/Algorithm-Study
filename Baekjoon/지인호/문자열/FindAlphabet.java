package string;

import java.util.Arrays;
import java.util.Scanner;

//https://www.acmicpc.net/problem/10809
public class FindAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer output = new StringBuffer();
        String s = sc.nextLine();
        char[] input = s.toCharArray();
        int[] result = new int[26];

        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }

        for (int i = 0; i < input.length; i++) {
            if(result[input[i] - 'a'] == -1) {
                result[input[i] - 'a'] = i;
            }
        }

        Arrays.stream(result).forEach(el -> output.append(el).append(" "));
        System.out.println(output);
    }
}
