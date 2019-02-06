package homework.homework16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GraphicsEn extends JFrame {

    public final static int FRAME_WIDTH = 700;
    public final static int FRAME_HEIGHT = 500;

    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    private int xPos = screenSize.width / 2 - FRAME_WIDTH / 2;
    private int yPos = screenSize.height / 2 - FRAME_HEIGHT / 2;


    private JButton buttonC = new JButton("Circle");
    private JButton buttonT = new JButton("Triangle");
    private JButton buttonS = new JButton("Square");
    private JButton buttonBack = new JButton("Back");
    private JButton buttonShow = new JButton("Show shapes");
    private JTextField field1 = new JTextField(10);
    //private JLabel labeldb = new JLabel();
    private JTextArea textArea = new JTextArea();


    JPanel panelShape = getPanelShape();

    public GraphicsEn() {
        super("F-Factory");
        setBounds(xPos, yPos, FRAME_WIDTH, FRAME_HEIGHT);

        add(panelShape);

        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(3);
        initListeners();

    }

    private void initListeners() {
        buttonC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ifButtonCPressed();
            }
        });

        buttonS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ifButtonSPressed();
            }
        });

        buttonT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ifButtonTPressed();
            }
        });

        buttonShow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ifButtonShowPressed();
            }
        });
    }

    private JPanel getPanelShape() {
        JPanel panel = new JPanel();

        panel.setBackground(new Color(70, 80, 255));

        panel.add(buttonC);
        panel.add(buttonS);
        panel.add(buttonT);
        panel.add(buttonShow);
        panel.add(field1);


        //labeldb.setSize(100, 100);

        panel.add(textArea);

        return panel;
    }

    private void ifButtonCPressed() {
        makeCircle(Integer.parseInt(field1.getText()));
    }


    private void ifButtonTPressed() {
        makeTriangle(Integer.parseInt(field1.getText()));
    }


    private void ifButtonSPressed() {
        makeSquare(Integer.parseInt(field1.getText()));
    }

    private void ifButtonShowPressed() {
        //DbWorkerItea2 dbworker = new DbWorkerItea2();

        //Create and set up the content pane.
        ShapeTable newContentPane = new ShapeTable();

        newContentPane.setOpaque(true); //content panes must be opaque
        setContentPane(newContentPane);
        pack();


        //textArea.setText(dbworker.getShapeAll().toString());




    }

    public Circle makeCircle(int side) {
        ShapeClass circle = new Circle(side);
        return (Circle) circle;
    }

    public Square makeSquare(int side) {
        ShapeClass square = new Square(side);
        return (Square) square;
    }

    public Triangle makeTriangle(int side) {
        ShapeClass triangle = new Triangle(side);
        return (Triangle) triangle;
    }


}











