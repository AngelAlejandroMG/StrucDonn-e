//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.<
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //exo1

        String motPasse = "A-b-C-d-E-f-1234-***///->";

        for (int i = 0; i < motPasse.length(); i++) {
            char caractere = motPasse.charAt(i);
            if (Character.isUpperCase(caractere)) {
                caractere = Character.toLowerCase(caractere);
            }else if (Character.isLowerCase(caractere)) {
                caractere = Character.toUpperCase(caractere);
            }

            if (Character.isLetterOrDigit(caractere)) {
                System.out.print(caractere);
            }



        }

    }
}