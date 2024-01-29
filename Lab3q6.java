
package lab3q6;

public class Lab3q6 {

    public static void display(int n)
    {
         System.out.println("Method with int parameter: " + n);
    }
    public static void display(double n)
    {
         System.out.println("Method with double parameter: " + n);
    }
    public static void display(long n)
    {
         System.out.println("Method with long parameter: " + n);
    }
    public static void display(float n)
    {
         System.out.println("Method with float parameter: " + n);
    }
    public static void main(String[] args) {
        int intvalue=5;
        double doublevalue=10.5;
        long longvalue=100L;
        float floatvalue=20.5f;
        display(intvalue);
        display(doublevalue);
        display(longvalue);
        display(floatvalue);
    }
    
}
