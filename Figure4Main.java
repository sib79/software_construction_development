interface Engine {
    void move();
}
class CombustionEngine implements Engine {
    public void move() {
         System.out.println("Move with fuel");
         }
}
class ElectricEngine implements Engine {
    public void move() {
         System.out.println("Move with electricity");
         }
}
interface Driver {
    void navigate();
}
class Robot implements Driver {
    public void navigate() {
         System.out.println("Navigating autonomously");
         }
}
class Human implements Driver {
    public void navigate() {
         System.out.println("Driving manually");
         }
}
class Transport {
    private Engine engine;
    private Driver driver;
    public Transport(Engine engine, Driver driver) {
        this.engine = engine;
        this.driver = driver;
    }
    public void deliver(String destination, String cargo) {
        driver.navigate();
        engine.move();
        System.out.println("Delivering " + cargo + " to " + destination);
    }
}
public class Figure4Main {
    public static void main(String[] args) {
        Transport truck = new Transport(new CombustionEngine(), new Human());
        truck.deliver("Warehouse", "Goods");
    }
}
