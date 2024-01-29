
package lab2q7;

import java.util.Scanner;


public class Lab2q7 {

    
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
       
                System.out.println("Enter the size of array");
                int n=s.nextInt();
                int[] arr=new int[n];
                 System.out.println("Enter the elements of array");
                for(int i=0;i<n;i++)
                {
                    arr[i]=s.nextInt();
                }

                for(int i=0;i<n;i++)
                {
                    System.out.print(arr[i] +" ") ;


                }
                System.out.println();
                for(int i=0;i<n;i++)
                {
                    if(i==0)
                    {
                        if(arr[i]>arr[i+1])
                        {
                            System.out.println("the value is " + arr[i]);
                        }
                    }
                    else
                    {
                        if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
                            System.out.println("the value is " + arr[i]);
                            
                    }
                }
    }
    
}
