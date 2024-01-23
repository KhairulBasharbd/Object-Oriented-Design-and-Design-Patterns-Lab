public class RealImage implements Image{

    private String fileName;
    RealImage(String fileName){
        this.fileName = fileName;

        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loaded from disk");
    }

    @Override
    public void display() {

        System.out.println(fileName+" is Displayed");
    }
    
}
