

public class Main {
    public static void main(String[] args) {
       // PetManagementSystem petSystem = new PetManagementSystem();
       PetManagementSystem petSystem = new PetManagementSystem();

        // Create some pets
        Pet dog = new Dog("Buddy", 3);
        Pet cat = new Cat("Whiskers", 2);

        // Add pets to the system
        petSystem.addPet(dog);
        petSystem.addPet(cat);

        // List and make sounds of pets
        petSystem.listPets();
        dog.makeSound();
        cat.makeSound();
    }
}
