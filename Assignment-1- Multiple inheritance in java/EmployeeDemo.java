interface EmployeeInfo{
    void displayInfo();
}

interface EmployeeDuty{
    void work(); 
}

class Employee implements EmployeeDuty,EmployeeInfo{
    private String name;
    private int id;


    Employee(String name, int id){
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
        Employee emp1 = new Employee("KB",143);

        emp1.displayInfo();
        emp1.work();


    }
    
}
