import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
            arr.add(s.nextInt());
        int t=s.nextInt();
        while(t-->0)
            {
            String str=s.next();
               switch(str){
                   case "Delete":
                        int i=s.nextInt();
                         arr.remove(i);
                           break;
                   case "Insert":
                        int ii=s.nextInt();
                        int j=s.nextInt();
                         arr.add(ii,j);
                   break;

               }

        }
    for(Integer x:arr)
            System.out.print(x+" ");
    }
}
