public class ProxyImage implements Image {

    private String fileName;
    private RealImage realImage;

    ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {

       if(realImage == null){
            realImage = new RealImage(fileName);
       }
       realImage.display();
    }
    
}
