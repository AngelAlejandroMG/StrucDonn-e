package org.example;
import java.util.*;
import java.io.*;

public class Test {
    public static void main(String[] args) {
        //LECTURE FICHIER TEXTE
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            String ligne;
            while ((ligne = br.readLine()) != null) {
                System.out.println(ligne);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        //ÉCRIURE FICHIER TEXTE
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter("sortie.txt"))) {
//            bw.write("Bonjour, monde !");
//            bw.newLine();
//            bw.write("Deuxième ligne.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        //COPIER UN FICHIER BINAIRE
//        try (FileInputStream in = new FileInputStream("image.png");
//             FileOutputStream out = new FileOutputStream("copie.png")) {
//
//            byte[] buffer = new byte[1024];
//            int bytesLus;
//            while ((bytesLus = in.read(buffer)) != -1) {
//                out.write(buffer, 0, bytesLus);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
