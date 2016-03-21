package miniprojs2;

/**
 * represents the positions used to place cars and set an exit
 * @author bretx
 */
public class Position
{
	/**
	 * set default X position of the object
	 */
	private static final int DEFAULT_X = 0;
	
	/**
	 * set the default Y position of the object
	 */
	private static final int DEFAULT_Y = 0;
	
	/**
	 * x (abscissa) coordonate of the position
	 */
	private final int x;

	/**
	 *  y (ordinate) coordonate of the position
	 */
	private final int y;

	/**
	 * Creates a position with default coordonates
	 */
	public Position()
	{
		this.x = Position.DEFAULT_X;
		this.y = Position.DEFAULT_Y;
	}
	
	/**
	 * Creates a position with given coordonates
	 * @param x0 abscissa of the position
	 * @param y0 ordinate of the position
	 */
	public Position(int x0, int y0)
	{
		this.x = x0;
		this.y = y0;
	}

	/**
	 * gets the abscissa of the position
	 * @return x abscissa of the position
	 */
	public int getX()
	{
		return this.x;
	}

	/**
	 * gets the ordinate of the position
	 * @return y ordinate of the position
	 */
	public int getY()
	{
		return this.y;
	}
}
