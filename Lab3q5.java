
package lab3q5;

import java.util.*;
public class Lab3q5 {

    
    
        public static int sum(int [] arr)
        {
            int s=0;
            for(int i=0; i<arr.length;i++)
            {
                s=s+arr[i];
            }
            return s;
            
        }
        
        public static void rverse(int a)
        {
            int s=0;
            while(a>=1)
            {
                s=a%10;
                a=a/10;
                System.out.print(s);
            }
        }
        
        
        
    public static void main(String[] args) 
    {
    Scanner s=new Scanner(System.in);
    
      System.out.println("Enter the size of array");
      int n = s.nextInt();
      int [] arr=new int[n];
        System.out.println("Enter the elemenets of array");
        for(int i=0; i<n;i++)
        {
            arr[i]=s.nextInt();
                
        }
        for(int i=0; i<n;i++)
        {
            System.out.print(arr[i]+ " ");
                
        }
         System.out.println();
        int a=sum(arr);
        System.out.println(a);
        rverse(a);
    }
    
}
