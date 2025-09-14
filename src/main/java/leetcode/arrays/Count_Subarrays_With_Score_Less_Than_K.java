package leetcode.arrays;

public class Count_Subarrays_With_Score_Less_Than_K {
    public static void main(String[] args) {
        int[] arr = {2,1,4,3,5};
        int k = 10;
        System.out.println(helper(arr,k));
    }

    public static long helper(int[] arr, int k) {
        int n = arr.length;
        int i = 0;
        int j = 0;
        long sum = 0;
        long ans = 0;

        while (j < n) {
            sum += arr[j];
            long prod = sum * (j - i + 1); // Correct calculation of prod
            while (prod >= k) {
                sum -= arr[i];
                i++;
                prod = sum * (j - i + 1); // Recalculate prod correctly
            }

            ans += (j - i + 1); // Count valid subarrays
            j++; // Increment j to expand the window
        }

        return ans;
    }
}
