public class sumoffebbonecci {
    public static void main(String[] args) {
        int n = 4;
        int sum =1;
        int dp[]   =  new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<dp.length;i++)
        {
            dp[i] =  dp[i-1]+dp[i-2];
            sum+=dp[i];
        }

        System.out.println(sum);
    }
}
