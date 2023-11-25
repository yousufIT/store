
import java.io.Serializable;

//هذا الصف يخص كل صنف في البرنامج ويستعمل للمخزن
public class item implements Serializable {

    private int numberOfItem;
    private String nameOfItem;
    private int quantityOfItem;
    private double priceOfItem;
    private String sectionOfItem;
    private double allPrice;
    private java.util.Date date;

    public item(int numberOfItem, String nameOfItem, String sectionOfItem, int quantityOfItem, double priceOfItem) {
        this.nameOfItem = nameOfItem;
        this.sectionOfItem = sectionOfItem;
        this.quantityOfItem = quantityOfItem;
        this.priceOfItem = priceOfItem;
        this.numberOfItem = numberOfItem;
        date = new java.util.Date();
    }

    public int getNumberOfItem() {
        return numberOfItem;
    }

    public void setNumberOfItem(int numberOfItem) {
        this.numberOfItem = numberOfItem;
    }

    public int getQuantityOfItem() {
        return quantityOfItem;
    }

    public void setQuantityOfItem(int quantityOfItem) {
        this.quantityOfItem = quantityOfItem;
    }

    public double getPriceOfItem() {
        return priceOfItem;
    }

    public void setPriceOfItem(double priceOfItem) {
        this.priceOfItem = priceOfItem;
    }

    public String getNameOfItem() {
        return nameOfItem;
    }

    public void setNameOfItem(String nameOfItem) {
        this.nameOfItem = nameOfItem;
    }

    public String getSectionOfItem() {
        return sectionOfItem;
    }

    public double getAllPrice() {
        return quantityOfItem * priceOfItem;
    }

    @Override
    public String toString() {
        return "number Of Item:" + numberOfItem + "\tname OfI tem:" + nameOfItem + "\tquantity Of Item:" + quantityOfItem + "\nprice Of Item:" + priceOfItem + "\tsection Of Item:" + sectionOfItem + "\t total Price:" + getAllPrice() + "\ndate is:" + date + "}";
    }

}
