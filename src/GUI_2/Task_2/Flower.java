package GUI_2.Task_2;

public abstract class Flower {
    private int amount;

    Flower(int amount) { this.amount = amount; }

    abstract String getFlowerName();
    abstract String getColor();

    public double getPrice() {return PriceList.getPrice(getFlowerName()) * amount; }

    @Override
    public String toString() {
        return getFlowerName() + ", kolor: " + getColor() + ", ilo��: " + amount + ", cena: " + PriceList.getPrice(getFlowerName());
    }
}
