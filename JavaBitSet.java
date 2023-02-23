import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        
            String[] init =   sc.nextLine().split(" ");
            int b=Integer.valueOf( init[0]);
            int t=Integer.valueOf( init[1]);
            
            BitSet b1= new BitSet(b);
            BitSet b2= new BitSet(b);    
            List<BitSet> bts=new ArrayList<BitSet>();
            bts.add(b1);
            bts.add(b2);
            
            while(t-->0) {
                String[] todo =   sc.nextLine().split(" ");
                switch(todo[0]) {        
                case "AND":bts.get(Integer.valueOf(todo[1])-1).and(bts.get(Integer.valueOf(todo[2])-1));
                System.out.println(b1.cardinality()+" "+b2.cardinality());
                    break;
                case "SET":bts.get(Integer.valueOf(todo[1])-1).set(Integer.valueOf(todo[2]));
                System.out.println(b1.cardinality()+" "+b2.cardinality());
                    break;
                case "FLIP":bts.get(Integer.valueOf(todo[1])-1).flip(Integer.valueOf(todo[2]));
                System.out.println(b1.cardinality()+" "+b2.cardinality());
                    break;
                case "OR":bts.get(Integer.valueOf(todo[1])-1).or(bts.get(Integer.valueOf(todo[2])-1));
                System.out.println(b1.cardinality()+" "+b2.cardinality());
                    break;  
                 case "XOR":bts.get(Integer.valueOf(todo[1])-1).xor(bts.get(Integer.valueOf(todo[2])-1));        
                System.out.println(b1.cardinality()+" "+b2.cardinality());  
                }        
            }
    }
}