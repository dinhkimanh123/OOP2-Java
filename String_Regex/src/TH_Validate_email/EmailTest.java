package TH_Validate_email;

// Tạo lớp kiểm thử //

public class EmailTest {
    public static Email emailTest ;
    public static final String[] validetaEmail = new String[] {"anhdinh@g.com", "dinhanh@yahoo.com"};
    public static final String[] invaliEmail = new String[] {"@gmail.com", "@123@gmail.com"};

    public static void main(String[] args) {
        emailTest = new Email();
        for (String email: validetaEmail
             ) {
            boolean isvalid = emailTest.validate(email);
            System.out.println("email is " + email + " valide " + isvalid);
        }
        for (String email : invaliEmail
             ) {
            boolean isvalid = emailTest.validate(email);
            System.out.println("email is " + email + " valid " + isvalid);

        }
    }
}
