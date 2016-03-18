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
	
	
	// TODO consider gathering x and y in an object
	/**
	 * X position of the exit
	 */
	private static final int EXIT_X = 5;
	
	/**
	 * Y position of the exit
	 */
	private static final int EXIT_Y = 2;
	
	
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
	private final Case exit;
	
	// TODO detail comment (see RushHourGame())
	/**
	 * Creates a new empty grid with default height and length
	 */
	public Grid()
	{
		this.height = Grid.DEFAULT_HEIGHT;
		this.length = Grid.DEFAULT_LENGTH;
		
		this.exit = new Case(EXIT_X,EXIT_Y);
	}
	
	// TODO write comment
	// TODO rename parameters (not compliant with coding conventions)
	public Grid(int H, int L, Position E)
	{
		this.height = H;
		this.length = L;
		this.exit = E;
	}
	
}
