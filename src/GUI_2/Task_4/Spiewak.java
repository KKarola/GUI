package GUI_2.Task_4;

public abstract class Spiewak {
    private String nazwisko;
    private static int numb = 1;
    private int number;

    Spiewak(String nazwisko) {
        this.nazwisko = nazwisko;
        number = numb++;
    }

    abstract String spiewaj();

    @Override
    public String toString() { return "(" + number + ") " + nazwisko + ": " + spiewaj(); }

    public static Spiewak najglosniej(Spiewak[] spiewak) {
        Spiewak winner = null;
        int win = 0;

        for(Spiewak s: spiewak) {
            int upper = 0;
            for (int i = 0; i < s.spiewaj().length(); i++) {
                if(s.spiewaj().charAt(i) >= 'A' && s.spiewaj().charAt(i) <= 'Z')
                    upper++;
            }
            if(upper > win) {
                win = upper;
                winner = s;
            }
        }
        return winner;
    }
}
