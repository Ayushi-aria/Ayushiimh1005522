
package lab2q5;

import java.util.Scanner;


public class Lab2q5 {

    
    public static void main(String[] args) {
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
         for(int i=0; i<n;i++)
         {
            for(int j=i+1;j<n;j++)
            {
              if(arr[i]==arr[j]){
                  System.out.println("the duplicate of "+ arr[i]+" is present at "+j);
              }
            }
            }
         
         
         }
    }
    

