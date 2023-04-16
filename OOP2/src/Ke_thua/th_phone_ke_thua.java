package Ke_thua;

public class th_phone_ke_thua {

}
class mobile {
    String hsx;
    int cpu;
    public mobile(){
        this.hsx = "iphone";
        this.cpu = 10;
    }
    public mobile(String hsx, int cpu){
        this.hsx = hsx;
        this.cpu = cpu;
    }

    public String getHsx() {
        return hsx;
    }

    public int getCpu() {
        return cpu;
    }

    public void setHsx(String hsx) {
        this.hsx = hsx;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }
    @Override
    public String toString() {
        return "hãng : " + getHsx() + "cpu :" + getCpu();
    }
}
class iphone extends mobile {
   int id_phone;
   public iphone(){
       super();
       this.id_phone = 0;
   }

}
class nokia extends mobile {
    public void downloadApp(){
        System.out.println(" tải từ CHplay : " + getHsx() + " cpu : " + getCpu());
    }

}
class show_mobile {
    public static void main(String[] args) {
        nokia nokia1 = new nokia();
        iphone iphone1 = new iphone();

        nokia1.downloadApp();

    }

}

