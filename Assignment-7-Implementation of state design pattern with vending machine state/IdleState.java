public class IdleState implements VMState{

    public void doAction(VendingMachine context) {
       System.out.println("Machine is in Idle state");
       context.setState(this);	
    }
 
    public String toString(){
       return "Idle State";
    }
 }