import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        
        try{
            int x=s.nextInt();
             try{
            int y=s.nextInt();
                 try{
            System.out.println(x/y);
        }
        catch(Exception e)
        {
           System.out.println(e);
        }
        }
        catch(Exception e)
        {
          System.out.println("java.util.InputMismatchException");
        }
        }
        catch(Exception e)
        {
            System.out.println("java.util.InputMismatchException");
        }        
          
    }
}
