package Java2;

import java.io.IOException;

public class Test2 {

    static int counter = 0;

    public static void main(String[] args) throws IOException, InterruptedException {


    int[] arr = {1, 2, 2, 3, 4, 4, 4, 5};

    int[] freq = new int[6];

    for(int i=0;i<freq.length;i++){
        freq[i] = 0;
    }

    for(int i : arr){
        freq[i]++;
    }

    for(int i : freq){
        System.out.println(i);
    }

    
}
}


