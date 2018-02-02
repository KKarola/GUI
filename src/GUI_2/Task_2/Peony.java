package GUI_2.Task_2;

public class Peony extends Flower{
    private final String flowerName = "piwonia";
    private final String color = "czerwony";

    Peony(int amount) {super(amount);}

    @Override
    public String getFlowerName() {return flowerName;}

    @Override
    public String getColor() {return color;}
}