package src.Sort;

public class InsertSort {
    public static void main(String [] args){
        Integer []  a= new Integer[15];
        for(int i=0;i<a.length;i++){
            a[i] = (int)(Math.random() * 100);
        }
        System.out.println("the arriy is :");
        show(a);

        System.out.println("After being shufferef the arriy is :");
        show(a);
        Sort(a,0,a.length-1);
        System.out.println("After being sorted the arriy is :");
        show(a);
    }
    public static void exec(Comparable [] a,int i,int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static boolean less(Comparable a,Comparable b){
        return a.compareTo(b) < 0 ? true:false;
    }
    //插入排序
    public static void Sort(Comparable [] a,int lo,int hi){
        for(int i=1;i<hi;i++){
            for(int j=i;j>lo&&less(a[j],a[j-1]);j--){
                exec(a,j,j-1);
            }
        }
    }


    public static void show(Comparable [] a){
        for(Comparable elementdata : a){
            System.out.print(elementdata+" ");
        }
        System.out.println();
    }
}
