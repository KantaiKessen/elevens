/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card testOne = new Card("Ace", "Spades", 11);
		Card testTwo = new Card("Queen", "Spades", 10);
        Card testThree = new Card("Jack", "Hearts", 10);
        System.out.println(testOne.rank());
        System.out.println(testOne.matches(testTwo));
        System.out.println(testTwo.matches(testTwo));
        System.out.println(testThree.toString());
    }
}
