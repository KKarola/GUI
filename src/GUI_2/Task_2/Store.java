package GUI_2.Task_2;

import java.util.ArrayList;

public class Store extends ArrayList<Flower>{
    Customer customer;

    Store(Customer customer) {this.customer = customer; }

    public void put(Flower flower){add(flower); }

    public void remove(Flower flower) {remove((Object) flower); }

    public double getValue() {
        double wallet = customer.getCash();
        for(Flower flower: new ArrayList<>(this)){
            if(flower.getPrice() < wallet && flower.getPrice() > 0) {
                wallet -= flower.getPrice();
            } else {
                customer.getShoppingCart().remove(flower);
            }
        }
        return wallet;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(((this instanceof ShoppingCart)? "Wózek" : "Pude³ko")
                + " w³aœciciel " + customer + " " );
        if(this.size() > 0) {
            for(Flower flower: this) {
                sb.append("\n" + flower);
            }
        } else {
            sb.append(" -- pusto");
        }
        return sb.toString();
    }

}
