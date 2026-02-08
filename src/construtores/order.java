package construtores;

import java.util.Date;

public class order {

    public Date date;
    private Products product;

    public order(Products product) {
        this.product = product;
        this.product.name = "tv";
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public order(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
