package leetcode.arrays;

public class Count_Subarrays_Where_Max_Element_Appears_at_Least_K_Times {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,3,1,2};
        int k = 2;
        System.out.println(countSubarrays(arr, k));
    }

    public static long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int maxi = 0;
        int count = 0;
        for(int I : nums){
            maxi = Math.max(maxi,I);
        }

        long ans = 0;
        while(j < n){
            if(nums[j] == maxi) count++;

            while(i < n && count == k){
                ans += (n-j);
                if(nums[i] == maxi) count--;
                i++;
            }

            j++;
        }

        return ans;
    }
}
