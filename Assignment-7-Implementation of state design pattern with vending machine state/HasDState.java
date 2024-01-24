public class HasDState implements VMState {

    public void doAction(VendingMachine context) {
       System.out.println("VendingMachine in Has $ state");
       context.setState(this);	
    }
 
    public String toString(){
       return "Has $ State";
    }
 }