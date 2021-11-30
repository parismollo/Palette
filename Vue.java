import javax.swing.*;
import java.awt.*;

public class Vue extends JFrame{
    static final String TITLE = "Palette";
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    JPanel panneauColore = new JPanel();

    public Vue() {
        this.setTitle(TITLE);
        this.setSize(WIDTH, HEIGHT);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        panneauColore.setBackground(new Color(0, 255, 0));
        this.getContentPane().add(panneauColore);
    }

}
