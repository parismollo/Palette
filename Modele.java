import java.awt.*;
public class Modele {
    Color color;
    Color memoire;

    public Modele() {
        color = new Color(0, 0, 0);
        memoire = new Color(0, 0, 0);
    }

    public Color getColor() {
        return this.color;
    }
    public Color getMemoire() {
        return this.memoire;
    }
}
