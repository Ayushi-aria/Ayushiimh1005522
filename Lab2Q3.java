
package lab2.q3;

import java.util.*;
public class Lab2Q3 {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n =s.nextInt();
        int [] arr= new int[n];
        System.out.println("Enter the total number of elemnets:");
        int m=s.nextInt();
        System.out.println("Enter the elements  of array");
        for(int i=0; i<m;i++)
            arr[i]=s.nextInt();
        for(int i=0; i<m;i++)
             System.out.print(arr[i]+" ");
        System.out.println();
        System.out.println("Enter the location of element to be deleted");
        int loc=s.nextInt();
        for(int i=loc; i<m-1;i++)
        {
          arr[i]=arr[i+1];
                  
        }
        m--;
        System.out.println();
         System.out.println("the new array");
        
        for(int i=0; i<m;i++)
             System.out.print(arr[i]+" ");
         
        
    }
    
}
