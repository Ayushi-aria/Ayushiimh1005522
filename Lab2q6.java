
package lab2q6;

import java.util.Scanner;


public class Lab2q6 {

    
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
                int a=0;
                int b=0;
                for(int j=0;j<n; j++)
                {
                    if(arr[j]%2==0) {
                        a++;

                    }

                    else
                        b++;
                }
                System.out.println(a+" "+b);
                int[] arr2=new int[a];
        int[] arr3=new int[b];
        for(int j=0;j<n; j++)
        {
            if(arr[j]%2==0) {
                arr2[a-1]=arr[j];
                a--;

            }

            else {
                arr3[b-1]=arr[j];
                b--;
            }
        }

        for (int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i] +" ");
        }
        System.out.println();
        for (int i=0;i<arr3.length;i++)
        {
            System.out.print(arr3[i] +" ");
        }

        System.out.println("wow !! its working perfectly");
            }


}

