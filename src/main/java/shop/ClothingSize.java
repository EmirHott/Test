package shop;

public enum ClothingSize {

    SMALL("S"),
    MEDIUM("M"),
    LARGE("L");


    private String size;

    ClothingSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
