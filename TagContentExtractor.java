import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int testCases = Integer.parseInt(in.nextLine());
    while (testCases > 0) {
      String line = in.nextLine();
      complexreader(line);
      //Write your code here

      testCases--;
    }
  }
  public static void complexreader(String inp) {

    String regex = "(<){1}(?<amigos>(.+))(>){1}(?<need>[^<>]+)(</){1}(\\k<amigos>)>{1}";

    //regex starts with '<' then gets tag name everything is valid for name tag but '<','>', than close the tag '>'
    //the value between tags is our need part so marked as 'need' in regex this part cannot contain '<','>' chars 
    //if input's end tag to be valid end tags stars with '<' than '/' get the tag name part from begining with amigos group name last of all '>'

    Pattern p = Pattern.compile(regex, Pattern.MULTILINE);
    Matcher m = p.matcher(inp);
    List < String > list = new ArrayList < > ();

    while (m.find()) {
      String mrb = m.group("need");
      list.add(mrb);

    }

    if (list.isEmpty()) {
      System.out.println("None");
    }
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

  }

}