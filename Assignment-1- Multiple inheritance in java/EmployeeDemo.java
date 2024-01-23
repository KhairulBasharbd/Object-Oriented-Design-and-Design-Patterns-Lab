interface EmployeeInfo{
    void displayInfo();
}

interface EmployeeDuty{
    void work(); 
}

class Employee1 implements EmployeeDuty,EmployeeInfo{
    private String name;
    private int id;


    Employee1(String name, int id){
        this.name = name;
        this.id = id;

    }

    @Override
    public void displayInfo() {
        System.out.println(name+" " +id);
    }

    @Override
    public void work() {
        System.out.println(" employee is working");
    }

}


public class EmployeeDemo {
    public static void main(String [] args){
        Employee1 emp1 = new Employee1("KB",143);

        emp1.displayInfo();


    }
    
}
