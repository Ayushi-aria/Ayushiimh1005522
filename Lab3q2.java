package lab3q2;

import java.util.*;

public class Lab3q2 {
    public static boolean valid(String name)
    {
        for(char c: name.toCharArray()){
            if(!Character.isLetter(c))
            {
                return false;
            }
                }
        return true;
    }
    
    
    
    public static boolean valid(int age)
    {
        return age>3 && age<15; 
    }

   
    public static void main(String[] args) 
    {
      Scanner s=new Scanner(System.in );
      System.out.println("Enter your name");
      String name =s.nextLine();
      if(valid(name))
          System.out.println("nmae is valid");
      else
          System.out.println("Please enter only alphabets in name section");
      System.out.println("Enter your age");
      int age= s.nextInt();
      if(valid(age))
          System.out.println("you are eligible");
      else
          System.out.println("Sorry eligibility is satisfied");
          
    }
    
}
