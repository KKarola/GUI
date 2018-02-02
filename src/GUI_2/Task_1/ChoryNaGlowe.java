package GUI_2.Task_1;

public class ChoryNaGlowe extends Pacjent{
    private final String choroba = "glowa";
    private final String leczenie = "aspiryna";

    ChoryNaGlowe(String nazwisko) { super(nazwisko); }

    @Override
    String choroba() { return this.choroba; }

    @Override
    String leczenie() { return this.leczenie; }
}
