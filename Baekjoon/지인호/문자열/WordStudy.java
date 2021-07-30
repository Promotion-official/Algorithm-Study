package string;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1157
public class WordStudy {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine().toUpperCase();
        char[] arr = s.toCharArray();
        int[] map = new int[26];

        for (char c : arr) {
            map[c - 'A']++;
        }

        int max = 0;
        char result = ' ';
        for (int i = 0; i < map.length; i++) {
            if(max < map[i]) {
                max = Math.max(max, map[i]);
            }
        }

        for(int i = 0; i < map.length; i++) {
            if(max == map[i]) {
                if(result == ' ') {
                    result = (char) ('A' + i);
                } else {
                    result = '?';
                    break;
                }
            }
        }

        System.out.println(result);
    }
}
