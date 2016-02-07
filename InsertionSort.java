//Java program to perform insertion sort.
package insertionsort;

import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of input array");
        int size = sc.nextInt();
        System.out.println("Enter the array elements");
        int array[] = new int[size];
        for(int i =0;i<size;i++)
        {
            array[i]= sc.nextInt();
        }
        
        //Insertion sort code starts here:
        for(int i=1;i<size;i++)
        {   
            int key = array[i];
            int j = i-1;
            while(j>=0 && key<array[j])
            {
               array[j+1]= array[j];
                j = j-1;
            }
            array[j+1]= key;
        }
        System.out.println("\n Sorted array is ");
        for(int i :array)
        {
            System.out.print(" "+i);
        }
        
    }
    
}
