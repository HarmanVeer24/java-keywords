// Main class
public class ShoppingCart {
    public static void main(String[] args) {
        Product itemOne = new Product(101, "Laptop", 1200, 2);
        Product itemTwo = new Product(102, "Smartphone", 800, 5);

        itemOne.showProductDetails();
        itemTwo.showProductDetails();
        Product.modifyDiscount(15);
        System.out.println("New Discount Applied!");
    }
}

class Product {
    private static double globalDiscount = 10.0; // Static discount shared by all products
    private final int itemID; // Final variable
    private String itemName;
    private double itemPrice;
    private int itemQuantity;

    public Product(int itemID, String itemName, double itemPrice, int itemQuantity) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    public void showProductDetails() {
        if (this instanceof Product) { // Using instanceof
            System.out.println("Product ID: " + itemID);
            System.out.println("Name: " + itemName);
            System.out.println("Price: $" + itemPrice);
            System.out.println("Quantity: " + itemQuantity);
            System.out.println("Discount: " + globalDiscount + "%");
        }
    }

    public static void modifyDiscount(double newDiscount) {
        globalDiscount = newDiscount;
    }
}


//output
//Product ID: 101
//Name: Laptop
//Price: $1200.0
//Quantity: 2
//Discount: 10.0%
//Product ID: 102
//Name: Smartphone
//Price: $800.0
//Quantity: 5
//Discount: 10.0%
//New Discount Updated!