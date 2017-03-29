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
		String[] ranks1 = {"1", "2", "3"};
		String[] suits1 = {"Hearts", "Diamonds"};
		int[] values1 = {1, 2, 3};
		Deck deck1 = new Deck(ranks1, suits1, values1);
		System.out.println("Deck 1");
		System.out.println("Empty? " + deck1.isEmpty() + " Size: " + deck1.size());
		System.out.println(deck1.deal().toString());
		
		String[] ranks2 = new String[0];
		String[] suits2 = new String[0];
		int[] values2 = new int[0];
		Deck deck2 = new Deck(ranks2, suits2, values2);
		System.out.println("Deck 2");
		System.out.println("Empty? " + deck2.isEmpty() + " Size: " + deck2.size());
		System.out.println(deck2.deal().toString());
		
		String[] ranks3 = {"Jack", "Queen", "King"};
		String[] suits3 = {"Hearts", "Diamonds", "Clubs", "Spades"};
		int[] values3 = {11, 12, 13};
		Deck deck3 = new Deck(ranks3, suits3, values3);
		System.out.println("Deck 3");
		System.out.println("Empty? " + deck3.isEmpty() + " Size: " + deck3.size());
		System.out.println(deck3.deal().toString());
		
	}
}
