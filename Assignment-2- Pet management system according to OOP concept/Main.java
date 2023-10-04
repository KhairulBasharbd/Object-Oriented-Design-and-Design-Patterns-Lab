

public class Main {
    public static void main(String[] args) {
       
       PetManagementSystem petSystem = new PetManagementSystem();

        // Creating some pets
        Pet dog1 = new Dog("Buddy", 3);
        Pet cat = new Cat("Luna", 2);
        Pet dog2 = new Dog("Max", 4);

        // Adding pets to the system
        petSystem.addPet(dog1);
        petSystem.addPet(cat);
        petSystem.addPet(dog2);
        // List and make sounds of pets
        petSystem.listPets();

        System.out.println("\n----------------\n");

        dog1.makeSound();
        cat.makeSound();
        dog2.makeSound();
    }
}
