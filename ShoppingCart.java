class Product {
    // Static variable
    private static double discount = 10.0;

    // Instance variables
    private String productName;
    private final int productID;
    private double price;
    private int quantity;

    // Constructor
    public Product(String productName, int productID, double price, int quantity) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update the discount percentage
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Updated Discount: " + discount + "%");
    }

    // Method to display product details
    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product Name: " + productName);
            System.out.println("Product ID: " + productID);
            System.out.println("Price: Rs" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Product prod1 = new Product("Laptop", 201, 1200.0, 2);
        Product prod2 = new Product("Smartphone", 202, 800.0, 5);

        System.out.println("========Cart========");
        System.out.println("Product 1:");
        prod1.displayProductDetails();
        System.out.println("\nProduct 2:");
        prod2.displayProductDetails();

        System.out.println();
        Product.updateDiscount(15.0); // Update discount
        prod1.displayProductDetails();
    }
}
