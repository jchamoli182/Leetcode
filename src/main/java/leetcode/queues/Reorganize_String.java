package leetcode.queues;

public class Reorganize_String {
    public static void main(String[] args) {
        String s = "aab";
        int n = s.length();
        int mp[] = new int[26];
        for(int i=0;i<n;i++){
            mp[s.charAt(i)-'a']++;
        }
    
        int max = 0;
        int letter = 0;
        for(int i=0;i<26;i++){
            if(mp[i] > max){
                max = mp[i];
                letter = i;
            }
        }
    
        if(max > (n+1)/2){
            System.out.println("");
        }
    
        char ans[] = new char[n];
        int idx = 0;
        while(mp[letter] > 0){
            ans[idx] = (char)(letter + 'a');
            idx += 2;
            mp[letter]--;
        }
    
        for(int i=0;i<26;i++){
            while(mp[i] > 0){
                if(idx >= n){
                    idx = 1;
                }
                ans[idx] = (char)(i + 'a');
                idx += 2;
                mp[i]--;
            }
        }
    
        System.out.println(new String(ans));
    }   
}
