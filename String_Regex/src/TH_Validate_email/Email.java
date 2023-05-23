package TH_Validate_email;

import java.lang.String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public static Pattern pattern;
    public Matcher matcher;
    // kimanh@gmial.com //
    // $ : kết thúc chuỗi String //
    // ^ : bắt đầu với chuỗi String hoặc 1 dòng //
    // final : Phương thức final: bạn không thể ghi đè phương thức final //
    //  biến static String EMAIL chứa định dạng Regular Expression của email //
    public static final String EMAIL = "^[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z]+$";
    public Email(){
        pattern = Pattern.compile(EMAIL);
    }

    //  phương thức validate() để kiểm tra email cần kiểm tra có hợp lệ với EMAIL đã định nghĩa hay không.
    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
