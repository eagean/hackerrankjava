import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         String s = scan.nextLine();
    s=s.replaceFirst("^\\s*", "");
    
      if(s.length()!=0) {
       int l = s.split("[_'\\?,\\s@!\\.]+").length;
      String[] q = s.split("[_'\\?,\\s@!\\.]+");
      System.out.println(l);
      for(int i =0;i<l;i++) {
          
          
        System.out.printf("%s%n",q[i]);
      }
      
  }else System.out.print(s.length());
     
       
        scan.close();
    }
}

