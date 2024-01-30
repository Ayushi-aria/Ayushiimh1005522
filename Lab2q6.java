
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
            
// qustion 7
    System.out.println("Enter the position");
    int pos=s.nextInt();
    int [] arr4=new int[pos];
    int [] arr5=new int[n-pos];
    for(int i=0;i<pos;i++)
    {
        arr4[i]=arr[i];
    }
    for(int i=0;i<pos;i++)
    {
        System.out.print(arr4[i] + " ");
    }
    System.out.println();
    for(int i=pos;i<n;i++)
    {
        arr5[i-pos]=arr[i];
    }
    for(int i=pos;i<n;i++)
    {
        System.out.print(arr5[i-pos] + " ");
    }
     System.out.println();
    for(int i=0;i<pos;i++)
    {
        for(int j=i+1;j<pos;j++)
            if(arr4[i]==arr4[j])
               System.out.println("duplicate of"+arr4[i]+"is at"+j);
      
    }
    
     for(int i=pos;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
            if(arr5[i-pos]==arr5[j-pos])
               System.out.println("duplicate of"+arr5[i-pos]+"is at"+(j-pos));
        
    }
    System.out.println();
    }
}

