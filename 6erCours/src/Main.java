
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> nombres = new LinkedList<>();
        nombres.addFirst(10);
        nombres.addLast(20);
        nombres.addLast(30);
        nombres.addLast(40);
        nombres.addFirst(50);
        nombres.removeLast();
        nombres.removeFirst();
        System.out.println(nombres);
        System.out.println(nombres.size());
        System.out.println(nombres.contains(20));
        System.out.println(nombres.indexOf(20));


        System.out.println();
        System.out.println();


        var tab = nombres.toArray();
        System.out.println(Arrays.toString(tab));

        Iterator<Integer> iterator = nombres.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        System.out.println();
        System.out.println();


        Stack<Integer> pile = new Stack<>();
        pile.push(20);
        pile.push(30);
        pile.push(40);
        pile.push(50);


        System.out.println("Sommet : " + pile.peek());
        System.out.println("Aurevoir : " + pile.pop());


        System.out.println();
        System.out.println();



    }



}