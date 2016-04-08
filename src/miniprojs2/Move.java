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
	private final Position frontOfMovedCar;

	/**
	 * Position of the front of the car after the move
	 */
	private final Position frontAfterMoving;

	/**
	 * Creates a moves with 2 given positions
	 * @param frontOfMovedCar Position of the front of the car
	 * @param frontAfterMoving Position where we cant to move the front of the car
	 */
	public Move(Position frontOfMovedCar, Position frontAfterMoving)
	{
		this.frontOfMovedCar = frontOfMovedCar;
		this.frontAfterMoving = frontAfterMoving;
	}

	/**
	 * Gets the car positions where the car has to be moved
	 * @return the position where the car should be moved
	 */
	public Position getFrontAfterMoving()
	{
		return this.frontAfterMoving;
	}

	/**
	 * Gets the position of the front of the moved car
	 * @return the position of the moved car
	 */
	public Position getFrontOfMovedCar()
	{
		return this.frontOfMovedCar;
	}

}
