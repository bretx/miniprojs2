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
	 * Number of the car which is moved
	 */
	private int numCar;

	/**
	 * Position of the front of the car after the move
	 */
	private Position frontAfterMoving;

	/**
	 * Creates a new move using a given number and his front postion after the
	 * move
	 * 
	 * @param numCar
	 * @param frontAfterMoving
	 */
	public Move(int numCar, Position frontAfterMoving)
	{
		this.numCar = numCar;
		this.frontAfterMoving = frontAfterMoving;
	}

	/**
	 * gets the number of the car which is moved
	 * 
	 * @return the number
	 */
	public int getNumCar()
	{
		return this.numCar;
	}

	/**
	 * Gets the car positions where the car has to be moved
	 * 
	 * @return a car
	 */
	public Position getFrontAfterMoving()
	{
		return this.frontAfterMoving;
	}

}
