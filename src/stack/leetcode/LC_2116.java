package stack.leetcode;

import java.util.Stack;

public class LC_2116 {
    // using stack
    private String s;
    private String locked;
    public LC_2116(String s,String locked) {

        this.s = s;
        this.locked = locked;

    }

    public boolean Solve(){
       
        if(s.length() % 2 != 0) return false;

        Stack<Integer> open = new Stack<>();
        Stack<Integer> openClose = new Stack<>();
    
        for(int i=0;i<s.length();i++){
            if(locked.charAt(i) == '0'){
                openClose.push(i);
            }
            else if (s.charAt(i) == '('){
                open.push(i);
            }else{
                if(!open.empty()){
                    open.pop();
                }
                else if(!openClose.empty()){
                    openClose.pop();
                }
                else{
                    return false;
                }
            }
        }

        while(!open.empty() && !openClose.empty() && open.peek() < openClose.peek()){
            open.pop();
            openClose.pop();
        }

        return open.empty();
    }
}
