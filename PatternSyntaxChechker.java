import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        int q=1;
     
		while(q<=testCases){
            
			String pattern = in.nextLine() ;
            
            try {Pattern pat =Pattern.compile(pattern,1);
             System.out.printf("Valid"+"%n");
            }
            catch(Exception i){
                System.out.printf("Invalid"+"%n");
            }
              q++;
                 
                  
		}in.close();
	}
}


