package homework.homework6;

public class CartClass {

    private ProductClass[] cart = new ProductClass[10];
    private double sum = 0;

    public void putIntoCart(ProductClass item) {
        for(int i = 0; i < cart.length; i++) {
            if (cart[i] == null) {
                cart[i] = item;
                break;
            }else if (i == cart.length - 1 & cart[i] != null){
                System.out.println("Cannot add item. The cart is full.");
            }
        }
    }

    public void printCart(){
        int counter = 0;
        sum = 0;
        System.out.println("\nShopping cart:");
        System.out.print("----------------------------------------------------------");
        for(int i = 0; i < cart.length; i++){
            if(cart[i] != null){
                sum += cart[i].getPrice();
                counter++;
                System.out.printf("\n%1$s %2$3d %3$s %4$-30s %5$s %6$15.2f %7$s", "|", counter, "|", cart[i].getNameGood(),
                        "|", cart[i].getPrice(), "|");
                System.out.print("\n----------------------------------------------------------");
            }
        }
        if (sum == 0) System.out.println("The cart is empty");
        System.out.printf("\n%1$s %2$36s %3$s %4$15.2f %5$s", "|", "Total:", "|", sum, "|");
        System.out.print("\n----------------------------------------------------------");
        System.out.println("\n" + counter + "/" + cart.length + " (" + (cart.length - counter) + " free cells left)");
        System.out.println();

    }

    public void removeFromCartAllItems(String name){
        for (int i = 0; i < cart.length; i++){
            if(cart[i] != null && cart[i].getNameGood().equals(name)){
                cart[i] = null;
            }
        }
    }

    public void removeFromCartOneItem(String name){
        for (int i = 0; i < cart.length; i++){
            if(cart[i] != null && cart[i].getNameGood().equals(name)){
                cart[i] = null;
                break;
            }
        }
    }
}
