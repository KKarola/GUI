package GUI_7.Task_1;

import javax.swing.*;

public class MyAbstractListModel extends AbstractListModel {
    @Override
    public int getSize() {
        return 131;
    }

    private String changeTemperature (int degC){
        return ((degC * 9 / 5) + 32) + " stopni F" ;
    }

    @Override
    public Object getElementAt(int index) {
        return (index - 70) + " stopni C = " + changeTemperature(index - 70);
    }
}