package GUI_2.Task_2;

public class Freesia extends Flower{
    private final String flowerName = "frezja";
    private final String color = "zolty";

    Freesia(int amount) {super(amount);}

    @Override
    public String getFlowerName() {return flowerName;}

    @Override
    public String getColor() {return color;}
}