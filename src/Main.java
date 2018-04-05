import java.util.*;

/**
 * Created by DioAn1730700 on 2018-03-26.
 */
public class Main {


    public static void algo(ArrayList<Livre> liste) {
        Livre livre = null;
        int index;
        for (int i = 0; i < liste.size(); i++) {
            livre = liste.get(i);
            index = i;
            for (int j = i; j < liste.size(); j++) {
                if (liste.get(j).compareTo(liste.get(index)) < 0) {
                    livre = liste.get(j);
                    index = j;
                }
            }
            liste.remove(index);
            liste.add(i, livre);

        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Livre> liste1 = new ArrayList<>();
        TreeSet<Livre> liste2 = new TreeSet<>(new Classeur());
        TreeSet<Livre> liste3 = new TreeSet<>();

        liste1.add(new Livre("90765", "Harry Potter", "à l'école des sorciers", "J. K. Rowling",
                "Bloomsbury", 1997, 1));
        liste1.add(new Livre("90578", "Harry Potter", "et la chambre des secrets", "J. K. Rowling",
                "Bloomsbury", 1998, 2));
        liste1.add(new Livre("56743", "Da Vinci Code", "", "Dan Brown", "Doubleday",
                2003, 3));
        liste1.add(new Livre("23967", "Nous étions invincibles", "", "Denis Morisset",
                "Les Éditions JCL", 2008, 4));
        liste1.add(new Livre("76538", "L'Alchimiste", "", " Paulo Coelho", "Planeta"
                , 1988, 5));
        liste1.add(new Livre("76542", "Le Seigneur des anneaux", "La Communauté de l'anneau", "Peter Jackson",
                "Christian Bourgeois", 1954, 6));
        liste1.add(new Livre("39863", "Le Secret", "", "Rhonda Byrne", "Rhonda Byrne", 2006,
                7));
        liste1.add(new Livre("89765", "Le Secret", "Mensonges", "Rhonda Byrne", "YY", 1954,
                8));
        liste1.add(new Livre("47690", "Les Fleurs du mal", "receuil de poème", "Dan Brown", "Doubleday",
                2003, 9));
        liste1.add(new Livre("90765", "Harry Potter", "à l'école des sorciers", "J. K. Rowling",
                "Bloomsbury", 1997, 10));

        liste2.add(new Livre("90765", "Harry Potter", "à l'école des sorciers", "J. K. Rowling",
                "Bloomsbury", 1997, 1));
        liste2.add(new Livre("90578", "Harry Potter", "et la chambre des secrets", "J. K. Rowling",
                "Bloomsbury", 1998, 2));
        liste2.add(new Livre("56743", "Da Vinci Code", "", "Dan Brown", "Doubleday",
                2003, 3));
        liste2.add(new Livre("23967", "Nous étions invincibles", "", "Denis Morisset",
                "Les Éditions JCL", 2008, 4));
        liste2.add(new Livre("76538", "L'Alchimiste", "", " Paulo Coelho", "Planeta"
                , 1988, 5));
        liste2.add(new Livre("76542", "Le Seigneur des anneaux", "La Communauté de l'anneau", "Peter Jackson",
                "Christian Bourgeois", 1954, 6));
        liste2.add(new Livre("39863", "Le Secret", "", "Rhonda Byrne", "Rhonda Byrne", 2006,
                7));
        liste2.add(new Livre("89765", "Le Secret", "Mensonges", "Rhonda Byrne", "YY", 1954,
                8));
        liste2.add(new Livre("47690", "Les Fleurs du mal", "receuil de poème", "Dan Brown", "Doubleday",
                2003, 9));
        liste2.add(new Livre("90765", "Harry Potter", "à l'école des sorciers", "J. K. Rowling",
                "Bloomsbury", 1997, 10));

        liste3.add(new Livre("90765", "Harry Potter", "à l'école des sorciers", "J. K. Rowling",
                "Bloomsbury", 1997, 1));
        liste3.add(new Livre("90578", "Harry Potter", "et la chambre des secrets", "J. K. Rowling",
                "Bloomsbury", 1998, 2));
        liste3.add(new Livre("56743", "Da Vinci Code", "", "Dan Brown", "Doubleday",
                2003, 3));
        liste3.add(new Livre("23967", "Nous étions invincibles", "", "Denis Morisset",
                "Les Éditions JCL", 2008, 4));
        liste3.add(new Livre("76538", "L'Alchimiste", "", " Paulo Coelho", "Planeta"
                , 1988, 5));
        liste3.add(new Livre("76542", "Le Seigneur des anneaux", "La Communauté de l'anneau", "Peter Jackson",
                "Christian Bourgeois", 1954, 6));
        liste3.add(new Livre("39863", "Le Secret", "", "Rhonda Byrne", "Rhonda Byrne", 2006,
                7));
        liste3.add(new Livre("89765", "Le Secret", "Mensonges", "Rhonda Byrne", "YY", 1954,
                8));
        liste3.add(new Livre("47690", "Les Fleurs du mal", "receuil de poème", "Dan Brown", "Doubleday",
                2003, 9));
        liste3.add(new Livre("90765", "Harry Potter", "à l'école des sorciers", "J. K. Rowling",
                "Bloomsbury", 1997, 10));

        Collections.sort(liste1);
        System.out.println("**COMPARABLE**");
        for (Livre livre : liste1){
            livre.afficher();
        }

        Collections.sort(liste1, new Classeur());
        System.out.println("**COMPARATOR**");
        for (Livre livre2 : liste1){
            livre2.afficher();
        }

        System.out.println("**TREESET ANNÉE**");
        for (Livre livre3 : liste3){
            livre3.afficher();
        }

        System.out.println("**TREESET COMPARATOR**");
        for (Livre livre4 : liste2){
            livre4.afficher();
        }

        System.out.println("**ALGORITHME**");
        algo(liste1);
        for (Livre livre4 : liste1){
            livre4.afficher();
        }

    }

}