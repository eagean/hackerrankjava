import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       
        List<Integer> lis = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            int data = in.nextInt();   
            lis.add(data);          
        }
        int quest=in.nextInt();
        while(quest>0) {             
        String comm = in.next();  
        switch(comm) { 
        case "Insert":{
            int index = in.nextInt();   
            int data= in.nextInt();
            lis.add(index, data);
             quest--;
             break;
        }  
        case "Delete":{
            int index = in.nextInt(); 
            lis.remove(index);
             quest--;
            
            break;
        }}}
          String clean= lis.toString().replaceAll("[\\[\\]\\,]+", "");
        System.out.print(clean);
         in.close();     
        }     
}