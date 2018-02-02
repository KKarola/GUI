package GUI_2.Task_2;

import java.util.HashMap;

public class PriceList {
    private static PriceList INSTANCE;
    private static HashMap<String, Double> priceList = new HashMap<>();

    private PriceList() { }

    public static PriceList getInstance() {
        if(INSTANCE == null)
            INSTANCE = new PriceList();
        return INSTANCE;
    }

    public void put(String flowerName, double price) { priceList.put(flowerName, price); }

    public static double getPrice(String flowerName) {return (priceList.containsKey(flowerName))? priceList.get(flowerName): -1;}
}
