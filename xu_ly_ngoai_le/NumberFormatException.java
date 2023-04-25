import java.util.Scanner;

public class NumberFormatException {
    private void caltulate(int x, int y) {
        try {
            int a = x+y;
            int b = x-y;
            int c = x*y;
            int d = x/y;
            System.out.println("tong x + y = " + a );
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        }catch (Exception e ) {
            System.err.println("xay ra ngoai le :" + e.getMessage());
        }
    }
}
class CalculationExample {
    public static void main(String[] args) {
        CalculationExample calc = new CalculationExample();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap x : ");
        int x = sc.nextInt();
        System.out.println("nhap y : ");
        int y = sc.nextInt();
        
    }
}


