package leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class Count_the_Number_of_Good_Subarrays {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
        int k = 3;
        System.out.println(countGood(nums, k));
    }
    public static long countGood(int[] nums, int k) {
        int n = nums.length;
        long ans = 0;
        int i=0;
        int j = 0;
        int pair = 0;
        Map<Integer,Integer> mp = new HashMap<>();

        while(j < n){
            pair +=  mp.getOrDefault(nums[j],0);
            mp.put(nums[j], mp.getOrDefault(nums[j],0)+1);

            while(pair >= k){
                ans += (n-j);
                mp.put(nums[i],mp.get(nums[i])-1);
                pair -= mp.get(nums[i]);
                i++;
            }
            j++;
        }

        return ans;
    }
}
