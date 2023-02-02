import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int [][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

          

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arr[i][j] = arrItem;
            }

           
        }
           System.out.print(sumShape(arr));
        bufferedReader.close();
      
    }
     static int sumShape(int[][] arr) {
        int maxVal=0;
        ArrayList<Integer> finMax = new ArrayList();
        for(int i=0;i<arr.length-2;i++) {
         for (int j = 0; j<arr[i].length-2; j++) {         
                maxVal = arr[i][j]+arr[i][j+1]+arr[i][j+2] + 
               arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
             finMax.add(maxVal);
               }
               //[X][X][X][ ][ ][ ]    //[ ][X][X][X][ ][ ]  //[ ][ ][X][X][X][ ]  //[ ][ ][ ][X][X][X]  
               //[ ][X][ ][ ][ ][ ]    //[ ][ ][X][ ][ ][ ]  //[ ][ ][ ][X][ ][ ]  //[ ][ ][ ][ ][X][ ]  
               //[X][X][X][ ][ ][ ]    //[ ][X][X][X][ ][ ]  //[ ][ ][X][X][X][ ]  //[ ][ ][ ][X][X][X]  
               //[ ][ ][ ][ ][ ][ ]    //[ ][ ][ ][ ][ ][ ]  //[ ][ ][ ][ ][ ][ ]  //[ ][ ][ ][ ][ ][ ]  
               //[ ][ ][ ][ ][ ][ ]    //[ ][ ][ ][ ][ ][ ]  //[ ][ ][ ][ ][ ][ ]  //[ ][ ][ ][ ][ ][ ]  
               //[ ][ ][ ][ ][ ][ ]    //[ ][ ][ ][ ][ ][ ]  //[ ][ ][ ][ ][ ][ ]  //[ ][ ][ ][ ][ ][ ]

               // Possible shapes initially like that arr[i][j] arr[i][j+1] arr[i][j+2] for top of our shape middle part
               // is limited by top and bottom shapes left and right part so it just cant use last left and right
               //bottom part is same as top part just got index difference.
               //Arraylist collect all sum values then sort for the max value.

            
            }
        Collections.sort(finMax);
        int result = finMax.get(finMax.size()-1);
     return result;}


}
