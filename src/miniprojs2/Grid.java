package miniprojs2;

/**
 * Represents the board of a rush hour game
 */
public class Grid
{
	/**
	 * Default height of the grid
	 */
	private static final int DEFAULT_HEIGHT = 6;

	/**
	 * Default length of the grid
	 */
	private static final int DEFAULT_LENGTH = 6;

	/**
	 * default position of the Exit
	 */
	private static final Position DEFAULT_EXIT = new Position(5, 3);

	/**
	 * the height of the grid
	 */
	private final int height;

	/**
	 * the length of the grid
	 */
	private final int length;

	/**
	 * Represent the case which the red car have to reach to finish the game
	 */
	private final Position exit;

	/**
	 * Creates a new grid with default height and length
	 */
	public Grid()
	{
		this.height = Grid.DEFAULT_HEIGHT;
		this.length = Grid.DEFAULT_LENGTH;
		this.exit = Grid.DEFAULT_EXIT;
	}

	/**
	 * Gets the position of the exit of the grid
	 * 
	 * @return the exit of the grid
	 */
	public Position getExit()
	{
		return this.exit;
	}

	// TODO fix comment
	// TODO rename parameters (not compliant with coding conventions)
	/**
	 * Creates a new grid with given height and length Places the cars and the
	 * exit using given starting positions
	 * 
	 * @param H
	 * @param L
	 * @param E
	 */
	/*
	 * public Grid(int H, int L, Position E) { this.height = H; this.length = L;
	 * this.exit = E; }
	 */

}
