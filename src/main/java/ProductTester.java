import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductTester {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Tass", 15, 2.15));
        products.add(new Product("Taldrik", 10, 3.10));
        products.add(new Product("Kahvel", 51, 1.70));
        products.add(new Product("Nuga", 41, 1.70));
        products.add(new Product("Lusikas", 65, 1.70));
        products.add(new Product( "Teelusikas", 5, 1.30));
        products.add(new Book("978-3-16-148410-0", "The Book", 13,10.85));

        for (Product product : products){
            System.out.println(product.toString());
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Want to add a product? y|n");
        if (input.next().equals("y")) {
            products.add(Input.inputProduct());
            for (Product product : products){
                System.out.println(product.toString());
            }
        }
    }
}
