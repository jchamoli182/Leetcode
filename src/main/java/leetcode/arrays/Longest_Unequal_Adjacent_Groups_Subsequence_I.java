package leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class Longest_Unequal_Adjacent_Groups_Subsequence_I {
    public static void main(String[] args) {
        String[] words = {"e","a","b"};
        int[] groups = {0,1,1};

        System.out.println(getLongestSubsequence(words,groups));

    }

    public static List<String> getLongestSubsequence(String[] words,int[] groups){
        int n = groups.length;
        List<String> ans = new ArrayList<>();
        int prev = -1;

        for(int i=0;i<n;i++){
            prev = groups[i];
            List<String> temp = new ArrayList<>();
            temp.add(words[i]);
            for(int j=i+1;j<n;j++){
                if(prev == groups[j]) continue;
                prev = groups[j];
                temp.add(words[j]);
            }
            if(ans.size() < temp.size()){
                ans = temp;
            }
        }

        return ans;
    }
}
