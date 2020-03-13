import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 9;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS = { "ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen",
			"king" };

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS = { "spades", "hearts", "diamonds", "clubs" };

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0 };

	/**
	 * Flag used to control debugging print statements.
	 */
	private static final boolean I_AM_DEBUGGING = false;

	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	public ElevensBoard() {
		super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	}

	/**
	 * Determines if the selected cards form a valid group for removal. In Elevens,
	 * the legal groups are (1) a pair of non-face cards whose values add to 11, and
	 * (2) a group of three cards consisting of a jack, a queen, and a king in some
	 * order.
	 * 
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal; false
	 *         otherwise.
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) {
		if (containsJQK(selectedCards) || containsPairSum11(selectedCards))
			return true;
		return false;
	}

	/**
	 * Determine if there are any legal plays left on the board. In Elevens, there
	 * is a legal play if the board contains (1) a pair of non-face cards whose
	 * values add to 11, or (2) a group of three cards consisting of a jack, a
	 * queen, and a king in some order.
	 * 
	 * @return true if there is a legal play left on the board; false otherwise.
	 */
	@Override
	public boolean anotherPlayIsPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		List<Integer> jk = cardIndexes();
		for (int i : jk) {
			for (int j : jk) {
				if (cardAt(j).pointValue() + cardAt(i).pointValue() == 11) {
					return true;
				}
			}
		}
		ArrayList<String> jqk = new ArrayList<>();
		jqk.add("jack");
		jqk.add("queen");
		jqk.add("king");
		for (int i : jk) {
			if (jqk.contains(cardAt(i).rank())) {
				jqk.remove(new String(cardAt(i).rank()));
			}
		}
		if (jqk.size() == 0)
			return true;
		return false;
	}

	/**
	 * Check for an 11-pair in the selected cards.
	 * 
	 * @param selectedCards selects a subset of this board. It is list of indexes
	 *                      into this board that are searched to find an 11-pair.
	 * @return true if the board entries in selectedCards contain an 11-pair; false
	 *         otherwise.
	 */
	private boolean containsPairSum11(List<Integer> selectedCards) {
		if (selectedCards.size() != 2)
			return false;
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		for (int i : selectedCards) {
			for (int j : selectedCards) {
				if (cardAt(j).pointValue() + cardAt(i).pointValue() == 11) {
					return true;
				}
			}
		}
		return false;

	}

	/**
	 * Check for a JQK in the selected cards.
	 * 
	 * @param selectedCards selects a subset of this board. It is list of indexes
	 *                      into this board that are searched to find a JQK group.
	 * @return true if the board entries in selectedCards include a jack, a queen,
	 *         and a king; false otherwise.
	 */
	private boolean containsJQK(List<Integer> selectedCards) {
		if (selectedCards.size() != 3)
			return false;
		ArrayList<String> jqk = new ArrayList<>();
		jqk.add("jack");
		jqk.add("queen");
		jqk.add("king");
		for (int i : selectedCards) {
			if (jqk.contains(cardAt(i).rank())) {
				jqk.remove(new String(cardAt(i).rank()));
			}
		}
		if (jqk.size() == 0)
			return true;
		return false;
	}
}
