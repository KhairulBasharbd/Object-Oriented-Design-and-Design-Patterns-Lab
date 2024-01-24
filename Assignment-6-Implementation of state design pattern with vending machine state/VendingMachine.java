public class VendingMachine {
    private VMState state;
 
    public VendingMachine(){
       state = null;
    }
 
    public void setState(VMState state){
       this.state = state;		
    }
 
    public VMState getState(){
       return state;
    }
 }