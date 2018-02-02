package GUI_2.Task_2;

public class Lilac extends Flower{
    private final String flowerName = "bez";
    private final String color = "bialy";

    Lilac(int amount) {super(amount);}

    @Override
    public String getFlowerName() {return flowerName;}

    @Override
    public String getColor() {return color;}
}
