using System;

public class Solution {
    public int[] solution(int[] array, int[,] commands) {
        
        int commandsTwoDimensionalLen = commands.GetLength(0);
        int[] answer = new int[commandsTwoDimensionalLen];

        for (int i = 0; i < commandsTwoDimensionalLen; i++){
            int startNum = commands[i, 0];
            int endNum = commands[i, 1];
            int pickNum = commands[i, 2] - 1;
            
            int[] arraySort = new int[endNum - startNum + 1];
            int arraySortIdx = 0;
            for (int j = startNum; j <= endNum; j++){
                arraySort[arraySortIdx++] = array[j - 1];

                if (j == commands[i, 1]){
                    Array.Sort(arraySort, (a, b) => a > b ? 1 : -1);
                    answer[i] = arraySort[pickNum];
                }
            }
        }

        return answer;
    }
}