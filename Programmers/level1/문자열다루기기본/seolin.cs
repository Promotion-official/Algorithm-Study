public class Solution {
    public bool solution(string s) {
        bool answer = true;
        int n = 0;
        answer = (s.Length != 4 && s.Length != 6 || int.TryParse(s, out n) == false) ? false : true;
        return answer;
    }
}