import java.util.ArrayList;
import java.util.List;

class PetManagementSystem implements PetManager {
    private List<Pet> pets = new ArrayList<>();

    @Override
    public void addPet(Pet pet) {
        pets.add(pet);
    }

    @Override
    public void removePet(Pet pet) {
        pets.remove(pet);
    }

    @Override
    public void listPets() {
        System.out.println("List of Pets:");
        for (Pet pet : pets) {
            System.out.println(pet.getName() + " - Age: " + pet.getAge());
        }
    }
}
