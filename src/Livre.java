import java.util.Scanner;

/**
 * Created by DioAn1730700 on 2018-03-26.
 */
public class Livre implements Comparable<Livre>{

    private String isbn;
    private String titre;
    private String sousTitre;
    private String auteur;
    private String maisonEdition;
    private int anneePub;
    private int position;

    public Livre(String isbn, String titre, String sousTritre, String auteur, String maisonEdition, int anneePub, int position) {
        this.isbn = isbn;
        this.titre = titre;
        this.sousTitre = sousTritre;
        this.auteur = auteur;
        this.maisonEdition = maisonEdition;
        this.anneePub = anneePub;
        this.position = position;
    }
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getSousTitre() {
        return sousTitre;
    }

    public void setSousTitre(String sousTitre) {
        this.sousTitre = sousTitre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getMaisonEdition() {
        return maisonEdition;
    }

    public void setMaisonEdition(String maisonEdition) {
        this.maisonEdition = maisonEdition;
    }

    public int getAnneePub() {
        return anneePub;
    }

    public void setAnneePub(int anneePub) {
        this.anneePub = anneePub;
    }

    @Override
    public int compareTo(Livre o) {
        return anneePub - o.anneePub;
    }

    public void afficher(){
        System.out.println("Livre : " + this.position);
        System.out.println("ISBN : " + this.isbn);
        System.out.println("Titre : " + this.titre);
        System.out.println("Sous-titre : " + this.sousTitre);
        System.out.println("Auteur : " + this.auteur);
        System.out.println("Maison d'édition : " + this.maisonEdition);
        System.out.println("Année de publication : " + this.anneePub);
        System.out.println();
    }
}
