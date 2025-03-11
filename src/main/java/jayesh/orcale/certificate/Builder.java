package jayesh.orcale.certificate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Builder {
    public static void main(String args[]){
        // String s = "Jayesh Chamoli";
        // try{
        //     String ans = "";
        //     String arr[] = s.split(" ");
        //     StringBuilder sb = new StringBuilder();
        //     for(int i=arr.length-1;i>=0;i--){
        //         sb.append(arr[i]);
        //         sb.append(" ");
        //     }
        //     sb.deleteCharAt(sb.length()-1);         
        //     ans = sb.toString();
        //     System.out.println(ans);
        // }catch(Exception e){

        //     System.out.println(e);

        // }

        int arr[] = {3,5,9,3,0,6};

        List<Integer> li = new ArrayList<>();

        li.add(1);
        li.add(3);
        li.add(2);

        Collections.sort(li,Collections.reverseOrder());
        Collections.reverse(li);

        Object a[] = li.toArray();

        // Arrays.sort(arr);

        for(Object i : a){
            System.out.println(i);
        }

        TreeSet<Integer> st = new TreeSet<>();

        st.add(1);
        st.add(7);
        st.add(3);

        for(Integer i : st){
            System.out.println(i);
        }

        System.out.println(st.size());

        

        
        
    }
}
