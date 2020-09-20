package be.intecbrussel.opdrachten.opdracht2;

import java.util.*;

public class App {

    public static void main(String[] args) {

        Collection<Integer> userNumbers = new HashSet<>();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Geef in 5 nummer aub");

        while (userNumbers.size() < 5) {
            userNumbers.add(keyboard.nextInt());
        }

        userNumbers.forEach(System.out::println);
        System.out.println();

        int sum = userNumbers.stream()
                .mapToInt(e -> e)
                .sum();

        System.out.println(sum);
        System.out.println();

        double average = userNumbers.stream()
                                    .mapToInt(e -> e)
                                    .average().getAsDouble();

        System.out.println(average);
    }
}
