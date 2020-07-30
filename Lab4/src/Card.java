import java.util.Random;

public class Card {

	int faceValue; // face value of the card
	int suit; // Cards suit
	int value;
	public String cardValue, cardSuit;

	// constants for suits with numbers
	public static final int HEARTS = 1;
	public static final int DIAMONDS = 2;
	public static final int CLUBS = 3;
	public static final int SPADES = 4;
	public static final int ACE = 1;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;

	Random number = new Random();

	public void randomizing() {
		faceValue = number.nextInt(13) + 1;
		suit = number.nextInt(4) + 1;
	}

	public Card() {
		randomizing();
	}

	public String toString() {
		if (value >= 1 && value <= 10)
			cardValue = Integer.toString(value);
		if (suit >= 1 && suit <= 4)
			cardSuit = Integer.toString(suit);
		return cardValue + cardSuit;
	}

	public static void main(String[] args) {
		int card = 0;
		Card newCard = new Card();

		System.out.println("Your hand is: ");
		for (int value = 1; value <= 5; value++) {
			newCard.randomizing();
			System.out.println(card + ") " + newCard);
		}

	}

}
