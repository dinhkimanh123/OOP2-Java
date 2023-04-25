import java.util.Scanner;

public class bt_1_IllegalTriangleException {
    public void checkTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("khong la tam giac");
        }
        else {
            System.out.println("tam giác hợp lệ ");
        }
    }
}
class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message){
        super(message);
    }
}
class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bt_1_IllegalTriangleException check = new bt_1_IllegalTriangleException();

        try {
            System.out.println("nhap canh thu I :");
            int a = sc.nextInt();
            System.out.print("Nhập vào cạnh thứ II: ");
            int b = sc.nextInt();
            System.out.print("Nhập vào cạnh thứ III: ");
            int c = sc.nextInt();

            try {
                check.checkTriangle(a,b,c);
            } catch (IllegalTriangleException e ) {
                throw new RuntimeException(e);
            }
        }catch (Exception e) {
            System.out.println("sai : ");
        }
    }
}


