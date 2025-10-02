//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String mot = "A-b-C-d-E-f-1234-***///->";
        String resultat = "";

        for (int i = 0; i < mot.length(); i++) {
            if (Character.isUpperCase(mot.charAt(i))) {
                resultat += Character.toLowerCase(mot.charAt(i));
            } else if(Character.isLowerCase(mot.charAt(i))) {
                resultat += Character.toUpperCase(mot.charAt(i));
            } else if(Character.isDigit(mot.charAt(i))) {
                resultat += mot.charAt(i);
            }

        }
        System.out.println(resultat);

    }
}
