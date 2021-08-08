package function;

//https://www.acmicpc.net/problem/15596
public class SumOfN {

    public long sum(int[] a) {
        long ans = 0;
        for(int n : a)
            ans += n;
        return ans;
        //return Arrays.stream(a).sum(); sum 이 int 최대치 보다 커서 long 에 담아야할 경우 오류발생
    }
}
