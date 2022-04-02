package shop;

public class Products {

    private Integer productId;
    private String productName;
    private ProductType productType;
    private double productPrice;
    private String productDescription;
    private ClothingSize productClothingSize;


    public Products() {
    }

    public Products(Integer productId, String productName, ProductType productType, double productPrice, String productDescription, ClothingSize productClothingSize) {
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
        this.productClothingSize = productClothingSize;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public ClothingSize getProductClothingSize() {
        return productClothingSize;
    }

    public void setProductClothingSize(ClothingSize productClothingSize) {
        this.productClothingSize = productClothingSize;
    }

    @Override
    public String toString() {
        return "Product:" +
                " productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productType=" + productType +
                ", productPrice=" + productPrice +
                ", productDescription='" + productDescription + '\'' +
                ", productClothingSize=" + productClothingSize ;
    }
}
