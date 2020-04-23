import java.util.Scanner;

public class Input {
    static Product newProduct;
    static Vendor newVendor;
    static boolean bookFlag = false;
    static String newISBN;

    public static Product inputProduct(){
        Scanner input = new Scanner(System.in);

            System.out.println("Is product a book? y|n");
            if (input.next().equals("y")) {
                bookFlag = true;
                System.out.println("Insert ISBN of book");
                newISBN = input.next();
            }
            System.out.println("Insert name of product");
            String newProductName = input.next();
            System.out.println("Insert number of product in stock");
            int newProductNumberInStock = input.nextInt();
            System.out.println("Insert price of product");
            double newProductPrice = input.nextDouble();

            System.out.println("Insert vendor of product? y|n");
            if (input.next().equals("y")) {
                newVendor = inputVendor();
                if (bookFlag){
                    newProduct = new Book(newProductName, newProductNumberInStock, newProductPrice, newVendor, newISBN);
                }
                else{
                    newProduct = new Product(newProductName, newProductNumberInStock, newProductPrice, newVendor);
                }
            }
            else {
                if (bookFlag){
                    newProduct = new Book(newISBN, newProductName, newProductNumberInStock, newProductPrice);
                }
                else{
                    newProduct = new Product(newProductName, newProductNumberInStock, newProductPrice);
                }
            }
        return newProduct;
    }

    public static Vendor inputVendor() {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert vendor company");
        String newVendorCompany = input.next();
        System.out.println("Insert vendor address");
        String newVendorAddress = input.next();
        System.out.println("Insert vendor representative");
        String newVendorRep = input.next();
        System.out.println("Insert vendor phone");
        String newVendorPhone = input.next();
        return new Vendor(newVendorCompany, newVendorAddress, newVendorRep, newVendorPhone);
    }
}

