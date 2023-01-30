import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    /* Enter your code here. Print output to STDOUT. */

    char[] chr = A.toCharArray();
    int stp = A.length() - 1;
    int indexcnt = 0;
    

    if (A.length() % 2 == 0) {
      for (int i = 0; i <= stp; i++) {
        if (chr[i] == chr[stp - i])
          indexcnt++;

      }
    } else if (A.length() % 2 == 1) {
      for (int i = 0; i <= stp; i++) {
        if (chr[i] == chr[stp - i])
          indexcnt++;
      }

    }

    if (indexcnt == A.length())
      System.out.print("Yes");
    else System.out.print("No");

  }
}