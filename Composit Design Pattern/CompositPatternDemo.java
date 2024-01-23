public class CompositPatternDemo {
    public static void main(String[] args) {
        Employee ceo = new Employee("Khairul","Management",50000);
        Employee coo = new Employee("Selim","COO", 40000);
        Employee headSales = new Employee("Robert","Head Sales", 20000);

        Employee headMarketing = new Employee("Michel","Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);

        ceo.add(coo);
        coo.add(headMarketing);
        coo.add(headSales);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        for(Employee employee : coo.getSubordinates()){
            System.out.println(employee.getName() + "\n");
        }


    }
    
}
