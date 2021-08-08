package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/1316
public class GroupWordChecker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int numOfGroupWord = 0;

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if(isGroupWord(word)) numOfGroupWord++;
        }

        System.out.println(numOfGroupWord);
    }

    public static boolean isGroupWord(String word) {
        boolean[] stack = new boolean[26];
        char prev = ' ';
        for (char c : word.toCharArray()) {
            if(prev == ' ') {
                prev = c;
            } else if(prev != c) {

                if(!stack[c - 'a']) {
                    prev = c;
                } else {
                    return false;
                }
            }
            stack[c - 'a'] = true;
        }
        return true;
    }
}
