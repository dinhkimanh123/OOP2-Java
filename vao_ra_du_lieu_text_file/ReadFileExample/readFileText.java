package ReadFileExample;

import java.io.*;
import java.util.Scanner;

public class readFileText {
    public void readFileText(String filePath) {
        try {
            File file = new File("text.txt");
            file.createNewFile();

            File file1 = new File(filePath);
            if (!file1.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file1));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
            System.out.println(line);
            sum += Integer.parseInt(line);
        }
            br.close();
            System.out.println("tong = " + sum );
    } catch (Exception e) {
            System.out.println("k ton tai");
        }
    }
}


