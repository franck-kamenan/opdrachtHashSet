package be.intecbrussel.opdrachten.opdracht2;

import java.util.*;

public class LotteryApp {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Random rng = new Random();
        Collection<Integer> userNumber = new LinkedHashSet<>();
        Collection<Integer> winningNumbers = new LinkedHashSet<>();

        System.out.println("Give 6 unique numbers between 1 and 45.");
        while (userNumber.size() < 6) {
            int userInput = keyboard.nextInt();
            if(userInput >= 1 && userInput <= 45) {
                userNumber.add(userInput);
            }
        }

        System.out.println("---user---");
        userNumber.forEach(System.out::println);

        while (winningNumbers.size() < 6) {
            int winningInput = rng.nextInt(45) + 1;
            winningNumbers.add(winningInput);
        }

        System.out.println("---random---");
        winningNumbers.forEach(System.out::println);

        winningNumbers.retainAll(userNumber);
        System.out.println("---retainAll---");
        System.out.println("Your correct numbers:");
        winningNumbers.forEach(System.out::println);

        System.out.println("---retainAll---With---ArrayList");
        Collection<Integer> col = new ArrayList<>();
        col.add(10);
        col.add(10);

        Collection<Integer> col2 = new ArrayList<>();
        col2.add(10);

        col.retainAll(col2);
        col.forEach(System.out::println);
    }
}
