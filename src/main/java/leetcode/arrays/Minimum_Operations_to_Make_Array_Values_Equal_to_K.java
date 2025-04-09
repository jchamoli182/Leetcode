package leetcode.arrays;

import java.util.HashSet;

public class Minimum_Operations_to_Make_Array_Values_Equal_to_K {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int k = 3;
        System.out.println(minOperations(nums, k));
    }
     public static int minOperations(int[] nums, int k) {
        HashSet<Integer> st = new HashSet<>();
        int mini = Integer.MAX_VALUE;

        for(int i : nums){
            mini = Math.min(mini,i);
            st.add(i);
        }
        if(mini == k) return st.size()-1;
        
        return mini < k ? -1 : st.size();
    }
}
