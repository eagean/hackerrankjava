import java.util.Scanner;
class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "(?:^(?:[a-zA-Z])[\\w]{7,29})";
}
//Regex: Fist lookup is regular loop up to checking inputs valid or not inside look up is checking first input's validation
//Then length possibles are min 8 max is 30. Already checked first one so user name can get 7 to 29 more valid data for this process

public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}