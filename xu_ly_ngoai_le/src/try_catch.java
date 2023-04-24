import java.util.Random;
import java.util.Scanner;

public class try_catch {
}
class ArraExample {
    public Integer[] createRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("dsach phan tu mang :");
        for (int i = 0; i < 100 ; i++) {
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i] + "");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArraExample arraExample1 = new ArraExample();
        Integer[] arr = arraExample1.createRandom();

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chỉ số bất kì ");

        int x = sc.nextInt();

        try {
            System.out.println("phân tu chi có 5 " + x + "là = " + arr[x]);
        } catch (IndexOutOfBoundsException b ) {
            System.out.println("đã vuwowjt quá giới han ");
        }
    }
}