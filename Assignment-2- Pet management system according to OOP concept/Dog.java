public class Dog extends Pet {

    Dog(String name, int age){
        super(name, age);
    }
    

    public void makeSound(){
        System.out.println(getName() + " (Dog) says Woof!");
    }

}
