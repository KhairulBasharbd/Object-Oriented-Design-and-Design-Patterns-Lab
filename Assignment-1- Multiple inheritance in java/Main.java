
//Here, FlyingCar class implements two interface Vehicle and Aircraft. 
//And Override their method start() and takeOff()


interface Vehicle{
    void start();
    //void stop();
}

interface Aircraft{
    void takeOff();
    //void landOn();
}

class FlyingCar implements Vehicle,Aircraft{

    private String name;
    private String model;

    FlyingCar(String name, String model){
        this.name=name;
        this.model=model;

    }

    public void start(){
        System.out.println(name+" "+model+" flying car is starting");
    }

    public void takeOff(){

        System.out.println(name+" "+model+" flying car is taking off");

    }


}



public class Main {
    public static void main(String[] args){

        FlyingCar flyingCar = new FlyingCar("Runner", "X99");

        flyingCar.start();
        flyingCar.takeOff();
    }
}
