package cart;

import shop.Products;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartProduct {
    final List<ShoppingCartProduct> shoppingCartProducts = new ArrayList<>();
    private Products cartProducts;
    private int cartProductsQuantity;


    public ShoppingCartProduct() {

    }

    public ShoppingCartProduct(Products cartProducts, int quantity) {
        this.cartProducts = cartProducts;
        this.cartProductsQuantity = quantity;
    }

    public Products getCartProducts() {
        return cartProducts;
    }

    public void setCartProducts(Products cartProducts) {
        this.cartProducts = cartProducts;
    }

    public int getCartProductsQuantity() {
        return cartProductsQuantity;
    }

    public void setCartProductsQuantity(int cartProductsQuantity) {
        this.cartProductsQuantity = cartProductsQuantity;
    }

    public double getTotalPrice() {
        double totalPrice = cartProducts.getProductPrice() * getCartProductsQuantity();
        return totalPrice;
    }

    @Override
    public String toString() {
        return "ShoppingCartProduct:" +
                " cartProducts=" + cartProducts +
                ", quantity=" + cartProductsQuantity;
    }

    private void addProductToCart(Products cartProducts, int cartProductsQuantity) {



        for (ShoppingCartProduct inCartProducts : shoppingCartProducts) {
            if (inCartProducts.getCartProducts().getProductId() == cartProducts.getProductId()) {
                inCartProducts.setCartProductsQuantity(inCartProducts.getCartProductsQuantity() + cartProductsQuantity);
                return;
            }
        }
        ShoppingCartProduct inCartProducts = new ShoppingCartProduct(cartProducts,cartProductsQuantity);
        shoppingCartProducts.add(inCartProducts);
    }
   // private void removeProductFromCart (Products cartProducts, int cartProductsQuantity){
   //     for (ShoppingCartProduct shoppingCartProduct : shoppingCartProducts){
   //         if(shoppingCartProduct.getCartProducts().getProductId() == cartProducts.getProductId()){
    //            shoppingCartProduct.setCartProductsQuantity(shoppingCartProduct.getCartProductsQuantity() - cartProductsQuantity);
    //            return;
    //        }
    //    }
    //}

}














