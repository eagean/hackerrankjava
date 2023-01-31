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

        String n = bufferedReader.readLine();
        
            bufferedReader.close();
            BigInteger ss = new BigInteger(n);
            //Long m =Long.valueOf(n);
        
        
        List<Integer> primeros = new ArrayList<Integer>();
       Collections.addAll(primeros,2,3,5,7,11,13);
        int atlo =0;
       for(int i =0;i<primeros.size();i++) {
          if(ss.isProbablePrime(primeros.get(i))) {
              atlo++;
             
              
          }
              
       }
       if (atlo != 0)
       System.out.print("prime");
       else System.out.print("not prime");

    } 
}
