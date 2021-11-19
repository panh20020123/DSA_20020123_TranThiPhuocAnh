import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int q=scan.nextInt();
        Stack<String> stack=new Stack<String>();
        String s="";
        stack.push(s);
        for(int t=0;t<q;t++)
            {
            int no=scan.nextInt();
            if(no==1)
                {
               s=s.concat(scan.next());
               //System.out.println(s);
                stack.push(s);
            }
            else if(no==2)
                {
                int k=scan.nextInt();
                if((s.length()-k)!=0)
                s=s.substring(0,s.length()-k);
                else
                    s="";
                //System.out.println(s);
                stack.push(s);
            }
            else if(no==3)
                {
                int k=scan.nextInt();
                System.out.println(s.charAt(k-1));
            }
            else
                {
                   stack.pop();
                s=stack.peek();
            }
        }
    }
}