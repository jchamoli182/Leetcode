package leetcode.strings;

public class Count_the_Number_of_Powerful_Integers {
    public static void main(String[] args) {
        long x = 2; long y = 3; int limit = 10; 
        String s = "0";
        System.out.println(numberOfPowerfulInt(x, y, limit, s));
    }
    public static long helper(String str,long limit,String suff){
        if(str.length() < suff.length()){
            return 0;
        }
        long count = 0;
        String s = str.substring(str.length() - suff.length());

        int remaining = str.length() - suff.length();

        for(int i=0;i<remaining;i++){
            int digit = str.charAt(i) - '0';
            if(digit <= limit){
                count += digit * Math.pow(limit+1,remaining-i-1);
            }else{
                count += Math.pow(limit+1,remaining-i);
                return count;
            }
        }

        if (s.compareTo(suff) >= 0) {
            count += 1;
        }

        return count;
    }


    public static  long numberOfPowerfulInt(long start, long finish, int limit, String s) {
        String st = Long.toString(start-1);
        String f = Long.toString(finish);

        return helper(f,limit,s) - helper(st,limit,s);   
    }
}
