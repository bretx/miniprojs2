package miniprojs2;

/**
 * represents the positions used to place cars and set an exit
 * 
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
	 * y (ordinate) coordonate of the position
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
	 * 
	 * @param x0
	 *            abscissa of the position
	 * @param y0
	 *            ordinate of the position
	 */
	public Position(int x0, int y0)
	{
		this.x = x0;
		this.y = y0;
	}

	/**
	 * gets the abscissa of the position
	 * 
	 * @return x abscissa of the position
	 */
	public int getX()
	{
		return this.x;
	}

	/**
	 * gets the ordinate of the position
	 * 
	 * @return y ordinate of the position
	 */
	public int getY()
	{
		return this.y;
	}

	/**
	 * Calculate the axis of a move
	 * @param position Move of the car
	 * @param position2 Car which is moved 
	 * @return horizontal if the move is on the x axis,else vertical
	 */
	public Axis moveAxis(Position position)
	{
		if (position.getY()==this.getY())
		{
			return Axis.HORIZONTAL;
		}
		return Axis.VERTICAL;
	}
	
	
}
