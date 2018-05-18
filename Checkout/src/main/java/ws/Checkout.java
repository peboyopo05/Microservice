package ws;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Checkout {

    @Id
    @GeneratedValue

    private int id;
    private int shoppingCartId;
    private int total;

    private Date checkoutDate;
    private Date dateFormat;

    //TODO: 1 add getters and setters for the fields (5 marks)

    public Checkout() {}

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;

    }

    public void setShoppingCartId(int shoppingCartId) {
        this.shoppingCartId = shoppingCartId;
    }

    public int getShoppingCartId() {
        return shoppingCartId;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate ;
    }

    public Date getCheckoutDate() {
        return checkoutDate;
    }

    public void setDateFormat(Date dateFormat) {
        DateFormat DateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        this.dateFormat = new Date() ;
    }

    public Date getDateFormat() {
        return dateFormat;
    }


    @Override
    public String toString() {
        return String.format("Checkout [id=%s, shoppingCartId=$s, total=$s, checkoutDate%s,dateFormat]" ,id, shoppingCartId,total,checkoutDate,dateFormat);
    }
}
