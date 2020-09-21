package be.intecbrussel.opdrachten.opdracht2;

import java.util.*;

public class LotteryApp {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Collection<Integer> userNumber = new HashSet<>();

        System.out.println("Give 6 unique numbers between 1 and 45.");
        while (userNumber.size() < 6) {
            int userInput = keyboard.nextInt();
            if(userInput >= 1 && userInput <= 45) {
                userNumber.add(userInput);
            }
        }

        userNumber.forEach(System.out::println);
    }
}
