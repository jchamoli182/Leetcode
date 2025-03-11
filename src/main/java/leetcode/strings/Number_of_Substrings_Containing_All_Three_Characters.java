package leetcode.strings;

public class Number_of_Substrings_Containing_All_Three_Characters {
    
    public static void main(String[] args) {

        // time complexity O(n)
        // space complexity O(1)
        String s = "abcabc";
        int n = s.length();

        int i = 0;
        int j = 0;

        int ans = 0;
        int mp[] = new int[3];
        while(j<n){
            int c = s.charAt(j) - 'a';
            mp[c]++;
            
            while(mp[0] > 0 && mp[1] > 0 && mp[2] > 0){
                ans += (n-j);
                mp[s.charAt(i)-'a']--;
                i++;
            }

            j++;
        }

        System.out.println(ans);
    }
}
