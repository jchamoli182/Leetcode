package leetcode.queues;

public class Reorganize_String {
    public static void main(String[] args) {
        String s = "aaaab";
        int n = s.length();
        int mp[] = new int[26];
        int max = 0;
        char ch = '#';
        for(int i=0;i<n;i++){
            mp[s.charAt(i)-'a']++;

            if(max < mp[s.charAt(i)-'a']){
                max = mp[s.charAt(i)-'a'];
                ch = s.charAt(i);
            }

            if(mp[s.charAt(i) - 'a'] > (n+1)/2){
                System.out.println("");
            }
        }
    
        char ans[] = new char[n];
        int idx = 0;
        while(max > 0){
            ans[idx] = ch;
            idx += 2;
            // System.out.println(idx);
            max--;
            mp[ch-'a']--;
        }

        // System.out.println("Yaha Tk shi chl rha h");
    
        for(int i=0;i<26;i++){
            // System.out.println(mp[i]);
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
