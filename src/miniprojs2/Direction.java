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
	
	//TODO les psotion sont a remettre
	NORTH(new PositionOnRushHourGrid(0,-1)),
	/**
	 * East direction
	 */
	EAST(new PositionOnRushHourGrid(0,-1)),
	/**
	 * South direction
	 */
	SOUTH(new PositionOnRushHourGrid(0,-1)),
	/**
	 * West direction
	 */
	WEST(new PositionOnRushHourGrid(0,-1));
	
	/**
	 * 
	 */
	private final PositionOnRushHourGrid shifting;
	
	/**
	 * @param shifting
	 */
	private Direction (PositionOnRushHourGrid shifting)
	{
		this.shifting = shifting;
	}
}
