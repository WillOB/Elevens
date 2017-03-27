/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */

	
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("1", "Clubs", 1);
		Card card2 = new Card("1", "Clubs", 1);
		Card card3 = new Card("Queen", "Hearts", 12);
		
		System.out.println("Should be clubs: " + card1.suit());
		System.out.println("Should be clubs: " + card2.suit());
		System.out.println("Should be hearts: " + card3.suit());
		System.out.println("Should be 1: " + card1.rank());
		System.out.println("Should be 1: " + card2.rank());
		System.out.println("Should be queen: " + card3.rank());
		System.out.println("Should be 1: " + card1.pointValue());
		System.out.println("Should be 1: " + card2.pointValue());
		System.out.println("Should be 12: " + card3.pointValue());
		System.out.println("Should be true: " + card1.matches(card2));
		System.out.println("Should be false: " + card3.matches(card1));
		System.out.println("Should be false: " + card2.matches(card3));
		System.out.println(card1.toString());
		System.out.println(card2.toString());
		System.out.println(card3.toString());
	}
}
