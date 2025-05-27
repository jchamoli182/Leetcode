package leetcode.strings;

import java.util.HashMap;

public class Longest_Palindrome_by_Concatenating_Two_Letter_Words {
    public static void main(String[] args) {
        String[] words = {"aa","bb","aa"};

        System.out.println(longestPalindrome(words));

    }

    public static int longestPalindrome(String[] words) {
        HashMap<String,Integer> mp = new HashMap<>();
        HashMap<String,Integer> m = new HashMap<>();

        int ans = 0;
        for(String word : words){
            if(word.charAt(0) == word.charAt(1)){
                m.put(word,m.getOrDefault(word,0)+1);
            }else{
                String t = "" + word.charAt(1) + word.charAt(0);
                if(mp.getOrDefault(t,0) > 0){
                    ans += 4;
                    mp.put(t,mp.get(t)-1);
                }else{
                    mp.put(word,mp.getOrDefault(word,0)+1);
                }
            }
        }   

        Boolean flag = false;

        for(Integer i : m.values()){
            int d = i/2;
            ans += (4 * d);
            int r = i%2;
            if(r == 1){
                flag = true;
            }
        }

        return flag == true ? ans + 2 : ans;


    }
}
