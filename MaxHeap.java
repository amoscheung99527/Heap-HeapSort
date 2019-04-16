/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author Amos
 */
public class MaxHeap {
    private Integer[] Heap;
    private int ArraySize;
    private int HeapSize;
    
     public int getArraySize(){
        return ArraySize; 
    }
    public int getHeapSize(){
        return HeapSize; 
    }
    
//    public int DeleteMaxVal(){
//        return deleteMax();
//    }
    
    
    public MaxHeap(int n){
        ArraySize=n;
        Heap = new Integer[ArraySize];
        HeapSize=0;
    }
    
    public MaxHeap(Integer[] someArray){
        HeapSize=0;
        ArraySize = someArray.length+1;
        Heap = new Integer[ArraySize];
        for(int i=0; i<someArray.length; i++){
            this.insert(someArray[i]);
        }
    }
    
    
    private void Swap(int i,int j){
        int temp = Heap[i];
        Heap[i] = Heap[j];
        Heap[j] = temp;
    }
    
    int parentIndex(int index) {
        return index/ 2;
    }
 
    int leftChildIndex(int index) {
        return (2 * index);
    }
 
    int rightChildIndex(int index) {
        return (2 * index) + 1;
    }
    
    public void insert(int n){
        if(HeapSize+1==ArraySize){
            ArraySize*=2;
            Integer[] doublearray = new Integer[2*ArraySize];            
            for(int j=0;j<=HeapSize;j++)
                doublearray[j] = Heap[j];
            Heap = doublearray;
        }
        int current = HeapSize+1;
        Heap[current] = n; 
        HeapSize++;
 
        
        if(current==1)
            return;
        while (Heap[current] >= Heap[parentIndex(current)]) { 
            Swap(current, parentIndex(current)); 
            current = parentIndex(current); 
            if(current==1)
                break;
        } 
    }
    
    private int deleteMax(){
        if(HeapSize==0){
            return -1;
        }
        int max = Heap[1]; 
//        Swap(max, Heap[HeapSize--]);
        Heap[1] = Heap[HeapSize--];
//        heapify(Heap, HeapSize, 1);
//        heapsort(Heap);
        return max;
    }
    
    public static void heapsort(Integer[] arrayToSort){
        int size = arrayToSort.length; 
  
        for (int i = size / 2 - 1; i >= 0; i--) 
            heapify(arrayToSort, size, i); 
  
        for (int i=size-1; i>=0; i--) 
        {  
            int temp = arrayToSort[0]; 
            arrayToSort[0] = arrayToSort[i]; 
            arrayToSort[i] = temp; 
  
            heapify(arrayToSort, i, 0); 
        }  
    }
    
    static void heapify(Integer arr[], int size, int root) 
    { 
        int largest = root;
        int l = 2*root + 1;
        int r = 2*root + 2;
   
        if (l < size && arr[l] < arr[largest]) 
            largest = l; 
  
        if (r < size && arr[r] < arr[largest]) 
            largest = r; 
   
        if (largest != root) 
        { 
            int swap = arr[root]; 
            arr[root] = arr[largest]; 
            arr[largest] = swap; 
  
            heapify(arr, size, largest); 
        } 
    }
    
    public String toString(){
        String output = new String();
        for(int i=1;i<=HeapSize;i++){
            output += Heap[i] + " ";
        }
        return output;
    }
    
}
