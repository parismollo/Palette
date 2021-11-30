import javax.swing.*;
import java.awt.*;

public class Vue extends JFrame{

    // Constants
    static final String TITLE = "Palette";
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    static final int MAX_VALUE = 100;
    static final int MIN_VALUE = 0;

    // JPanels
    JPanel panneauColore = new JPanel();
    JPanel panneauChoix = new JPanel();

    // JLabels
    JLabel etiqCouleur = new JLabel();

    // JButtons
    JButton memoriser = new JButton();
    JButton rappeler = new JButton();
    JButton complementaire = new JButton();

    // JSliders
    JSlider rouge = new JSlider(JSlider.HORIZONTAL, MIN_VALUE,  MAX_VALUE, MIN_VALUE);
    JSlider vert = new JSlider(JSlider.HORIZONTAL, MIN_VALUE,  MAX_VALUE, MIN_VALUE);
    JSlider bleu = new JSlider(JSlider.HORIZONTAL, MIN_VALUE,  MAX_VALUE, MIN_VALUE);
    

    public Vue() {
        // Frame config
        this.setTitle(TITLE);
        this.setSize(WIDTH, HEIGHT);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new GridLayout(0, 2));

        // Panel config
        panneauColore.setBackground(new Color(0, 255, 0));
        panneauColore.setLayout(new BorderLayout());
        panneauChoix.setLayout(new GridLayout(3, 0));

        // Frame content addition
        this.getContentPane().add(panneauChoix);
        this.getContentPane().add(panneauColore);

        // Label config
        etiqCouleur.setText("Vert");
        etiqCouleur.setHorizontalAlignment(JLabel.CENTER);
        
        // Panel content addition (colore)
        panneauColore.add(etiqCouleur, BorderLayout.CENTER);

        // Panel content addition (choix)
        panneauChoix.add(rouge);
        panneauChoix.add(vert);
        panneauChoix.add(bleu);
        
        
    }

}
