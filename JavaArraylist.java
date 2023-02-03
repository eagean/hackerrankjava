import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int row=sc.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        for(int i=0;i<row;i++){
            ArrayList<Integer> arrItm = new ArrayList<>();
            int line=sc.nextInt();
            for(int j=0;j<line;j++){
                arrItm.add(sc.nextInt());
            }
            arr.add(arrItm);  
        }
        
        int req=sc.nextInt();
        for(int i =0;i<req;i++){
            int la=sc.nextInt();
            int lb=sc.nextInt();
            try{
                 System.out.println(arr.get(la-1).get(lb-1));
            }catch(Exception e){
                 System.out.println("ERROR!");
            }
   
        }
        sc.close();
        
             
    }
}
