package homework.homework16;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ShapeTable extends JPanel {


    public ShapeTable() {
        //super(new GridLayout(1,0));

        DbWorkerItea2 worker = new DbWorkerItea2();
        ArrayList<ShapeClass> list = new ArrayList<>();
        list = worker.getShapeAll();

        String[] columnNames = {"id",
                                "name",
                                "area",
                                "perimeter",
                                "user"};

        String[][] data = new String[list.size()][5];

        for(int i = 0; i < list.size(); i++){
            data[i][0] = String.valueOf(list.get(i).getId());
        }
        for(int i = 0; i < list.size(); i++){
            data[i][1] = list.get(i).getName();
        }
        for(int i = 0; i < list.size(); i++){
            data[i][2] = String.valueOf(list.get(i).getArea());
        }
        for(int i = 0; i < list.size(); i++){
            data[i][3] = String.valueOf(list.get(i).getPerimeter());
        }
        for(int i = 0; i < list.size(); i++){
            data[i][4] = list.get(i).getUser();
        }

        final JTable table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(700, 500));
        table.setFillsViewportHeight(true);



        //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(table);

        //Add the scroll pane to this panel.
        add(scrollPane);
    }





}





















