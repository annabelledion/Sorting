import java.util.Comparator;

/**
 * Created by DioAn1730700 on 2018-03-26.
 */
public class Classeur implements Comparator<Livre> {

    @Override
    public int compare(Livre o1, Livre o2) {

        int maison = o1.getMaisonEdition().compareTo(o2.getMaisonEdition());
        if (maison == 0){
            int auteur =  o1.getAuteur().compareTo(o2.getAuteur());
           if (auteur == 0){
                int titre = o1.getTitre().compareTo(o2.getTitre());
                if (titre ==0){
                  int annee =  o1.getAnneePub() - o2.getAnneePub();
                    return annee;
                }
               return titre;
            }
            return auteur;
        }
        else return maison;
    }
}
