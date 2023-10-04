public class Cat extends Pet{

    Cat(String name, int age){
        super(name, age);
    }

    public void makeSound(){
        System.out.println(getName() + " (Cat) says Meow!");
    }
}
