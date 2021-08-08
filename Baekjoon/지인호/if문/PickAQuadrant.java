package if_statement;

import java.util.Scanner;

//https://www.acmicpc.net/problem/14681
public class PickAQuadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x > 0) //x 가 양수
            if(y > 0) //y 가 양수
                System.out.println(1);
            else //y != 0 이므로 y 가 음수
                System.out.println(4);
        if(x < 0) //x 가 음수
            if(y > 0) //y 가 양수
                System.out.println(2);
            else //y != 0 이므로 y 가 음수
                System.out.println(3);
    }
}
