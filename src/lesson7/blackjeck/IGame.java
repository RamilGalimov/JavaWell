package lesson7.blackjeck;

public interface IGame {

    void addPlayerToGame(Player player);

    void dealPlayersCards();

    void dealMainRound();

    void printWinner();
}
