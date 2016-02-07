
package mergesortfile;

import java.util.*;


public class MergeSortFile {


    public static void main(String[] args) {
	
	Integer[] a = {2,6,3,5,1,6,8,9,8,5};    
        
        System.out.println("\nThe Input array is ");
        for(int i : a)
        {
            System.out.print("  "+i);
        }
        mergeSort(a);  
        
        System.out.println("\nThe sorted array is ");
        for(int i : a)
        {
            System.out.print("  "+i);
        }
	
    }
	
	
    public static Comparable[] mergeSort(Comparable[] FullList) 
    {
        if (FullList.length <= 1) {
            return FullList;
        }
        Comparable[] FirstHalf = new Comparable[FullList.length / 2];
        Comparable[] SecondHalf = new Comparable[FullList.length - FirstHalf.length];
        System.arraycopy(FullList, 0, FirstHalf, 0, FirstHalf.length);
        System.arraycopy(FullList, FirstHalf.length, SecondHalf, 0, SecondHalf.length);
        mergeSort(FirstHalf);
        mergeSort(SecondHalf);
        merge(FirstHalf, SecondHalf, FullList);
        return FullList;
    }
     
    
    private static void merge(Comparable[] FirstHalf, Comparable[] SecondHalf, Comparable[] result) 
    {
        int First = 0;
        int Second = 0;
        int k = 0;
        while (First < FirstHalf.length && Second < SecondHalf.length) 
        {
            if (FirstHalf[First].compareTo(SecondHalf[Second]) < 0) 
            {
                result[k] = FirstHalf[First];
                First++;
            } 
            else
            {
                result[k] = SecondHalf[Second];
                Second++;
            }
            k++;
        }
        System.arraycopy(FirstHalf, First, result, k, FirstHalf.length - First);
        System.arraycopy(SecondHalf, Second, result, k, SecondHalf.length - Second);
    }
	
    
}
