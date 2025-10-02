import java.util.Random;
import java.lang.*;

public class Exo2 {
    public static void main(String[] args) {

        String [] days = { "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};

            Random rand = new Random();
            int day = rand.nextInt(days.length);
            System.out.println(days[day]);

    }
}
