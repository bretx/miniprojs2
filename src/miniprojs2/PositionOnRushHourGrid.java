package miniprojs2;

/**
 * represents the positions used to place cars and set an exit
 * 
 * @author bretx
 */
public class PositionOnRushHourGrid
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
	public PositionOnRushHourGrid()
	{
		this.x = PositionOnRushHourGrid.DEFAULT_X;
		this.y = PositionOnRushHourGrid.DEFAULT_Y;
	}

	/**
	 * Creates a position with given coordonates
	 * 
	 * @param x0
	 *            abscissa of the position
	 * @param y0
	 *            ordinate of the position
	 * @throws PositionOutOfGridException if the position is not on the grid
	 */
	public PositionOnRushHourGrid(int x0, int y0) throws PositionOutOfGridException
	{
		if (x0<RushHourGrid.DEFAULT_LENGTH && y0<RushHourGrid.DEFAULT_HEIGHT)
		{
			this.x = x0;
			this.y = y0;
		}
		else throw new PositionOutOfGridException();
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
	

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PositionOnRushHourGrid other = (PositionOnRushHourGrid) obj;
		if (this.x != other.x)
			return false;
		if (this.y != other.y)
			return false;
		return true;
	}

	/**
	 * Calculate a new position based on the given position and direction
	 * @param direction Direction we want to get the new position
	 * @return the position next to the given position on the given direction
	 */
	public PositionOnRushHourGrid caseNextTo(Direction direction){
		try
		{
			return (new PositionOnRushHourGrid(this.getX()+direction.getX(),this.getY()+direction.getY()));
		}
		catch (PositionOutOfGridException e)
		{
			return null;
		}
	}
	
}
