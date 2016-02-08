//Bucket Sort.
package bucketsort;

public class BucketSort {

    public static void main(String[] args) {

         int a[]= {1,5,5,5,6,6,6,7,7,7,7,3,4,2};
        System.out.println("Given input array is ");
        for(int i : a)
        {
            System.out.print("  "+i);
        }
        //bucket sort code
        int b[] = new int[a.length];
        for(int i =0;i<a.length;i++)
        {
            b[a[i]]++;
        }
        int count =0;
        for(int i =0;i<a.length;i++){
            for(int j =0;j<b[i];j++)
            {
                a[count] = i;
                count++;
            }
        }
        
        
        
        
        System.out.println("\n Sorted array is ");
        for(int i : a)
        {
            System.out.print("  "+i);
        }

    }
    
}
