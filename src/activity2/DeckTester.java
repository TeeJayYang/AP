package activity2;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
            String[] ranks = {"Jack","Queen", "King", "Ace"};
            String[] suits = {"Diamonds","Clubs","Hearts","Spades"};
            int[] pointValues = {11,12,13,1};
            Deck d = new Deck(ranks, suits, pointValues);
            System.out.println(d);
            d.deal();
            d.deal();
            System.out.println(d);
	}
}
