
package lab3q3;
import java.util.*;

public class Lab3q3 {
public static void display(int...n)
{
    for(int i=0; i<n.length;i++)
    {
        System.out.print(n[i] +" ");
     
    }
       System.out.println();
   
}



 public static void max(int...n)
    {
       int m=n[0];
       for(int i=0; i<n.length;i++)
       {
           if(m<n[i])
               m=n[i];
       }
       System.out.println(m+ " is the maximum of the given list");
       
        
    }
 public static void sum(int...n)
 {
     int s=0;
     for(int i=0; i<n.length;i++)
     {
         s=s+n[i];
         
     }
     System.out.println("the sum of the given list is "+s);
 }
   /* public static void check(int...n,int...m)
    {
     System.out.println("this is valid ");
    }*/
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=s.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the total number of elements you want to store");
        int m=s.nextInt();
        System.out.println("Enter the list of elements");
        for(int i=0; i<m;i++)
        {
            arr[i]=s.nextInt();
        }
        display(arr);
        max(arr);
        sum(arr);
        //check(arr);
        
    }
    
}
