package leetcode.Maths;

public class K_th_Smallest_in_Lexicographical_Order {
    public static void main(String[] args) {
        System.out.println(findKthNumber(13,4));
    }
    public static int Count(long curr,long next,int n){
        int ans = 0;

        while(curr <= n){
            ans += (next - curr);
            curr *= 10;
            next *= 10;

            next = Math.min(next,(long)n+1);
        }

        return ans;
    }
    public static int findKthNumber(int n, int k) {
        int curr = 1;
        k -= 1;

        while(k > 0){
            int count = Count(curr,curr+1,n);
            if(count <= k){
                curr++;
                k -= count;
            }else{
                curr *= 10;
                k -= 1;
            }
        }

        return curr;
    }
}
