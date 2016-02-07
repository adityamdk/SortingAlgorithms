
package bubblesort;

public class BubbleSort {

    public static void main(String[] args) {
        int a[]= {1,5,6,7,3,4,2};
        System.out.println("Given input array is ");
        for(int i : a)
        {
            System.out.print("  "+i);
        }
       //Bubble sort code starts here
       for(int i =0;i<a.length-1;i++){
           for(int j=0;j<a.length-i-1;j++)
           {
               if(a[j]>a[j+1]){
                   int temp =a[j];
                   a[j] =a[j+1];
                   a[j+1]= temp;
               }
           }
       }
        System.out.println("\nThe sorted array is ");
        for(int i : a)
        {
            System.out.print("  "+i);
        }
    }
    
}
