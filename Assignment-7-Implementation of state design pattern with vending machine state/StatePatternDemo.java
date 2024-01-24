public class StatePatternDemo {
    public static void main(String[] args) {
       VendingMachine context = new VendingMachine();
 
       IdleState idleState = new IdleState();
       idleState.doAction(context);
 
       System.out.println(context.getState().toString());
 
       //StopState stopState = new StopState();
       //stopState.doAction(context);
 
       //System.out.println(context.getState().toString());
    }
 }