package array;

import java.util.Scanner;

//https://www.acmicpc.net/problem/4344
public class AboveAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //sb 보단 output 이 변수의 기능을 더 잘설명한다.
        StringBuilder output = new StringBuilder();
        int c = sc.nextInt();


        for (int i = 0; i < c; i++) {
            int numOfStudent = sc.nextInt();
            int[] scores = new int[numOfStudent];
            int sum = 0;
            double avg;
            for (int j = 0; j < numOfStudent; j++) {
                int input = sc.nextInt();
                scores[j] = input;
                sum += input;
            }

            avg = sum / (double) numOfStudent;
            int numOfSmartStudents = 0; //평균을 넘는 학생 수
            double ratioOfSmartStudents; //평균을 넘는 학생들의 비율

            for (int score : scores) {
                if(score > avg) numOfSmartStudents++;
            }
            ratioOfSmartStudents = (double)numOfSmartStudents / numOfStudent * 100;
            output.append(String.format("%.3f%%\n", ratioOfSmartStudents));
        }

        System.out.println(output);
    }
}
