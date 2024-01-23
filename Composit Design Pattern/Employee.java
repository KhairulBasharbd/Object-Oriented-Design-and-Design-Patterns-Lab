import java.util.ArrayList;
import java.util.List;

public class Employee {
    String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates = new ArrayList<>();

    Employee(String name, String dept, int salary){
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public void add(Employee employee){
        subordinates.add(employee);
    }

    public void remove(Employee employee){
        subordinates.remove(employee);
    }
    public List<Employee> getSubordinates(){
        return subordinates;
    }
    public String getName(){
        return name;
    }

    
}
