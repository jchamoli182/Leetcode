package leetcode.Greedy;

public class Candy {
    public static void main(String[] args) {
        int[] can = {3,2,4,1};
        System.out.println(candy(can));
    }

    public static  int candy(int[] ratings) {
        int n = ratings.length;
        int ans = n;
        int i = 1;

        while(i < n){
            if(ratings[i] == ratings[i-1]){
                i++;
                continue;
            }
            int peak = 0;
            int dip = 0;
            while(ratings[i] > ratings[i-1]){
                peak++;
                ans += peak;
                i++;
                if(i == n) return ans;
            }

            while(i< n && ratings[i] < ratings[i-1]){
                dip++;
                ans += dip;
                i++;
            }

            ans -= Math.min(peak,dip);
        }  

        return ans;
    }
}
