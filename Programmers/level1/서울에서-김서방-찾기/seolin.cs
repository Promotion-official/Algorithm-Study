using System;

public class Solution {
    public string solution(string[] seoul) {
        int index = Array.FindIndex(seoul, i => i == "Kim");
        return $"김서방은 {index}에 있다";
    }
}