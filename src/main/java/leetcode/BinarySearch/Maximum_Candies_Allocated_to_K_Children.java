package leetcode.BinarySearch;

public class Maximum_Candies_Allocated_to_K_Children {

    public static Boolean helper(int arr[],int mid,int k){
        int n = arr.length;
        int cnt = 0;
        for(int i=0;i<n;i++){
            cnt += arr[i]/mid;
        }

        return cnt >= k;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,8};
        int k = 3;

        int n  = arr.length;
        long t = 0;
        for(int i=0;i<n;i++){
            t += arr[i];
        }

        if(t/k == 0){
            System.out.println(0);
        }
        
        int l = 1;
        int r = (int) (t/k);

        int ans =  Integer.MIN_VALUE;

        while(l<=r){
            int mid = l + (r-l)/2;
            Boolean f = helper(arr,mid,k);
            if(f){
                ans = mid;
                l = mid + 1;
            }else{
                r = mid - 1;
            }    
        }

        System.out.println(ans);

    }

}
