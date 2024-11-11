package TD2016;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("wade");
        list.add("dabkh");
        list.add("madji");
        list.add("hrs");

        // Affichage de la liste
        System.out.println("Affichage de ma collection:");
        ListIterator listIterateur = list.listIterator();
        while (listIterateur.hasNext()) {
            System.out.println(listIterateur.next());
        }

        // Recherche d'une chaîne
        System.out.print("Entrez une chaîne : ");
        Scanner clavier = new Scanner(System.in);
        String chaine = clavier.nextLine();
        boolean found = false;

        for (String element : list) {
            if (element.equals(chaine)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("La chaîne est dans la liste");
        } else {
            System.out.println("La chaîne n'est pas dans la liste");
        }
        clavier.close();
    }
}