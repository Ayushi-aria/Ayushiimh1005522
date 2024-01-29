
package lab3q1;
import java.util.*;

public class Lab3q1 {

   
    
        public static void Shape(float r)
        {
            float A= 3.14f*r*r;
            float P=2*3.14f*r;
            System.out.println("the Area of circle of radius "+r +" is "+ A);
            System.out.println("the circumference of circle of radius "+r +" is "+ P);
        }
        
        public static void Shape(int a, int b )
        {
            int A=a*b;
            int P=2*(a+b);
            System.out.println("the Area rectangle  is "+ A);
            System.out.println("the pereimeter of rectangle is "+ P);
        }
         public static void Shape(int a )
        {
            int A=a*a;
            int P=4*a;
            System.out.println("the Area of Square  is "+ A);
            System.out.println("the pereimeter of Square is "+ P);
        }
         public static void main(String[] args) {
             Scanner s=new Scanner(System.in);
              System.out.println("Enter the radius of circle");
              float r= s.nextFloat();
              Shape(r);
              System.out.println("Enter the length and breath of rectangle");
              int a= s.nextInt();
              int b= s.nextInt();
              Shape(a,b);
              System.out.println("Enter the side of square");
              int p= s.nextInt();
              Shape(p);
         }
         
    }
    

