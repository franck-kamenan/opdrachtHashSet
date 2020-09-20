package be.intecbrussel.opdrachten.opdracht2;

import java.util.*;

public class AppString {

    public static void main(String[] args) {

        Collection<String> userWords = new HashSet<>();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Geef een zin die eindigd met een punt.");
        String word = "";

        while (!(word = keyboard.next()).endsWith(".")) {
            userWords.add(word);
        }

        userWords.add(word);

        System.out.println(userWords.size());

        String sentence = userWords.stream()
                .reduce("", (acc, e) -> acc + e + " ");

        System.out.println(sentence);
    }
}
