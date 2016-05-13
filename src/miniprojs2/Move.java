package miniprojs2;

/**
 * Represents a move given by the player
 * 
 * @author bretx
 *
 */
public class Move
{

	/**
	 * Position where should be the front of the moved car
	 */
	private final PositionOnRushHourGrid frontOfMovedCar;

	/**
	 * Position of the front of the car after the move
	 */
	private final PositionOnRushHourGrid frontAfterMoving;

	/**
	 * Creates a moves with 2 given positions
	 * @param frontOfMovedCar Position of the front of the car
	 * @param frontAfterMoving Position where we cant to move the front of the car
	 * @throws NotValidMoveException the move is not valid if the two positions do not have a shared axis
	 */
	public Move(PositionOnRushHourGrid frontOfMovedCar, PositionOnRushHourGrid frontAfterMoving) throws NotValidMoveException
	{
		if (frontOfMovedCar.getX()==frontAfterMoving.getX() || frontOfMovedCar.getY()==frontAfterMoving.getY())
		{
			this.frontOfMovedCar = frontOfMovedCar;
			this.frontAfterMoving = frontAfterMoving;
		}
		else throw new NotValidMoveException();
			
	}

	/**
	 * Gets the car positions where the car has to be moved
	 * @return the position where the car should be moved
	 */
	public PositionOnRushHourGrid getFrontAfterMoving()
	{
		return this.frontAfterMoving;
	}

	/**
	 * Gets the position of the front of the moved car
	 * @return the position of the moved car
	 */
	public PositionOnRushHourGrid getFrontOfMovedCar()
	{
		return this.frontOfMovedCar;
	}

	/**
	 * Calculate the number of case of the move
	 * @param axis 
	 * @return the number of case of the move can be negative or positive
	 */
	public int numberOfCaseMoved(Axis axis)
	{
		if(axis==Axis.HORIZONTAL)
		{
			return this.frontOfMovedCar.getX()-this.getFrontAfterMoving().getX();
		}
		return this.frontOfMovedCar.getY()-this.getFrontAfterMoving().getY();
	}
	
	/**
	 * Calculate the axis of a move
	 * @return horizontal if the move is on the x axis,else vertical
	 */
	public Axis getAxis()
	{
		if (this.frontOfMovedCar.getY()==this.frontAfterMoving.getY())
		{
			return Axis.HORIZONTAL;
		}
		return Axis.VERTICAL;
	}

}
