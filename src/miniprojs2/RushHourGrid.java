package miniprojs2;

/**
 * Represents the board of a rush hour game
 */
public class RushHourGrid
{
	/**
	 * Default height of the grid
	 */
	public static final int DEFAULT_HEIGHT = 6;

	/**
	 * Default length of the grid
	 */
	public static final int DEFAULT_LENGTH = 6;

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
	private final PositionOnRushHourGrid exit;

	/**
	 * Creates a new grid with default height and length
	 * @throws PositionOutOfGridException 
	 */
	public RushHourGrid() throws PositionOutOfGridException
	{
		this.height = RushHourGrid.DEFAULT_HEIGHT;
		this.length = RushHourGrid.DEFAULT_LENGTH;
		this.exit = new PositionOnRushHourGrid(5, 3);
	}

	/**
	 * Gets the position of the exit of the grid
	 * 
	 * @return the exit of the grid
	 */
	public PositionOnRushHourGrid getExit()
	{
		return this.exit;
	}

	/**
	 * Gets the length of the grid
	 * @return the length of the current grid
	 */
	public int getLength()
	{
		return this.length;
	}

	
	/**
	 * Gets the height of the grid
	 * @return the height of the current grid
	 */
	public int getHeight()
	{
		return this.height;
	}

}
