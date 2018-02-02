package GUI_2.Task_2;

public class FloristsTest {
    // definicja metody sumowania wartosci kwiat�w o podanym kolorze
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
        pl.put("r�a", 10.0);
        pl.put("bez", 12.0);
        pl.put("piwonia", 8.0);

        Customer janek = new Customer("Janek", 200);

        janek.get(new Rose(5));
        janek.get(new Peony(5));
        janek.get(new Freesia(3));
        janek.get(new Lilac(3));

        // Zawarto�� w�zka sklepowego
        ShoppingCart wozekJanka = janek.getShoppingCart();
        System.out.println("Przed p�aceniem\n" + wozekJanka);

        // Zap�ata.
        janek.pay();

        // Usuni�cie z w�zka kwiat�w na kt�re nie ustalono jeszcze ceny
        // oraz tych na kt�re klient nie ma �rodk�w.
        System.out.println("Po zap�aceniu\n" + janek.getShoppingCart());

        // Portfel klienta
        System.out.println("Jankowi zosta�o : " + janek.getCash() + " z�");

        // Pakowanie do pude�ka
        Box pudelkoJanka = new Box(janek);
        janek.pack(pudelkoJanka);

        // Zawarto�� w�zka
        System.out.println("Po zapakowaniu do pude�ka\n" + janek.getShoppingCart());

        // Zawarto�� pude�ka
        System.out.println(pudelkoJanka);

        // Warto�� czerwonych kwiat�w w pude�ku
        System.out.println("Czerwone kwiaty w pude�ku Janka kosztowa�y: "
                + valueOf(pudelkoJanka, "czerwony"));

        // Kolejny klient
        Customer stefan = new Customer("Stefan", 60);

        stefan.get(new Lilac(3));
        stefan.get(new Rose(5));

        // W�zek
        System.out.println(stefan.getShoppingCart());

        // Zap�ata i pakowanie
        stefan.pay();
        Box pudelkoStefana = new Box(stefan);
        stefan.pack(pudelkoStefana);

        // Zakupy
        System.out.println(pudelkoStefana);
        // Portfel
        System.out.println("Stefanowi zosta�o : " + stefan.getCash() + " z�");
    }
}
