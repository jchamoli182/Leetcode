package leetcode.arrays;

import java.util.HashSet;

public class Maximum_Erasure_Value {
    public static void main(String[] args){
        int[] arr = {4,2,4,5,6};

        System.out.println(maximumUniqueSubarray(arr));
    }

    public static int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;

        HashSet<Integer> st = new HashSet<>();

        int i = 0;
        int j = 0;

        int ans = Integer.MIN_VALUE;
        int sum = 0;

        while(j<n){

            while(j<n && !st.contains(nums[j])){
                sum += nums[j];
                st.add(nums[j]);
                j++;
            }

            ans = Math.max(ans,sum);
            sum -= nums[i];
            st.remove(nums[i]);
            i++;
        }

        return ans;
    }


}
