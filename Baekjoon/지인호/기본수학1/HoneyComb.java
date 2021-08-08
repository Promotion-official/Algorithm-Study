package basic_math_one;

import java.util.Scanner;

public class HoneyComb {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(countRoom(n));
    }

    private static int countRoom(int n) {
        int layer = 0;
        int room = 2;

        if (n == 1) return 1;

        while (room <= n)
            room = room + (6 * layer++);
        return layer;
    }
}
