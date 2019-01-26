package src.Sort;

public class HeapSort {
    public static void main(String [] args){
        Integer[] test = new Integer[10];
        for(int i=1;i<10;i++){
            test[i] = (int)(Math.random()*100);
        }
        HeapSort hp = new HeapSort();
        hp.show(test);
        hp.HeapSort(test);
        hp.show(test);

    }
    private boolean less(Comparable a,Comparable b){
        return a.compareTo(b)<0 ? true : false;
    }
    private  void exec(Comparable[] a,int i,int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public void swim(Comparable[] a,int k){
        while(k>1&&less(a[k],a[k/2])){
            exec(a,k,k/2);
            k = k/2;
        }
    }
    public void sink(Comparable[] a,int k,int n){
        while(2*k<=n){
            int j = 2*k;
            if(less(a[j+1],a[j])&&j<n) j+=1;
            if(less(a[k],a[j])) break;
            exec(a,j,k);
            k = j;
        }
    }
    public void HeapSort(Comparable[] a){
        for(int i=(a.length-1)/2;i>=1;i--){
            sink(a,i,a.length-1);
        }
        int n = a.length-1;
        while(n>1){
            exec(a,1,n--);
            sink(a,1,n);
        }
    }
    public void show(Comparable[] a){
        for(int i=1;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

}
