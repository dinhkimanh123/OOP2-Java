package FileWriteExample;

import java.io.File;
import java.io.FileWriter;

public class Filewrite {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("test.txt");
            fileWriter.write("Viet ngu ngok ");
            fileWriter.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
