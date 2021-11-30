public class Palette {
    private Vue view;

    public Palette() {
        // Create Model
        Modele model = new Modele();
        // Create Controleur
        Controleur controleur = new Controleur();
        // Create Vue
        view = new Vue(model, controleur);
        view.setVisible(true);
    }

    public static void main(String[] args) {
        new Palette();
    }
}