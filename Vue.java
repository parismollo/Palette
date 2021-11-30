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
        // Frame config
        this.setTitle(TITLE);
        this.setSize(WIDTH, HEIGHT);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Panel config
        panneauColore.setBackground(new Color(0, 255, 0));
        panneauColore.setLayout(new BorderLayout());
        this.getContentPane().add(panneauColore);
        // Label config
        etiqCouleur.setText("Vert");
        etiqCouleur.setHorizontalAlignment(JLabel.CENTER);
        // Panel content addition
        panneauColore.add(etiqCouleur, BorderLayout.CENTER);
        
    }

}
