public class Palette {
    private Vue vue;

    public Palette() {
        
        // Creation model
        Modele model = new Modele();
        // Creation vue
        vue = new Vue();
        // Creation controleur
        Controleur controleur = new Controleur();

        // Set relation MVC
        controleur.setModel(model);
        controleur.setVue(vue);
        vue.setControleur(controleur);
        vue.setModel(model);
        
        // Set visibilite vue
        vue.setVisible(true);
    }

    public static void main(String[] args) {
        new Palette();
    }
}