
interface Employee {
    void doWork();
}

class Designer implements Employee {
    public void doWork() { 
        System.out.println("Designing UI");
     }
}

class Programmer implements Employee {
    public void doWork() {
         System.out.println("Writing Code");
         }
}

class Tester implements Employee {
    public void doWork() {
         System.out.println("Testing Software");
         }
}

abstract class Company {
    abstract Employee[] getEmployees();

    public void createSoftware() {
        for (Employee e : getEmployees()) e.doWork();
    }
}

class GameDevCompany extends Company {
    public Employee[] getEmployees() { 
        return new Employee[]{ new Designer(), new Programmer() };
     }
}

class OutsourcingCompany extends Company {
    public Employee[] getEmployees() {
         return new Employee[]{ new Programmer(), new Tester() };
         }
}

public class Figure3Main {
    public static void main(String[] args) {
        Company gameDev = new GameDevCompany();
        gameDev.createSoftware();
        
        Company outsourcing = new OutsourcingCompany();
        outsourcing.createSoftware();
    }
}

