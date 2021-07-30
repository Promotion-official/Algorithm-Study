package string;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2941
public class CroatianAlphabet {
    public static void main(String[] args) {
        String[] croatian = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String s = new Scanner(System.in).nextLine();

        for (String alphabet : croatian) {
            s = s.replace(alphabet, "_");
        }

        System.out.println(s.length());
    }
}
