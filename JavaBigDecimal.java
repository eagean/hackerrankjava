import java.math.BigDecimal;
import java.util.*;
class Solution {
  public static void main(String[] args) {
    //Input
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] s = new String[n + 2];
    for (int i = 0; i < n; i++) {
      s[i] = sc.next();
    }
    sc.close();

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        BigDecimal tbda = new BigDecimal(s[i]);
        BigDecimal tbdb = new BigDecimal(s[j]);
        if (tbda.compareTo(tbdb) < 0) {
          String temp = s[i];
          s[i] = s[j];
          s[j] = temp;
        } else if (tbda.compareTo(tbdb) == 0 && (((s[i].contains(".")) && (s[j].contains("."))))) {
          if (((s[i].substring(0, (s[i].lastIndexOf(".")))).length()) >
            ((s[j].substring(0, (s[j].lastIndexOf(".")))).length())) {
            s[i] = s[i];
            //if decimally equal and left side of dot have more char than the other decimal val do nothing 
            // check value for have decimal side if have decimal side gets value which have more 
            //simply get value which have more char on left side of dot or comma
          } else {
            String temp = s[i];
            s[i] = s[j];
            s[j] = temp;
          }

        }
      }
    }
    //Output
    for (int i = 0; i < n; i++) {
      System.out.println(s[i]);
    }
  }
}