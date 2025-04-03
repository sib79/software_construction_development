class Order {
    private LineItem[] lineItems;
    private TaxCalculator taxCalculator;

    public Order(LineItem[] lineItems, TaxCalculator taxCalculator) {
        this.lineItems = lineItems;
        this.taxCalculator = taxCalculator;
    }

    public double getTotal() {
        double total = 0;
        for (LineItem item : lineItems) total += item.getTotalPrice();
        return total + taxCalculator.calculateTax(total);
    }
}

class LineItem {
    private String itemName;
    private double price;
    private int quantity;

    public LineItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public double getTotalPrice() { 
        return price * quantity;
     }
    public String getItemName() {
         return itemName;
        
        }
}

class TaxCalculator {
    private double taxRate;
    public TaxCalculator(double taxRate) { this.taxRate = taxRate; }
    public double calculateTax(double amount) { return amount * taxRate; }
}

public class Figure1Main {
    public static void main(String[] args) {
        LineItem[] items = { new LineItem("Laptop", 1000, 1), 
        new LineItem("Mouse", 50, 2) };
        Order order = new Order(items, new TaxCalculator(0.1));
        System.out.println("Total Order Cost: " + order.getTotal());
    }
}