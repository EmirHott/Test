package shop;

public enum ProductType {
    CLOTHING("clothing"),
    ACCESSORIES("accessories"),
    FOOTWEAR("footwear"),
    BEAUTY("beauty");

    private String type;

    ProductType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
