package com.lab.sadba.wallpaper2.Model;

/**
 * Created by sadba on 15-Feb-18.
 */

public class Accueil {

    private String id_page_accueil;
    private String titre;
    private String description;
    private String voir_plus;
    private String description_plus;
    private String image;

    public Accueil() {
    }

    public Accueil(String id_page_accueil, String titre, String description, String voir_plus, String description_plus, String image) {
        this.id_page_accueil = id_page_accueil;
        this.titre = titre;
        this.description = description;
        this.voir_plus = voir_plus;
        this.description_plus = description_plus;
        this.image = image;
    }

    public String getId_page_accueil() {
        return id_page_accueil;
    }

    public void setId_page_accueil(String id_page_accueil) {
        this.id_page_accueil = id_page_accueil;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVoir_plus() {
        return voir_plus;
    }

    public void setVoir_plus(String voir_plus) {
        this.voir_plus = voir_plus;
    }

    public String getDescription_plus() {
        return description_plus;
    }

    public void setDescription_plus(String description_plus) {
        this.description_plus = description_plus;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
