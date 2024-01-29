
package lab2;


import java.util.*;
public class Lab2 {

    
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
//       quetion 1lab2
       System.out.println("Enter the size of array");
       int n=s.nextInt();
       int[] arr= new int[n];
       System.out.println("Enter the number of elements to be entered in array");
       int m=s.nextInt();
       System.out.println("Enter the  elements ");
       for(int i=0;i<m;i++)
           arr[i]=s.nextInt();
       System.out.println("Enter the array is  ");
       for(int i=0;i<m;i++)
           System.out.print(arr[i]+ " ");
        System.out.println();
       //question 2lab2
       
       System.out.println("the position where you want to insert the element");
       int p=s.nextInt();
       if(p==m)
       {
            System.out.println("enter the element");
            arr[m]=s.nextInt();
            m++;
       }
       else
       {
          for(int i=m-1; i>=p;i--)
          {
            arr[i+1]=arr[i];
            
          }
          System.out.println("Enter the element");
           arr[p]=s.nextInt();
          m++;
           
           for(int i=0;i<m;i++)
           System.out.print(arr[i]+ " ");
        System.out.println();  
        
       }
    }
}