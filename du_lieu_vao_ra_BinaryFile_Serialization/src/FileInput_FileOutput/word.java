package FileInput_FileOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class word {
    public static void main(String[] args) throws IOException {
        // tao file
        File file = new File("person.dat.txt");
        // kiem tra xem file ton tai chua
        try {
            boolean isCreated = file.createNewFile();
            if (isCreated) {
                System.out.println("tao file thanh cong");
            }
            else {
                System.out.println("tao file that bai ");
            }
        } catch (IOException e) {
            // printStackTrace : in ra pthuc cua toString //
            e.printStackTrace();
        }

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("person.dat");
            fos.write(10);
            fos.close();
            System.out.println(" Kim Anh ");
        } catch ( Exception e ) {
            System.out.println(e);
        } finally {
            fos.close();
        }










    }
}
// 1.1 : FileInputStream/FileOutputStream thuộc package java.io
// 1.2 : FileInput có 3 phương thức khởi tạo - FileOutput có 5 pthuc khởi tạo
// 1.3 :

