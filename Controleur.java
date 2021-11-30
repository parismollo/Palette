import java.awt.Color;

public class Controleur {
    Modele model;
    Vue vue;

    public void sliderMoved() {
        model.color = new Color(vue.rouge.getValue(), vue.vert.getValue(), vue.bleu.getValue());
        vue.miseAJour();
    }

    public void memoriserPressed() {
        model.memoire = new Color(model.color.getRGB());
    }
    public void rappelerPressed() {

        vue.rouge.setValue(model.memoire.getRed());
        vue.vert.setValue(model.memoire.getGreen());
        vue.bleu.setValue(model.memoire.getBlue());

        model.color = new Color(model.memoire.getRGB());    
        vue.miseAJour();
    }

    public void setModel(Modele model) {
        this.model = model;
    }
    public void setVue(Vue vue) {
        this.vue = vue;
    }
}
