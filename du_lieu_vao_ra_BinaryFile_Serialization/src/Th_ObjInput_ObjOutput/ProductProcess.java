package Th_ObjInput_ObjOutput;

import java.io.*;
import java.util.Arrays;

public class ProductProcess {
    public static boolean  writeObjectData (Produc[] objProduct, String fileName) throws IOException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream outputStream1 = new ObjectOutputStream(fileOutputStream);
            outputStream1.writeObject(objProduct);
            outputStream1.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    public static Produc[] readObjecData (String filename) throws IOException {
        try {
            FileInputStream fileInputStream1 = new FileInputStream(filename);
            ObjectInputStream InputStream2 = new ObjectInputStream(fileInputStream1);
            Produc [] producs = (Produc[]) InputStream2.readObject();
            return producs;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\LENOVO\\IdeaProject\\du_lieu_vao_ra_BinaryFile_Serialization\\src\\Th_ObjInput_ObjOutput\\Product.dat";
        Produc[] products = new Produc[3];
        products[0] = new Produc(1,"Kim Anh Ngu",1);
        products[1] = new Produc(2,"Tung Dep Zai 1",1000000000);
        products[2] = new Produc(3,"Tung Dep Zai 2",1000000000);
        writeObjectData(products,fileName);
        Produc[] producs = (Produc[]) readObjecData(fileName);
        System.out.println(Arrays.toString(producs));
    }

}
