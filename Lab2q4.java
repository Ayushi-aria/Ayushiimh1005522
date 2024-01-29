
package lab2q4;

import java.util.*;

public class Lab2q4 {

    
    public static void main(String[] args)
    {
       
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=s.nextInt();
        int [] arr= new int[n];
         System.out.println("Enter the elements of array");
         for(int i=0;i<n;i++)
             arr[i]=s.nextInt();
         for(int i=0;i<n;i++)
            System.out.print(arr[i]+ " ");
         System.out.println();
         System.out.print( "Enter the element to be searched ");
         int a=s.nextInt();
         int count=0;
         int b=0;
         for(int i=0;i<n;i++)
         {
         if(a==arr[i]){
             count=1;
             b=i;
         }
 
         }
         if(count!=0)
             System.out.println("the entered element is present at index :"+b);
         else
             System.out.println( "the element is not present ");
          
         
        
        
        
    }
    
}
