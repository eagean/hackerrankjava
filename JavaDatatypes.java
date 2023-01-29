import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {
        String b = "* byte%n";
        String s = "* short%n";
        String in = "* int%n";
        String l = "* long%n";
        


        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                   long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=128-1)System.out.printf(b); 
                    if(x>=-32768 && x<=32768-1)System.out.printf(s);
                        if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)System.out.printf(in);
                            if(x>=-Long.MIN_VALUE && x<=Long.MAX_VALUE)System.out.printf(l);
               
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
     }
 }
