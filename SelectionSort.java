
package selectionsort;

public class SelectionSort {

    public static void main(String[] args) {
        int a[]= {1,5,6,7,3,4,2};
        System.out.println("Given input array is ");
        for(int i : a)
        {
            System.out.print("  "+i);
        }
       //Bubble sort code starts here
       for(int i =0;i<a.length-1;i++){
           int minIndex = i;
           for(int j=i+1;j<a.length;j++)
           {
              if(a[j]<a[minIndex])
              {
                  minIndex = j;
              }
              
            }
       int temp = a[minIndex];
       a[minIndex] = a[i];
       a[i] = temp;
      // System.out.println("\nNext iteration");
       //for(int in : a)
        //{
        //    System.out.print("  "+in);
        //}
       
       
       
       }
       
        System.out.println("\nThe sorted array is ");
        for(int i : a)
        {
            System.out.print("  "+i);
        }
       
       
       
    }
    
}