package homework.homework6;

public class DemoCart {

    public static void main(String[] args) {

        CartClass cart1 = new CartClass();

        ProductClass product1 = new ProductClass("Bread", 10);
        ProductClass product2 = new ProductClass("Milk", 15);
        ProductClass product3 = new ProductClass("Water", 2);

        cart1.putIntoCart(product1);
        cart1.putIntoCart((product2));
        cart1.putIntoCart((product3));
        cart1.putIntoCart((product3));
        cart1.putIntoCart(product1);
        cart1.putIntoCart((product2));
        cart1.putIntoCart((product3));
        cart1.putIntoCart((product3));
        cart1.putIntoCart((product3));
        cart1.putIntoCart((product3));

        cart1.printCart();
        cart1.putIntoCart((product3));

        cart1.removeFromCartAllItems("Bread");
        cart1.removeFromCartAllItems("Water");
        cart1.printCart();

        cart1.removeFromCartOneItem("Milk");
        cart1.printCart();

        cart1.removeFromCartAllItems("Bread");


    }


}
