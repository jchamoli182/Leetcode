package UserDefined;
public class MyList {
    // creating a user deifned list which can add,remove,get,size,replace an integer.
    private int size;
    private  int n = 5;  // default capacity is 5;
    private int[] arr = new int[n];
    private int ptr = 0;

    //return size of an list funtion.
    public int Size(){
        return size;  
    }
    //adding the element is done.
    public void add(int x){
        //check if size is equal to capacity because no more element can be addded,increase the size of the list.
        if(size == n){
            n = 2 * n; //double the capacity.
            arr = Copy(arr,n);
        }
        arr[ptr] = x;
        ptr++;
        size++;
    }
    //get the element at particular index.
    public int get(int idx){
        if(idx >= size || idx < 0){
            return -1;   //if index is out of bound return -1;
        }
        return arr[idx];
    }

    //replace an element at particular index
    public void replace(int idx,int x){
        if(idx >= size || idx < 0){
            return;   //if index is out of bound return empty;
        }  
        arr[idx] = x;
    }
    //remove at specific index.
    public void remove(int idx){
        if(idx >= size) return;
        for(int i=idx+1;i<size;i++){
            arr[i-1] = arr[i];
        }
        size--;
        ptr--;
    }


    //fill the  array with previous elements
    private int[] Copy(int[] arr,int n){
        int[] a = new int[n];
        for(int i=0;i<arr.length;i++){
            a[i] = arr[i];
        }

        return a;
    }
}
