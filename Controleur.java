import java.awt.Color;

public class Controleur {
    Modele model;
    Vue vue;

    public void sliderMoved() {
        model.color = new Color(vue.rouge.getValue(), vue.vert.getValue(), vue.bleu.getValue());
        vue.miseAJour();
    }

    public void setModel(Modele model) {
        this.model = model;
    }
    public void setVue(Vue vue) {
        this.vue = vue;
    }
}
