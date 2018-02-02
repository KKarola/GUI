package GUI_2.Task_2;

public class FloristsTest {
    // definicja metody sumowania wartosci kwiatów o podanym kolorze
    static int valueOf(Box box, String color) {
        int sum = 0;
        for(Flower flower: box) {
            if(flower.getColor().equals(color))
                sum += (int) flower.getPrice();
        }
        return sum;
    }

    public static void main(String[] args) {
        // ustalenie cennika
        PriceList pl = PriceList.getInstance();
        pl.put("ró¿a", 10.0);
        pl.put("bez", 12.0);
        pl.put("piwonia", 8.0);

        Customer janek = new Customer("Janek", 200);

        janek.get(new Rose(5));
        janek.get(new Peony(5));
        janek.get(new Freesia(3));
        janek.get(new Lilac(3));

        // Zawartoœæ wózka sklepowego
        ShoppingCart wozekJanka = janek.getShoppingCart();
        System.out.println("Przed p³aceniem\n" + wozekJanka);

        // Zap³ata.
        janek.pay();

        // Usuniêcie z wózka kwiatów na które nie ustalono jeszcze ceny
        // oraz tych na które klient nie ma œrodków.
        System.out.println("Po zap³aceniu\n" + janek.getShoppingCart());

        // Portfel klienta
        System.out.println("Jankowi zosta³o : " + janek.getCash() + " z³");

        // Pakowanie do pude³ka
        Box pudelkoJanka = new Box(janek);
        janek.pack(pudelkoJanka);

        // Zawartoœæ wózka
        System.out.println("Po zapakowaniu do pude³ka\n" + janek.getShoppingCart());

        // Zawartoœæ pude³ka
        System.out.println(pudelkoJanka);

        // Wartoœæ czerwonych kwiatów w pude³ku
        System.out.println("Czerwone kwiaty w pude³ku Janka kosztowa³y: "
                + valueOf(pudelkoJanka, "czerwony"));

        // Kolejny klient
        Customer stefan = new Customer("Stefan", 60);

        stefan.get(new Lilac(3));
        stefan.get(new Rose(5));

        // Wózek
        System.out.println(stefan.getShoppingCart());

        // Zap³ata i pakowanie
        stefan.pay();
        Box pudelkoStefana = new Box(stefan);
        stefan.pack(pudelkoStefana);

        // Zakupy
        System.out.println(pudelkoStefana);
        // Portfel
        System.out.println("Stefanowi zosta³o : " + stefan.getCash() + " z³");
    }
}
