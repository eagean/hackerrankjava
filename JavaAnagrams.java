import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
    String sa = a.toLowerCase();
        String sb = b.toLowerCase();
        int counter =0;
        
        String[] ale = new String[sa.length()];
        String[] ble = new String[sb.length()];
     if(ale.length==ble.length){   
        for( int i= 0  ; i < sa.length();i++){
            
            ale[i]= sa.substring(i,i+1);
            ble[i]= sb.substring(i,i+1);
            
    }
        sorter(ale);
        sorter(ble);        
        
    for( int i= 0  ; i < sa.length();i++){
    if(ale[i].compareTo(ble[i])==0)
        {counter++;}else break;            
        }
        if(counter == ale.length) {return true;}else return false;
    }
    else return false;
    }
    
    public static String[] sorter(String[] sortSS) {
        int n = sortSS.length-1;
       

       for (int i = 0; i <= n ; i++) {
         for (int j = i + 1; j <= n; j++) {
           if (sortSS[i].compareTo(sortSS[j]) >= 0) {
             String temp = sortSS[i];
             sortSS[i] = sortSS[j];
             sortSS[j] = temp;
             }
             }
         }
         
       return sortSS;
     }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
