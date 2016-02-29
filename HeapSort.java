/*
Implements HeapSort
*/
package heapsort;

public class HeapSort {
    static int  no = 0;
    public static void maxHeapify(int array[],int i)
    {
        int left = 2*i;
        int right = 2*i+1;
        int max = i;
        
        if(left<=no && array[left]>array[i])
        {
            max = left;
        }
        if(right<=no && array[right]>array[max])
        {
            max = right;
        }
        if(max !=i)
        {
            swap(array,max,i);
            maxHeapify(array, max);
        }
        
    }
    
    public static void heapify(int array[])
    {
         no = array.length-1;
        for(int i=no/2;i>=0;i--)
        {
            maxHeapify(array,i);
        }
    }
    
    public static void Heapsort(int array[])
    {
        heapify(array);
        for(int i = no;i>0;i--)
        {
            swap(array,i,0);
            no = no - 1;
            maxHeapify(array, 0);
        }
        
    }
    
    static void swap(int array[],int a,int b)
    {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
    public static void main(String[] args) 
    {
          int a[] = {488,667,634,380,94};
         
          System.out.println("The given array is");
          
          for(int i = 0;i<a.length;i++)
          {
              System.out.print(" "+a[i]);
          }
           Heapsort(a);
          System.out.println(" ");
          System.out.println("The array sorted using heapsort is ");
          for(int i = 0;i<a.length;i++)
          {
              System.out.print(" "+a[i]);
          }
    }
    
}
