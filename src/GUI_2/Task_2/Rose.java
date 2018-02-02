package GUI_2.Task_2;

public class Rose extends Flower{
    private final String flowerName = "ró¿a";
    private final String color = "czerwony";

    Rose(int amount) {super(amount);}

    @Override
    public String getFlowerName() {return flowerName;}

    @Override
    public String getColor() {return color;}
}
