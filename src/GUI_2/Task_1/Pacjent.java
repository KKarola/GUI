package GUI_2.Task_1;

public class Pacjent {
    private String nazwisko;

    Pacjent() { }

    Pacjent(String name) {
        this.nazwisko = name;
    }

    String nazwisko() {
        return nazwisko;
    }

    String choroba() {
        return "Brak rozpoznania";
    }

    String leczenie() { return "Nie zalecane"; }
}
