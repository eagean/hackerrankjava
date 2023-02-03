import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner bfr = new Scanner(System.in);
        int n =( Integer.parseInt(bfr.nextLine()));
        String[] asr =bfr.nextLine().split(" ");
        int[] arr = new int[asr.length];
         
        
            for (int i = 0; i < n; i++) {
    
              int asrk = Integer.parseInt(asr[i]);
                   arr[i]=(asrk);
       
            }           
            System.out.print(countNegative(arr));
            bfr.close();
         
            
    }
        static int countNegative(int[] arr) {           
                int rst=0; 
                int q =0;
                ArrayList rr = new ArrayList();

               for(int i=0; i<=arr.length;i++) {
                   for(int j=i+1; j<=arr.length;j++) {   
                     q =   sss(arr,i,j);      
                       if(q<0) {   
                           rr.add(q);
                       }                                              
                      //System.out.println("i>>"+i+"  "+"j>>"+j+">>>>"+sss(arr,i,j));
                   }}    
               rst=rr.size();
               return rst;
              
            }
                
            public static int sss (int[] ints, int from, int to) {
               int sum =0;
                for (int i = from; i < to; i++) {
                   sum+= ints[i];
                }
                return sum;
                }
            }    