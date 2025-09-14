package leetcode.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort_Colors {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(0,2,2,1,0);
        sortColors(arr);
        System.out.println(arr);
    }

    public static void sortColors(List<Integer> nums) {

        int mid = 0;
        int low = 0;
        int high = nums.size() - 1;

        while(mid <= high){
            if(nums.get(mid) == 0){
                Collections.swap(nums,mid,low);
                mid++;
                low++;
            }
            else if(nums.get(mid) == 1){
                mid++;
            }
            else{
                Collections.swap(nums,high,mid);
                high--;
            }
        }
        
    }
}
