
import java.io.Serializable;

//(item) هذا الصف يرث الصف
//اضافة الى حقلي اسم ورقم العميل وهذا الصف يخص كل فاتورة في البرنامج
public class Bill extends item implements Serializable {

    private int numberOfCustomer;
    private String nameOfCustomer;

    public Bill(int numberOfCustomer, String nameOfCustomer, int numberOfItem, String nameOfItem, String sectionOfItem, int quantityOfItem, double priceOfItem) {
        super(numberOfItem, nameOfItem, sectionOfItem, quantityOfItem, priceOfItem);
        this.numberOfCustomer = numberOfCustomer;
        this.nameOfCustomer = nameOfCustomer;
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public void setNumberOfCustomer(int numberOfCustomer) {
        this.numberOfCustomer = numberOfCustomer;
    }

    public String getNameOfCustomer() {
        return nameOfCustomer;
    }

    public void setNameOfCustomer(String nameOfCustomer) {
        this.nameOfCustomer = nameOfCustomer;
    }

    @Override
    public String toString() {
        return ("{ID Of Customer:" + numberOfCustomer + "\tname Of Customer:" + nameOfCustomer + "\t" + super.toString());
    }

}
