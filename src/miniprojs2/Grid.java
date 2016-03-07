package miniprojs2;

// TODO write comment
/**
 * Represents the board of a rush hour game
 */
public class Grid
{
	/**
	 *  Default height of the grid
	 */
	private static final int DEFAULT_HEIGHT = 6;
	
	// TODO(done) fix constant name (mispelled)
	/**
	 * Default length of the grid
	 */
	private static final int DEFAULT_LENGTH = 6;
	
	/**
	 * X position of the exit
	 */
	private static final int EXIT_X = 5;
	
	/**
	 * Y position of the exit
	 */
	private static final int EXIT_Y = 2;
	
	
	/**
	 * Represents the height of the grid
	 */
	// TODO(done) write comment
	private final int height;
	
	/**
	 * Represents the length of the grid
	 */
	// TODO(done) write comment
	// TODO (done) fix constant name (mispelled)
	private final int length;
	
	/**
	 * Represent the case which the red car have to reach to finish the game
	 */
	// TODO (done) write comment
	private final Case exit;
	
	/**
	 * Creates a new empty grid with default height and length
	 */
	// TODO (done) write comment
	public Grid()
	{
		this.height = Grid.DEFAULT_HEIGHT;
		this.length = Grid.DEFAULT_LENGTH;
		
		// TODO (done) fix it (in rush hour, exit is always at the same position (see rules)
		this.exit = new Case(EXIT_X,EXIT_Y);
	}
	
	// TODO write comment
	// TODO rename parameters (not compliant with coding conventions)
	public Grid(int H, int L, Position E)
	{
		this.height = H;
		this.lenght = L;
		this.exit = E;
	}
	
}
