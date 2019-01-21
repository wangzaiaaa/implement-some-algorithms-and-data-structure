package src.Sort;


import src.Sort.InsertSort;

public class QuickSort {
    public static void main(String [] args){
        Integer []  a= new Integer[15];
        for(int i=0;i<a.length;i++){
            a[i] = (int)(Math.random() * 100);
        }
        System.out.println("the arriy is :");
        show(a);

        System.out.println("After being shufferef the arriy is :");
        show(a);
        ImproveSort(a,0,a.length-1);
        System.out.println("After being sorted the arriy is :");
        show(a);

    }
    /*
    用来交换数组索引位置为i和j的值
     */
    public static void exec(Comparable [] a,int i,int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    /*
    用来比较数组中2个数的大小
     */
    public static boolean less(Comparable a,Comparable b){
        return a.compareTo(b) < 0 ? true:false;
    }
    //将数组划分成2部分在最后的返回值j之前的小于a[j]，后面的大于a[j]
    private static int partication(Comparable [] a,int lo,int hi){
        int i = lo;
        int j = hi + 1;
        Comparable V = a[lo];
        while (true){
            while(less(a[++i],V)) {
                if (i == hi) break;
            }
            while(less(V,a[--j])){
                if(j==lo) break;
            }
            if(i>=j)break;
            exec(a,i,j);
        }
        exec(a,lo,j);
        return j;
    }
    //用分治法来进行快速排序
    public static void Sort(Comparable [] a, int lo, int hi){
        if(lo >= hi) return;
        int j = partication(a,lo,hi);
        Sort(a,lo,j-1);
        Sort(a,j+1,hi);
    }
    public static void show(Comparable [] a){
        for(Comparable i:a){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    /*
    改进的快速排序，在数组长度较小的时候使用插入排序（可能是因为递归的原因）
    待排序数组的长度小于m时选择插入排序，否则使用快速排序
     */
    public static void Sort(Comparable [] a, int lo, int hi, int m){
        if(lo >= hi) return;
        if(hi - lo <= m-1){
            InsertSort.Sort(a,lo,hi);
            return;
        }
        int j = partication(a,lo,hi);
        Sort(a,lo,j-1,m);
        Sort(a,j+1,hi,m);
    }
    /*
    三向切分的快速排序，常规的快速排序没有对重复值利用，三向切分的快速排序维护了3个指针lt，i，gt
    假设lo和hi分别为数组的起始和结束索引，a[lo..lt-1]中的元素都小于每次选定的元素v，a[gt+1...hi]中的元素都
    大于v,a[lt...i-1]中的元素都等于v 然后再用分治法时 Sort(a,lo,lt-1) Sort(a,gt+1,hi)就避免对中间的重复值的
    排序
     */
    public static void ImproveSort(Comparable [] a,int lo,int hi){
        if(lo >= hi) return;
        int i = lo + 1,lt = lo,gt = hi;
        Comparable v = a[lo];
        while(i <= gt){
            int com = a[i].compareTo(v);
            if(com < 0) exec(a,lt++,i++);
            else if(com > 0) exec(a,i,gt--);
            else i++;
        }
        ImproveSort(a,lo,lt-1);
        ImproveSort(a,gt+1,hi);
    }
}
