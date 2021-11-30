import javax.swing.*;
import java.awt.*;

public class Vue extends JFrame{
    static final String TITLE = "Palette";
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    public Vue() {
        super.setTitle(TITLE);
        super.setSize(WIDTH, HEIGHT);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
