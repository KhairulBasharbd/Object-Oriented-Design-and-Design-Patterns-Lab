import java.util.ArrayList;
import java.util.List;

// Component interface
interface HousingStructure {
    void display();
}

// Leaf class
class Room implements HousingStructure {
    private String name;

    public Room(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Room: " + name);
    }
}

// Composite class
class Floor implements HousingStructure {
    private String name;
    private List<HousingStructure> structures = new ArrayList<>();

    public Floor(String name) {
        this.name = name;
    }

    public void addStructure(HousingStructure structure) {
        structures.add(structure);
    }

    @Override
    public void display() {
        System.out.println("Floor: " + name);
        for (HousingStructure structure : structures) {
            structure.display();
        }
    }
}

// Composite class
class Building implements HousingStructure {
    private String name;
    private List<HousingStructure> structures = new ArrayList<>();

    public Building(String name) {
        this.name = name;
    }

    public void addStructure(HousingStructure structure) {
        structures.add(structure);
    }

    @Override
    public void display() {
        System.out.println("Building: " + name);
        for (HousingStructure structure : structures) {
            structure.display();
        }
    }
}

public class CompositePatternDemo {
    public static void main(String[] args) {
        // Create leaf objects
        Room room1 = new Room("Bedroom 1");
        Room room2 = new Room("Bedroom 2");
        Room room3 = new Room("Living Room");
        Room room4 = new Room("Bathroom");

        // Create composite objects
        Floor floor1 = new Floor("First Floor");
        floor1.addStructure(room1);
        floor1.addStructure(room2);

        Floor floor2 = new Floor("Second Floor");
        floor2.addStructure(room3);
        floor2.addStructure(room4);

        Building building = new Building("My House");
        building.addStructure(floor1);
        building.addStructure(floor2);

    
        building.display();
    }
}
