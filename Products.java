
import java.util.LinkedHashSet;

public class Products {
    public static void main(String[] args) {

        // Create LinkedHashSet
        LinkedHashSet<String> products = new LinkedHashSet<>();

        // 1. Store products
        products.add("Laptop");
        products.add("Mobile");
        products.add("Headphones");
        products.add("Smart Watch");

        // 2. Add Laptop again
        products.add("Laptop");

        // 3. Display all products
        System.out.println("Recently Viewed Products:");
        System.out.println(products);

        // 4. Remove Headphones
        products.remove("Headphones");

        System.out.println("After removing Headphones:");
        System.out.println(products);

        // 5. Add Tablet
        products.add("Tablet");

        // 6. Check whether Mobile exists
        System.out.println("Does Mobile exist? "
                + products.contains("Mobile"));

        // 7. Display final product list
        System.out.println("Final Product List:");
        System.out.println(products);
    }
}
