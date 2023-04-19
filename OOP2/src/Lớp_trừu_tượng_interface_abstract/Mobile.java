package interface_abstract;

 class TestMobile {
    public static void main(String[] args) {
       Nokia nokia = new Nokia();
       Iphone iphone = new Iphone();

       nokia.downloadApp();
       iphone.downloadApp();
    }

}
abstract class Mobile {
    abstract void downloadApp();


}
class Iphone extends Mobile {
    @Override
   void downloadApp() {
        System.out.println("download Appstore");
    }
}
class Nokia extends Mobile {
    @Override
    void downloadApp() {
        System.out.println("download CHplay");
    }
}