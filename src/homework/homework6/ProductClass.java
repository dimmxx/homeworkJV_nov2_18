package homework.homework6;

public class ProductClass {

    private String nameGood;
    private  double price;

    public ProductClass(String nameGood, int price){
        this.nameGood = nameGood;
        this.price = price;
    }

    public String getNameGood() {
        return nameGood;
    }

    public double getPrice() {
        return price;
    }

    public void setNameGood(String nameGood) {
        this.nameGood = nameGood;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
