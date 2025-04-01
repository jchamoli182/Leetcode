package leetcode.DP;

public class Solving_Questions_With_Brainpower {
    public static void main(String[] args) {
        int[][] questions = {{1, 2}, {2, 3}, {4, 5}};
        System.out.println(Solve(questions));
    }

    public static long Solve(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n + 1];
        dp[n] = 0;

        for (int i = n - 1; i >= 0; i--) {
            long np = 0;
            long p = questions[i][0];
            if(i+1+questions[i][1] < n){
                p = dp[i + 1 + questions[i][1]];
            }
            np = (i+1) < n ? dp[i + 1] : 0;
            dp[i] = Math.max(np, p + questions[i][0]);
        }

        System.out.println(dp[0]);

        return dp[0];
    }
}
