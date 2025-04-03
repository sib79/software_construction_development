interface Food { 
    int getNutrition();
}
class Sausage implements Food {
    public int getNutrition() {
        return 10;
     }
    public String getColor() 
    {
         return "Brown";
         }
    public String getExpiration() { 
        return "2025-12-31";
     }
}
class Cat {
    private int energy = 0;
    public void eat(Food food) {
        this.energy += food.getNutrition();
    }
}
public class Figure2Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Food sausage = new Sausage();
        cat.eat(sausage);
        System.out.println("Cat has eaten sausage.");
    }
}
