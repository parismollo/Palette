import javax.swing.*;
import java.awt.*;

public class Vue extends JFrame{
    // Constants
    static final String TITLE = "Palette";
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    // JComponents
    JPanel panneauColore = new JPanel();
    JLabel etiqCouleur = new JLabel();


    public Vue() {
        this.setTitle(TITLE);
        this.setSize(WIDTH, HEIGHT);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        panneauColore.setBackground(new Color(0, 255, 0));
        this.getContentPane().add(panneauColore);

        etiqCouleur.setText("Vert");
        panneauColore.add(etiqCouleur);
    }

}
