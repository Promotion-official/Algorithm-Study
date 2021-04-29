public class Solution {
    public string solution(string s) {
        return (s.Length % 2 == 0) ? s.Substring(s.Length/2 - 1, 2) : s.Substring(s.Length / 2, 1);
    }
};