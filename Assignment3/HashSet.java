import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Set<String> s = new HashSet<String>();
        Scanner in = new Scanner(System.in);
        String no = in.nextLine();
        int n = Integer.parseInt(no);
        for(int i=0;i<n;++i)
        {
            String pair = in.nextLine();
            s.add(pair);
            System.out.println(s.size());
        }
    }
}
