package TH_Validate_account;

public class AccountTest {
    public static Regular_Expression regularExpression;
    public static final String[] validAccount = new String[] {"_123abc", "xyz321_"};
    public static final String[] invalidAccount = new String[] {".@", "12345"};

    public static void main(String[] args) {
        regularExpression = new Regular_Expression();
        for (String account: validAccount
             ) {
            boolean isValid = regularExpression.validate(account);
            System.out.println("Account is " + account + " valid "+ isValid);
        }
        for (String account : invalidAccount
             ) {
            boolean isValid = regularExpression.validate(account);
            System.out.println("Account is " + account + " valid " + isValid );

        }
    }
}
