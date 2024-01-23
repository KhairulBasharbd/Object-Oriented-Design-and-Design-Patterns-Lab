import java.util.HashMap;
import java.util.Map;

// Subject interface
interface OnlineStore {
    void purchaseProduct(String product, int quantity);
}

// RealSubject class
class RealOnlineStore implements OnlineStore {
    private Map<String, Integer> inventory;

    public RealOnlineStore() {
        this.inventory = new HashMap<>();
        // Initialize some products in the inventory
        inventory.put("Laptop", 100);
        inventory.put("Smartphone", 200);
        inventory.put("Headphones", 150);
    }

    @Override
    public void purchaseProduct(String product, int quantity) {
        // Simulate the purchase process
        if (inventory.containsKey(product) && inventory.get(product) >= quantity) {
            inventory.put(product, inventory.get(product) - quantity);
            System.out.println(quantity + " units of " + product + " purchased successfully.");
        } else {
            System.out.println("Sorry, " + product + " is out of stock or insufficient quantity.");
        }
    }
}

// Proxy class
class OnlineStoreProxy implements OnlineStore {
    private RealOnlineStore realOnlineStore;

    public OnlineStoreProxy() {
        this.realOnlineStore = new RealOnlineStore();
    }

    @Override
    public void purchaseProduct(String product, int quantity) {
        // Implement proxy logic, such as global distribution
        if (quantity > 10) {
            System.out.println("Large order detected. Initiating global distribution.");
            // Perform global distribution logic here (for demonstration, we'll just print a message)
            System.out.println("Products distributed globally.");
        }

        // Delegate the purchase to the real object
        realOnlineStore.purchaseProduct(product, quantity);
    }
}

// Client code
public class ProxyPattern{
    public static void main(String[] args) {
        // Using the proxy
        OnlineStore onlineStore = new OnlineStoreProxy();

        // Purchase products
        onlineStore.purchaseProduct("Laptop", 5);
        onlineStore.purchaseProduct("Smartphone", 12); // Large order triggers global distribution
        onlineStore.purchaseProduct("Headphones", 3);
    }
}
