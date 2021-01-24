class Solution {
    public String solution(String s) {
        return s.length() % 2 != 0 ? s.substring(s.length() / 2, s.length() / 2 + 1) : s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
    }

    /////테스트코드//////
    public static void  main(String[] args){
        Solution s = new Solution();
        System.out.println(s.solution("abcde"));
        System.out.println(s.solution("qwer"));
    }
}