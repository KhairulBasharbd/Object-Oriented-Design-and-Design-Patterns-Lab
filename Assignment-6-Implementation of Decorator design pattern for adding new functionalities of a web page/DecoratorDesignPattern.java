// Component interface representing the basic web page
interface WebPage {
    void display();
}

// ConcreteComponent representing a basic web page
class BasicWebPage implements WebPage {
    @Override
    public void display() {
        System.out.println("Displaying basic web page.");
    }
}

// Decorator abstract class
abstract class WebPageDecorator implements WebPage {
    protected WebPage webPage;

    public WebPageDecorator(WebPage webPage) {
        this.webPage = webPage;
    }

    @Override
    public void display() {
        webPage.display();
    }
}

// ConcreteDecorator adding authentication feature
class AuthenticatedWebPage extends WebPageDecorator {
    public AuthenticatedWebPage(WebPage webPage) {
        super(webPage);
    }

    @Override
    public void display() {
        super.display();
        authenticateUser();
    }

    private void authenticateUser() {
        System.out.println("Authenticating user...");
    }
}


public class DecoratorDesignPattern{
    public static void main(String[] args) {
        // Create a basic web page
        WebPage basicWebPage = new BasicWebPage();

        // Add authentication feature
        WebPage authenticatedWebPage = new AuthenticatedWebPage(basicWebPage);


        // Display the final decorated web page
        authenticatedWebPage.display();
    }
}
