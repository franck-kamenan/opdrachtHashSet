package be.intecbrussel.opdrachten.opdracht2;

import java.util.*;

public class LotteryApp {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Random rng = new Random();
        Collection<Integer> userNumber = new HashSet<>();
        Collection<Integer> winningNumbers = new HashSet<>();

        System.out.println("Give 6 unique numbers between 1 and 45.");
        while (userNumber.size() < 6) {
            int userInput = keyboard.nextInt();
            if(userInput >= 1 && userInput <= 45) {
                userNumber.add(userInput);
            }
        }

        System.out.println();
        userNumber.forEach(System.out::println);

        while (winningNumbers.size() < 6) {
            int winningInput = rng.nextInt(45) + 1;
            winningNumbers.add(winningInput);
        }

        System.out.println();
        winningNumbers.forEach(System.out::println);
    }
}
