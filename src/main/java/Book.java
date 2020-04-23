public class Book extends Product {
    private String isbn;
    private int restockingFee = 5;
    public Book(String isbn, String productName, Integer productNumberInStock, Double productPrice) {
        super(productName, productNumberInStock, productPrice);
        this.isbn = isbn;
    }

    public Book(String productName, Integer productNumberInStock, Double productPrice, Vendor vendor, String isbn) {
        super(productName, productNumberInStock, productPrice, vendor);
        this.isbn = isbn;
    }

    public Book(String isbn, Integer productID, String productName, Integer productNumberInStock, Double productPrice) {
        super(productID, productName, productNumberInStock, productPrice);
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "productID= " + getProductID() +
                ", isbn= " + this.isbn +
                ", productName= '" + getProductName() + '\'' +
                ", productNumberInStock= " + getProductNumberInStock() +
                ", productPrice= " + getProductPrice() +
                ", inventoryValue+restockingFee= " + getInventoryValue() +
                '}';
    }

    @Override
    public Double getInventoryValue(){
        double value = (double) (int)(this.getProductPrice() * this.getProductNumberInStock() * (100+restockingFee))/100;
        return value;
    }
}
