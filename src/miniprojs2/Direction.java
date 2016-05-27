package miniprojs2;

/**
 * Defines a direction
 * @author bretx
 */
public enum Direction
{
	/**
	 * North direction
	 */
	NORTH(0,-1),
	/**
	 * East direction
	 */
	EAST(-1,0),
	/**
	 * South direction
	 */
	SOUTH(0,1),
	/**
	 * West direction
	 */
	WEST(1,0);
	
	/**
	 * Shifting on the x axis
	 */
	private final int x;
	
	/**
	 * Shifting on the y axis
	 */
	private final int y;
	
	/**
	 * @param x Depending of the Direction
	 * @param y Depending of the Direction
	 */
	private Direction (int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	/**
	 * @return the shifting on the x axis of the Direction
	 */
	public int getX()
	{
		return this.x;
	}

	/**
	 * @return the shifting on the y axis of the Direction
	 */
	public int getY()
	{
		return this.y;
	}
	
	/**
	 * @return The opposite direction of the given direction
	 */
	public Direction oppositeDirection()
	{
		if (this==Direction.NORTH){
			return Direction.SOUTH;
		}
		else if (this==Direction.SOUTH){
			return Direction.NORTH;
		}
		else if (this==Direction.WEST){
			return Direction.EAST;
		}
		else return Direction.WEST;
	}
}
