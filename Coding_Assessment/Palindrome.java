   //palindrome of a given string
   
    import java.util.*;   
    class Main
    {  
       public static void main(String args[])  
       {  
          String name, reverse = "";  
          Scanner in = new Scanner(System.in);   
          System.out.println("Enter a string");  
          name = in.nextLine();   
          int length = name.length();   
          for ( int i = length - 1; i >= 0; i-- )  
             reverse = reverse + name.charAt(i);  
          if (name.equals(reverse))  
             System.out.println("is a palindrome.");  
          else  
             System.out.println("isn't a palindrome.");   
       }  
    }  
