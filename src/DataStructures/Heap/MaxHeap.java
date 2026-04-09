package DataStructures.Heap;
import java.util.Arrays;
public class MaxHeap {
    int[] arr; //to store heap elements
    int maxSize; //max size of heap
    int heapSize; //current no of elements in heap

    MaxHeap(int maxSize){
        this.maxSize=maxSize;
        this.arr=new int[maxSize];
        this.heapSize=0;
    }

    //helper function to find parent, left and right child
    int parent(int i){ return (i-1)/2; }
    int leftChild(int i){ return 2*i+1; }
    int rightChild(int i){ return 2*i+2; }
    void swap(int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    void heapify(int i){
        int lc=leftChild(i);
        int rc=rightChild(i);
        int largest=1;

        if(lc<heapSize && arr[lc]>arr[largest]){
            largest=lc;
        }

        if(rc<heapSize && arr[rc]>arr[largest]){
            largest=rc;
        }
        if(largest!=1){
            swap(i,largest);
            heapify(largest);
        }
    }

    void insert(int key){
        if(heapSize==maxSize){
            System.out.println("Overflown! Cannot insert any more elements");
            return;
        }
        heapSize++;
        int i=heapSize-1;
        arr[i]=key;

        //heapify up
        while(arr[parent(i)]<arr[i]){
            swap(i,parent(i));
            i = parent(i);
        }
    }
    int extractMax(){
        if(heapSize<=0){
            return Integer.MIN_VALUE;
        }
        int root=arr[0];
        arr[0]=arr[heapSize-1];
        heapSize--;
        heapify(0);
        return root;
    }

    void increaseKey(int i,int newVal){
        arr[i]=newVal;

        //Heapify Up
        while(i>0  && arr[parent(i)]<arr[i]) {
            swap(i, parent(i));
            i=parent(i);
        }
    }
    void remove(int i){
        increaseKey(i,Integer.MAX_VALUE);
        extractMax();
    }
    int getMax(){
        if(heapSize>0){
            return arr[0];
        }
        return Integer.MAX_VALUE;
    }
    void printHeap(){
        System.out.println("Heap Elements: " + Arrays.toString(Arrays.copyOf(arr,heapSize)));
    }
}
class Driver{
    public static void main(String[] args) {
        MaxHeap mh=new MaxHeap(10);
        mh.insert(3);
        mh.insert(10);
        mh.insert(12);
        mh.insert(8);
        mh.insert(2);
        mh.insert(14);
        System.out.println("Max Value in Heap: " +mh.getMax());
        System.out.println(mh.extractMax());
        mh.printHeap();
    }
}
