


import src.DataStructure.PriorityQueue;

public class priorityQueue<T extends Comparable<T>> {
    private T[] pq;
    private int n = 0;
    private int size;
    public priorityQueue(int size){
        pq = (T[]) new Comparable[size+1];
        this.size = size;
    }
    public boolean isFull(){
        return n == size;
    }
    public boolean isEmpty(){
        return n == 0;
    }
    public int size(){
        return this.n;
    }
    private  void exec(Comparable[] a,int i,int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    private boolean less(Comparable a,Comparable b){
        return a.compareTo(b)<0 ? true : false;
    }
    private void swim(Comparable[] a,int x){
        while(x>1&&less(this.pq[x],this.pq[x/2])){
            exec(this.pq,x,x/2);
            x = x/2;
        }
    }
    private void sink(Comparable[]a,int x){
        while(2*x<=n){
            int j = 2*x;
            if(j<n&&less(pq[j+1],pq[j])) j+=1;
            if(less(pq[x],pq[j])) break;
            exec(this.pq,x,j);
            x = j;
        }
    }
    public void push(Comparable v){
        if(isFull()) throw new IndexOutOfBoundsException("the queue is full");
        this.pq[++n] = (T)v;
        swim(pq,n);
    }
    public T pop(){
        if(isEmpty()) throw new IllegalArgumentException("the queue is Empty");
        T minValue = pq[1];
        exec(pq,1,n--);
        pq[n+1] = null;
        sink(pq,1);
        return minValue;
    }

    public static void main(String [] args){
        priorityQueue<Integer> demo = new priorityQueue<>(10);
        for(int i=1;i<=10;i++){
            demo.push((int)(Math.random()*100));
        }
        while (!demo.isEmpty()){
            System.out.print(demo.pop()+" ");
        }

    }

}