package string;

import java.util.Scanner;

//https://www.acmicpc.net/problem/5622
public class Dial {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        char[] encryptedNum = s.toCharArray();

        int[] decryptedNum = decryption(encryptedNum);

        int minTime = 0;
        for (int i : decryptedNum) {
            minTime += i + 1;
        }
        System.out.println(minTime);
    }

    private static int[] decryption(char[] encryptedNum) {
        int[] key = {0, 3, 6, 9, 12, 15, 19, 22, 100};
        int[] decryptedNum = new int[encryptedNum.length];
        for (int i = 0; i < encryptedNum.length; i++) {
            for (int j = 0; j < key.length-1; j++) {
                int code = encryptedNum[i] - 'A';
                if(key[j] <= code && code < key[j+1]) decryptedNum[i] = j+2;
            }
        }

        return decryptedNum;
    }
}
