
package quicksort;
public class QuickSort {
    
    static void qsort(int array[],int lowerIndex,int higherIndex)
    {
        int temp;
        int i = lowerIndex;
        int j = higherIndex;
       
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        
        while (i <= j) {
           
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                temp = array[i];
                array[i] = array[j];
		array[j] = temp;
		i++;j--;
            }
        }
        if (lowerIndex < j)
            qsort(array,lowerIndex, j);
        if (i < higherIndex)
            qsort(array,i, higherIndex);
    }
    
  

    public static void main(String[] args) {
        int a[]= {1,5,6,7,3,4,2};
        System.out.println("Given input array is ");
        for(int i : a)
        {
            System.out.print("  "+i);
        }
        qsort(a,0,a.length-1);
        System.out.println("\n Sorted array is ");
        for(int i : a)
        {
            System.out.print("  "+i);
        }
       //Quick sort code starts here

    }
    
}
