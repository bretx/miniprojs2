package miniprojs2;

// TODO write comment
public class Grid
{
	/**
	 *  Default height of the grid
	 */
	private static final int DEFAULT_HEIGHT = 6;
	
	// TODO fix constant name (mispelled)
	/**
	 * Default lenght of the grid
	 */
	private static final int DEFAULT_LENGHT = 6;
	
	// TODO write comment
	private final int height;
	
	// TODO write comment
	// TODO fix constant name (mispelled)
	private final int lenght;
	// TODO write comment
	
	private final Position exit;
	
	// TODO write comment
	public Grid()
	{
		this.height = Grid.DEFAULT_HEIGHT;
		this.lenght = Grid.DEFAULT_LENGHT;
		
		// TODO fix it (in rush hour, exit is always at the same position (see rules)
		Position exit = new Position();
		this.exit= exit;
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
