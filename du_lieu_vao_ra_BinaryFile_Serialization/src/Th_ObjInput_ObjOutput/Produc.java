package Th_ObjInput_ObjOutput;

import java.io.Serializable;

public class Produc implements Serializable {
    int proID;
    String proName;
    float price;

    public Produc(int proID,String proName, float price){
        this.proID = proID;
        this.proName = proName;
        this.price = price;

    }

    public int getProID() {
        return proID;
    }

    public String getProName() {
        return proName;
    }

    public float getPrice() {
        return price;
    }

    public void setProID(int proID) {
        this.proID = proID;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public String toString(){
        return "ID :" + proID + "name " + proName + "gia ca " + price ;
    }


}
