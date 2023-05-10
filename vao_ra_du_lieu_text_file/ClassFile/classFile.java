package ClassFile;

import java.io.File;

public class classFile {
    public static void main(String[] args) {
        try {
            File file = new File("texstFile");
            file.createNewFile();

            if (!file.exists()){
                throw new Exception();
            }
            System.out.println("hsudhs");
        } catch (Exception e ) {
            System.out.println(e);
        }
        System.out.println("áhahhj");
    }
}
