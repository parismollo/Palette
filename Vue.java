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
    JPanel slidersPannel = new JPanel();
    JPanel buttonsPannel = new JPanel();

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

        // JFrame config
        this.setTitle(TITLE);
        this.setSize(WIDTH, HEIGHT);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new GridLayout(0, 2));

        // JPanel config
        panneauColore.setBackground(new Color(0, 255, 0));
        panneauColore.setLayout(new BorderLayout());
        panneauChoix.setLayout(new BorderLayout());
        slidersPannel.setLayout(new GridLayout(3, 0));
        buttonsPannel.setLayout(new GridLayout(0, 3));

        // JFrame content addition
        this.getContentPane().add(panneauChoix);
        this.getContentPane().add(panneauColore);

        // JLabel config
        etiqCouleur.setText("Vert");
        etiqCouleur.setHorizontalAlignment(JLabel.CENTER);
        memoriser.setText("Mémoriser");
        rappeler.setText("Rappeller");
        complementaire.setText("Complémentaire");

        
        // JPanel content addition (colore)
        panneauColore.add(etiqCouleur, BorderLayout.CENTER);
        // JPanel content addition (slides)
        slidersPannel.add(rouge);
        slidersPannel.add(vert);
        slidersPannel.add(bleu);
        // JPanel content addition (buttons)
        buttonsPannel.add(memoriser);
        buttonsPannel.add(rappeler);
        buttonsPannel.add(complementaire);
        // JPanel content addition (choix)
        panneauChoix.add(slidersPannel, BorderLayout.CENTER);
        // panneauChoix.add(new JSeparator(), BorderLayout.CENTER);
        panneauChoix.add(buttonsPannel, BorderLayout.SOUTH);

        
        
    }

}
