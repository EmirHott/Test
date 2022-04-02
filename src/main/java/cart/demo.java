package cart;


import shop.Products;



public class demo {
    public static void main(String[] args) {
        Products shirt = new Products() {};
        ShoppingCartProduct scp = new ShoppingCartProduct();
        scp.setCartProducts(shirt);
        scp.setCartProductsQuantity(7);




    }
}
