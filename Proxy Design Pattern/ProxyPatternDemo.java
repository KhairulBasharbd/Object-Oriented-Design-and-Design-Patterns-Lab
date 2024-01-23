public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("abc.jpg"); 

        image.display();
        Image image1 = new ProxyImage("xyz.jpg"); 
        image1.display();
        image.display();
    }
    
}
