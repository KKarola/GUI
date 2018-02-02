package GUI_2.Task_1;

public class ChoryNaNoge extends Pacjent{
    private final String choroba = "noga";
    private final String leczenie = "gips";

    ChoryNaNoge(String name) { super(name); }

    @Override
    String choroba() { return this.choroba; }

    @Override
    String leczenie() { return this.leczenie; }
}