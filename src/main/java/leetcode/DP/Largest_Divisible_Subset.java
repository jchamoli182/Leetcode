package leetcode.DP;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Largest_Divisible_Subset {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(largestDivisibleSubset(nums));
    }

    public static List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int[] dp = new int[n];
        int[] prev = new int[n];
        for(int i=0;i<n;i++){
            dp[i] = 1;
            prev[i] = -1;
        }

        int maxi = 0;
        int idx = 0;

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i] % nums[j] == 0){
                    if(dp[i] < dp[j]+1){
                        dp[i] = dp[j]+1;
                        prev[i] = j;
                    }

                    if(maxi < dp[i]){
                        maxi = dp[i];
                        idx = i;
                    }
                }
            }
        }

        List<Integer> ans = new ArrayList<>();
        while(idx != -1){
            ans.add(nums[idx]);
            idx = prev[idx];
        }

        return ans;

    }
}


