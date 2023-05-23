package TH_Validate_account;
import java.lang.String;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Expression {
    public static Pattern pattern;
    public static Matcher matcher;
    // {5, } : ít nhất 5 kí tự //
    // [_a-z0-9] : cho phép dấu gạch //
    public static final String ACCOUNT = "^[_a-z0-9]{5,}$";
    public  Regular_Expression(){
        this.pattern = Pattern.compile(ACCOUNT);
    }
     //  phương thức validate() để kiểm tra email cần kiểm tra có hợp lệ với ACCOUNT đã định nghĩa hay không.
    public boolean validate (String regex ) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
