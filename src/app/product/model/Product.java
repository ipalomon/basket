package app.product.model;

public final class Product {
    private int productId;
    private String name;
    private String description;
    private double price;
    private double productTotalAmount;

    public Product() {
    }

    public Product(int productId, String name, String description, double price, double productTotalAmount) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.productTotalAmount = productTotalAmount;
    }

    public double getProductTotalAmount() {
        return productTotalAmount;
    }

    public void setProductTotalAmount(double productTotalAmount) {
        this.productTotalAmount = productTotalAmount;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
