package GUI_2.Task_1;

public class ChoryNaDyspepsje extends Pacjent{
    private final String choroba = "dyspepsja";
    private final String leczenie = "wêgiel";

    ChoryNaDyspepsje(String nazwisko) { super(nazwisko); }

    @Override
    String choroba() { return this.choroba; }

    @Override
    String leczenie() { return this.leczenie; }
}