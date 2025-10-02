import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //HASHMAP
        Map<String, Integer> notes = new HashMap<>();

        notes.put("Alice", 85);
        notes.put("Alain", 95);
        notes.put("Bob", 80);

        System.out.println(notes);


        System.out.println("Note de Bob : " + notes.get("Bob"));
        System.out.println(notes.remove("Alain"));
        System.out.println(notes);

        for(Map.Entry<String, Integer> e : notes.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }


        System.out.println();
        System.out.println();

        //TREEMAP
        TreeMap<String, Integer> carnet = new TreeMap<>();
        carnet.put("Charlie", 555123);
        carnet.put("Alice", 555789);
        carnet.put("Bob", 555456);

        System.out.println("Carnet trié : " + carnet);

        System.out.println("Premier : " + carnet.firstEntry());
        System.out.println("Dernier : " + carnet.lastEntry());
        System.out.println("Première key : " + carnet.firstKey());
        System.out.println("Dernier key : " + carnet.lastKey());


        System.out.println();
        System.out.println();

        //LinkedHASMAP
        LinkedHashMap<Integer, String> historique = new LinkedHashMap<>();
        historique.put(1, "Google");
        historique.put(2, "YouTube");
        historique.put(3, "Wikipedia");

        System.out.println("Historique : " + historique);
    }
}