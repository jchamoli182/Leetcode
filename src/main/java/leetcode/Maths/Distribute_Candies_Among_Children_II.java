package leetcode.Maths;

public class Distribute_Candies_Among_Children_II {
    public static void main(String[] args) {
        long ans = (char) distributeCandies(5, 2);
        System.out.println(ans);
    }

    public static long distributeCandies(int n, int limit) {
        long ways = 0;
        int mini = Math.max(0,n-2*limit);
        int maxi = Math.min(n,limit);

        for(int i = mini;i<=maxi;i++){
            int N = n-i;
            int Mini = Math.max(0,N-limit);
            int Maxi = Math.min(N,limit);

            ways += (Maxi-Mini+1);
        }

        return ways;
    }
}

