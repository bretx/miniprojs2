package miniprojs2;

/**
 * Represents the board of a rush hour game
 */
public class Grid
{
	/**
	 *  Default height of the grid
	 */
	private static final int DEFAULT_HEIGHT = 6;
	
	/**
	 * Default length of the grid
	 */
	private static final int DEFAULT_LENGTH = 6;
	
	
	// TODO (done) consider gathering x and y in an object
	/**
	 * default position of the Exit
	 */
	private static final Position DEFAULT_EXIT = new Position (3,5);
	
	
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
	// TODO (done) write comment
	private final Position exit;
	
	// TODO (done) detail comment (see RushHourGame())
	/**
	 * Creates a new grid with default height and length
	 */
	public Grid()
	{
		this.height = Grid.DEFAULT_HEIGHT;
		this.length = Grid.DEFAULT_LENGTH;
		this.exit = Grid.DEFAULT_EXIT;
		
		
	}
	
	
	// TODO write comment
	// TODO rename parameters (not compliant with coding conventions)
	/**
	 * Creates a new grid with given height and length
	 * Places the cars and the exit using given starting positions
	 * @param H
	 * @param L
	 * @param E
	 */
	/*
	public Grid(int H, int L, Position E)
	{
		this.height = H;
		this.length = L;
		this.exit = E;
	}
	*/
	
}
