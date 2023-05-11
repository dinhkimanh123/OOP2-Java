package ReadFileExample;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class main {
        public static void main(String[] args) throws IOException {
            System.out.println("nhap dg dan file ");
            Scanner sc = new Scanner(System.in);
            String path = sc.nextLine();
            readFileText readFileText1 = new readFileText();
            readFileText1.readFileText(path);
        }
}
