using System;

public class Solution {
    public int[] solution(int[] array, int[,] commands) {
          int[] answer = new int[commands.GetLength(0)];

            for (int i = 0; i < commands.GetLength(0); i++){
                int[] arraySort = new int[commands[i, 1] - commands[i, 0] + 1];
                int arraySortIdx = 0;
                for (int j = commands[i, 0]; j <= commands[i, 1]; j++){
                    arraySort[arraySortIdx++] = array[j - 1];

                    if (j == commands[i, 1]){
                        Array.Sort(arraySort, (a, b) => a > b ? 1 : -1);
                        answer[i] = arraySort[commands[i, 2] - 1];
                    }
                }
            }

            return answer;
    }
}