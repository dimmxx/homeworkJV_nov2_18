package homework.homework18;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class GUIEngine extends JFrame {

    public final static int FRAME_WIDTH = 800;
    public final static int FRAME_HEIGHT = 350;

    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    private int xPos = screenSize.width / 2 - FRAME_WIDTH / 2;
    private int yPos = screenSize.height / 2 - FRAME_HEIGHT / 2;

    private static final Locale localeEN = new Locale("en", "EN");
    private static final Locale localeFR = new Locale("fr", "FR");
    private static final Locale localeES = new Locale("es", "ES");
    private static final Locale localeRU = new Locale("ru", "RU");

    private JButton buttonRU = new JButton("Русский");
    private JButton buttonSP = new JButton("Español");
    private JButton buttonEN = new JButton("English");
    private JButton buttonFR = new JButton("Français");

    private JButton buttonSave = new JButton();
    private JButton buttonLoad = new JButton();

    private JLabel label = new JLabel();
    private JLabel labelPhrase = new JLabel();

    JPanel panel = getPanel();

    private Image image;
    Pudge pudge = new Pudge(localeEN);
    ResourceBundle localData = null;

    public GUIEngine() throws IOException, ClassNotFoundException {
        super("Pudge International");
        setBounds(xPos, yPos, FRAME_WIDTH, FRAME_HEIGHT);
        add(panel);

        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(3);
        initListeners();
    }

    private void initListeners() {
        buttonEN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ifButtonENPressed();
            }
        });

        buttonRU.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                    ifButtonRUressed();

            }
        });

        buttonFR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ifButtonFRPressed();

            }
        });

        buttonSP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ifButtonSPPressed();
            }
        });

        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ifButtonSavePressed();
            }
        });

        buttonLoad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ifButtonLoadPressed();
            }
        });


    }

    private JPanel getPanel() throws IOException, ClassNotFoundException {
        JPanel panel = new JPanel(new FlowLayout());

        panel.setBackground(new Color(70, 80, 255));

        labelPhrase.setFont(new Font("Serif", Font.BOLD, 32));
        labelPhrase.setForeground(new Color(255,255,255));

        pudge = DataStreamEngine.loadState();
        localize(pudge);

        panel.add(buttonRU);
        panel.add(buttonEN);
        panel.add(buttonFR);
        panel.add(buttonSP);
        panel.add(buttonSave);
        panel.add(buttonLoad);
        panel.add(labelPhrase);

        panel.add(label);
        drawImageIcon();
        panel.revalidate();
        panel.repaint();

        return panel;
    }

    public void drawImageIcon() {

        try {
            image = ImageIO.read(new File(localData.getString("url")));
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        ImageIcon icon = new ImageIcon(image);
        label.setIcon(icon);
    }

    private void ifButtonRUressed() {
        localize(new Pudge(localeRU));
        pudge.setLocale(localeRU);
        drawImageIcon();
        panel.revalidate();
        panel.repaint();
    }

    private void ifButtonENPressed() {
        localize(new Pudge(localeEN));
        pudge.setLocale(localeEN);
        drawImageIcon();
        panel.revalidate();
        panel.repaint();

    }

    private void ifButtonFRPressed() {

        localize(new Pudge(localeFR));
        pudge.setLocale(localeFR);
        drawImageIcon();
        panel.revalidate();
        panel.repaint();
    }

    private void ifButtonSPPressed() {
        localize(new Pudge(localeES));
        pudge.setLocale(localeES);
        drawImageIcon();
        panel.revalidate();
        panel.repaint();
    }

    private void ifButtonSavePressed() {

        try {
            DataStreamEngine.saveState(pudge);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void ifButtonLoadPressed() {
        try {
            pudge = DataStreamEngine.loadState();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        localize(pudge);
        drawImageIcon();
        panel.revalidate();
        panel.repaint();
    }

    public void localize(Pudge pudge) {
        localData = ResourceBundle.getBundle("TextBundle", pudge.getLocale());
        buttonSave.setText(localData.getString("save"));
        buttonLoad.setText(localData.getString("load"));
        labelPhrase.setText(localData.getString("phrase"));

    }

}
