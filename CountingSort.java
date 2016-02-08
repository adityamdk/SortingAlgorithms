package countingsort;
public class CountingSort {
    public static void main(String[] args) {
           
         int a[]= {1,5,5,5,6,6,6,7,7,7,7,3,4,2};
        System.out.println("Given input array is ");
        for(int i : a)
        {
            System.out.print("  "+i);
        }
        //Counting sort code
        int b[] = new int[a.length];
        for(int i =0;i<a.length;i++)
        {
            b[a[i]]++;
        }
        
        for(int i =1;i<a.length;i++)
        {
            b[i]=b[i]+b[i-1];
        }
        int out[] = new int[a.length];
       
        for(int i =0;i<a.length;i++){
           
                out[b[a[i]]-1] = a[i];
                --b[a[i]];
           
        }
        
        
        
        
        System.out.println("\n Sorted array is ");
        for(int i : out)
        {
            System.out.print("  "+i);
        }



    }
    
}
