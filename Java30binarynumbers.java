import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        
        toBin(n);
        

        bufferedReader.close();
    }
    
    
    
    public static  void toBin(int decimal) {
    String str = "";
          int binary[] = new int[40];    
             int index = 0;    
             while(decimal > 0){    
               binary[index++] = decimal%2;    
               decimal = decimal/2;    
             }    
             for(int i = index-1;i >= 0;i--){    
 
               String.valueOf(binary[i]);
               str +=(String.valueOf(binary[i]));
               
             }
             List<String> strlist = Pattern.compile("0")
                     .splitAsStream(str).sorted(Comparator.reverseOrder())
                     .collect(Collectors.toList());
 
            System.out.print(strlist.get(0).length());
             }  
}
