package cards;

public class App {
    public static void main(String[] args) {
        // Instantiate a deck and two players
        Deck deck = new Deck();
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // Shuffle the deck
        deck.shuffle();

        // Draw cards to each player
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }

        // Flip cards and increment scores
        for (int i = 0; i < 26; i++) {
            Card player1Card = player1.flip();
            Card player2Card = player2.flip();
            System.out.printf("%s drew a %s\n", player1.getName(), player1Card.getName());
            System.out.printf("%s drew a %s\n", player2.getName(), player2Card.getName());
            if (player1Card.getValue() > player2Card.getValue()) {
                player1.incrementScore();
                System.out.printf("%s wins!\n", player1.getName());
            } else if (player2Card.getValue() > player1Card.getValue()) {
                player2.incrementScore();
                System.out.printf("%s wins!\n", player2.getName());
            } else {
                System.out.println("Draw!");
            }
            System.out.printf("%s score: %d\n", player1.getName(), player1.getScore());
            System.out.printf("%s score: %d\n", player2.getName(), player2.getScore());
        }

        // Print final scores and determine winner
        int player1Score = player1.getScore();
        int player2Score = player2.getScore();
        System.out.printf("%s score: %d\n", player1.getName(), player1Score);
        System.out.printf("%s score: %d\n", player2.getName(), player2Score);
        if (player1Score > player2Score) {
            System.out.printf("%s wins!\n", player1.getName());
        } else if (player2Score > player1Score) {
            System.out.printf("%s wins!\n", player2.getName());
        } else {
            System.out.println("Draw!");
        }
        System.out.println("Final score player 1: " + player1.getScore());
        System.out.println("Final score player 2: " + player2.getScore());
    }	
    
}
