package leetcode.Sorting;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Check_if_Grid_can_be_Cut_into_Sections {
    public static void main(String[] args) {
        int[][] grid = {{1, 1, 0, 0}, {0, 0, 1, 1}, {0, 0, 1, 1}, {1, 1, 0, 0}};
        System.out.println(Solve(grid));
    }
    public static boolean Solve(int[][] grid){
        int n = grid.length;
        int[][] arr = new int[n][2];
        for(int i = 0;i<n;i++){
            arr[i][0] = grid[i][0];
            arr[i][1] = grid[i][2];
        }

        if(helper(arr,n)) return true;

        arr = new int[n][2];
        for(int i = 0;i<n;i++){
            arr[i][0] = grid[i][1];
            arr[i][1] = grid[i][3];
        }

        if(helper(arr,n)) return true;


        return false;
    }

    public static Boolean helper(int[][] arr,int n){
        Arrays.sort(arr,(a,b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(Arrays.asList(arr[0][0],arr[0][1]));
        for(int i=1;i<n;i++){
            if(arr[i][0] < ans.getLast().get(1)){
                ans.getLast().set(1,Math.max(ans.getLast().get(1),arr[i][1]));
            }else{
                ans.add(Arrays.asList(arr[i][0],arr[i][1]));
            }
        }

        return ans.size() >= 3;

        
    }
}
