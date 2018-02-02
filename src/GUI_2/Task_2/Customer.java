package GUI_2.Task_2;

public class Customer {
    private String customerName;
    private double wallet;
    private ShoppingCart shoppingCart;
    private Box box;

    Customer(String customerName, double wallet) {
        this.customerName = customerName;
        this.wallet = wallet;
        shoppingCart = new ShoppingCart(this);
        box = new Box(this);
    }

    public void get(Flower flower){ shoppingCart.add(flower); }

    public ShoppingCart getShoppingCart() { return this.shoppingCart; }

    public void pay() {wallet = shoppingCart.getValue(); }

    public double getCash() {return wallet; }

    public void pack(Box box) {
        for(Flower flower: shoppingCart)
            box.put(flower);
        shoppingCart.clear();
    }

    @Override
    public String toString() {
        return customerName;
    }

}
