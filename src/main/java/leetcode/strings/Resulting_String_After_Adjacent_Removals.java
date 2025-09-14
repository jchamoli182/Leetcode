package leetcode.strings;

import java.util.Stack;

public class Resulting_String_After_Adjacent_Removals {
    public static void main(String[] args) {
        String s = "zacd";
        String ans = resultingString(s);

        for(char ch : ans.toCharArray()){
            System.out.println(ch);
        }
    }


    public static String resultingString(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();
        int n = s.length();

        for(int i=0;i<n;i++){
            Character c = s.charAt(i);
            if(!st.empty() && (Math.abs(st.peek()-c) == 1 || Math.abs(st.peek()-c) == 25)){
                st.pop();
            }else{
                st.push(c);
            }
        }

        while(!st.empty()){
            ans.append(st.peek());
            st.pop();
        }

        ans.reverse();

        return ans.toString();
    }
}
