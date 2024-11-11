package TD2016;

import java.util.Hashtable;

public class Exo2 {
    public static void main(String[] args) {
        // initialise deux objets de type Hashtable, dont les clés sont des entiers et les valeurs sont des chaines de caractères
        Hashtable<Integer, String>  table1 = new Hashtable<Integer, String>();

        table1.put(0, "wade");
        table1.put(1, "samba");
        table1.put(2, "momine");
        System.out.println(table1);

        Hashtable<Integer, String>  table2 = new Hashtable<Integer, String>();

        table2.put(3, "ouli");
        table2.put(4, "diadia");
        table2.put(5, "fanta");
        System.out.println(table2);

        // Fusionne les deux objets Hashtable
        table1.putAll(table2);

        // Affiche le résultat de la fusion
        System.out.println(table1);

    }
}
