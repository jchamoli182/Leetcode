package UserDefined;
public class Run {
    public static void main(String[] args) {
        MyList li = new MyList();
        li.add(10);
        li.add(45);
        li.add(50);
        li.add(90);
        li.add(90);
        li.add(90);
        li.add(100);
        li.add(99);
        li.remove(3);
        li.replace(2,100);
        for(int i=0;i<li.Size();i++){
            System.out.println(li.get(i));
        }

        // int[] arr = {1,2,3,4,5};
        // int[] a = arr;
        // arr[0] = 4;
        // for(int i : a){
        //     System.out.println(i);
        // }
    }
}
