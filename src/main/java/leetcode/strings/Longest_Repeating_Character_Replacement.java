package leetcode.strings;

public class Longest_Repeating_Character_Replacement {
    public static void main(String[] args) {
        
        // time complexity O(n)
        // space complexity O(1)
        String s = "AABABBA";
        int k = 1;
        int n = s.length();

        int i = 0;
        int j = 0;

        int ans = 0;
        int mp[] = new int[26];
        int max = 0;
        while(j<n){
            int c = s.charAt(j) - 'A';
            mp[c]++;
            max = Math.max(max, mp[c]);
            
            if(j-i+1-max > k){
                mp[s.charAt(i)-'A']--;
                i++;
            }

            ans = Math.max(ans, j-i+1);
            j++;
        }

        System.out.println(ans);
        
    }
}
