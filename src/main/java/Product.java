import java.util.ArrayList;
import java.util.List;

public class Product {
    private Integer productID;
    private String productName;
    private Integer productNumberInStock;
    private Double productPrice;
    private Vendor vendor;

    private static Integer counter = 0;
    private static List<Product> products = new ArrayList<>();

    public Product(String productName, Integer productNumberInStock, Double productPrice) {
        this.productID = ++counter;
        this.productName = productName;
        this.productNumberInStock = productNumberInStock;
        this.productPrice = productPrice;
        if (!products.contains(this)) {
            products.add(this);
        }
    }
    public Product(String productName, Integer productNumberInStock, Double productPrice, Vendor vendor) {
        this.productID = ++counter;
        this.productName = productName;
        this.productNumberInStock = productNumberInStock;
        this.productPrice = productPrice;
        this.vendor = vendor;
        if (!products.contains(this)) {
            products.add(this);
        }
    }

    public Product(Integer productID, String productName, Integer productNumberInStock, Double productPrice) {
        this.productID = productID;
        this.productName = productName;
        this.productNumberInStock = productNumberInStock;
        this.productPrice = productPrice;
        if (!products.contains(this)) {
            products.add(this);
        }

    }

    @Override
    public String toString() {
        return "Product{" +
                "productID= " + productID +
                ", productName= '" + productName + '\'' +
                ", productNumberInStock= " + productNumberInStock +
                ", productPrice= " + productPrice +
                ", inventoryValue= " + getInventoryValue() +
                ", vendor= " + getVendor() +
                '}';
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductNumberInStock() {
        return productNumberInStock;
    }

    public void setProductNumberInStock(Integer productNumberInStock) {
        this.productNumberInStock = productNumberInStock;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public static List<Product> getProducts() {
        return products;
    }

    public static void setProducts(Product product){
        products.add(product);
    }

    public Double getInventoryValue(){
        return this.productPrice * this.productNumberInStock;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }
}
