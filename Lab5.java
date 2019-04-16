/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import static lab5.MaxHeap.heapsort;

/**
 *
 * @author Amos
 */
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Test 1- constructor 1(integer)");
        MaxHeap heap1 = new MaxHeap(10);
        
        System.out.println(heap1.toString());
        System.out.println("********************************************");
        
        System.out.println("Test 2- constructor 2 (empty list)");
        Integer[] list1 = {};
        MaxHeap heap2 = new MaxHeap(list1);
        System.out.println(heap2.toString());
        System.out.println("Heap size = "+heap2.getHeapSize());
        System.out.println("Array size = "+heap2.getArraySize());
        System.out.println("********************************************");
        
        System.out.println("Test 3- constructor 2 (nonempty list)");
        Integer[] list2 = {5,6,7,3,5,2,6,0,9};
        MaxHeap heap3 = new MaxHeap(list2);
        System.out.println(heap3.toString());
        System.out.println("Heap size = "+heap3.getHeapSize());
        System.out.println("Array size = "+heap3.getArraySize());
        System.out.println("********************************************");
        
        System.out.println("Test 4- insert function");
        for(int i=0;i<list2.length;i++)
            heap1.insert(list2[i]);
        System.out.println(heap1.toString()); 
        System.out.println("Heap size = "+heap1.getHeapSize());
        System.out.println("Array size = "+heap1.getArraySize());
        System.out.println("********************************************");
        
        System.out.println("Test 4b- insert function but heap is full");
        Integer[] list10 = {4,5,6,7,8};
        MaxHeap heap10 = new MaxHeap(list10);
        System.out.println(heap10.toString());
        System.out.println("Heap size =" + heap10.getHeapSize());
        System.out.println("Array size = "+heap10.getArraySize());
        heap10.insert(12);
        System.out.println(heap10.toString());
        System.out.println("Heap size =" + heap10.getHeapSize());
        System.out.println("Array size = "+heap10.getArraySize());
        System.out.println("********************************************");
        
        
        System.out.println("Test 5- heapsort function");
        heapsort(list2);
        for(int i=0;i<list2.length;i++)
            System.out.print(list2[i]+" ");
        System.out.println("\n");
        System.out.println("********************************************");
        
        System.out.println("Test 6- heapsort function");
        //MaxHeap heap5;
        Integer[] list6 = {234,23,456,5,34,23,5,5,6,545,3,234};
        heapsort(list6);
        MaxHeap heap5 = new MaxHeap(list6);
        System.out.println(heap5.toString());
        for(int i=0;i<list6.length;i++)
            System.out.print(list6[i]+" ");
        System.out.println("\n");
        System.out.println("********************************************");
       
//        Integer[] list7 = {234,23,456,5,34,23,5,5,6,545,3,234};
//        MaxHeap heap7 = new MaxHeap(list7);
//        heap7.DeleteMaxVal();
//        System.out.println(heap7.toString());
    }
    
}
