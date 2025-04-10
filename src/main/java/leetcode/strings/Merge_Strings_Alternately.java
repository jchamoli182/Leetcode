package leetcode.strings;

public class Merge_Strings_Alternately {
    public static void main(String[] args) {
        String word1 = "jayesh";
        String word2 = "chamoli";

        int i = 0;
        int j = 0;

        int n = word1.length();
        int m = word2.length();

        StringBuilder sb = new StringBuilder();
        while(i < word1.length() && j < word2.length()){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            i++;
            j++;
        }

        while(i < n){
            sb.append(word1.charAt(i));
            i++;
        }

        while(j<m){
            sb.append(word2.charAt(j));
            j++;
        }

        System.out.println(sb.toString());

    }
}
