package lesson7.blackjeck;

import java.util.ArrayList;
import java.util.Scanner;

public class Player implements IPlayer {
    private ArrayList<Card> cardsToHand = new ArrayList<>();
    private boolean canWin = true;

    public boolean isCanWin() {
        return canWin;
    }

    public void setCanWin(boolean canWin) {
        this.canWin = canWin;
    }

    @Override
    public void addCardToHand(Card card) {
        cardsToHand.add(card);

    }

    @Override
    public boolean needsMoreCard() {
        System.out.println("_________карты в руке_____");
        for (Card c : cardsToHand) {
            c.open();
        }
        System.out.println("Нужна ли карта?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("Да")) {
            return true;
        }
        return false;
    }

    @Override
    public int valueHand() {
        int summa = 0;
        for (Card c : cardsToHand) {
            summa = summa + c.getValue();

        }
        return summa;
    }

    @Override
    public void openHand() {
        for (Card c : cardsToHand) {
            c.open();

        }
    }
}
