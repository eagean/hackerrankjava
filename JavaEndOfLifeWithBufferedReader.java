
import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {
        // I used buffered reader instead of scanner
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                String strCurrentLine;
                int i =1;
                while ((strCurrentLine = br.readLine()) != null) {
                    System.out.printf("%d %s%n",i,strCurrentLine);
                    i++;
                }
                
                
            
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        
        }
   
}
