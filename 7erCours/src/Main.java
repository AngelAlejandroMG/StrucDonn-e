import com.sun.source.tree.Tree;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //FILE
        ArrayDeque<String> file = new ArrayDeque<>();
        file.add("Doc1");
        file.add("Doc2");
        file.add("Doc3");

        System.out.println("Déqueue : " + file.poll());


        System.out.println();
        System.out.println();

        //VECTOR
        Vector<String> vecteur = new Vector<>();
        vecteur.add("Alice");
        vecteur.add("Bob");
        vecteur.add("Charlie");

        System.out.println("Élément à l’index 1 : " + vecteur.get(1));

        vecteur.remove("Alice");
        System.out.println("Après suppression : " + vecteur);


        System.out.println();
        System.out.println();

        //STACK
        Stack<String> pile = new Stack<>();
        pile.push("A");
        pile.push("B");
        pile.push("C");

        System.out.println("Pop : " + pile.pop());
        System.out.println("Sommet : " +  pile.peek());


        System.out.println();
        System.out.println();


        //HASHSET
        HashSet<String> etudiants = new HashSet<>();
        etudiants.add("Alice");
        etudiants.add("Bob");
        etudiants.add("Charlie");

        System.out.println("Étudiants : " + etudiants);


        System.out.println();
        System.out.println();


        //TREESET
        TreeSet<Integer> notes = new TreeSet<>();
        notes.add(85);
        notes.add(90);
        notes.add(70);

        System.out.println("Notes triées : " + notes);


        System.out.println();
        System.out.println();


        Map<String, Integer> notess = new HashMap<>();

        notess.put("Alice", 85);
        notess.put("Bob", 90);

        System.out.println("Note de Bob : " + notess.get("Bob"));

        // Parcours des clés/valeurs
        for (Map.Entry<String, Integer> e : notess.entrySet()) {
            System.out.println(e.getKey() + " → " + e.getValue());
        }

    }
}