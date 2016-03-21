package miniprojs2;

/**
 * Represents a move given by the player
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
	 * Car which is moved
	 */
	private Car carAfterMoving;

	/**
	 * Creates a new move using a given number and car
	 * @param numCar
	 * @param carAfterMoving
	 */
	public Move(int numCar, Car carAfterMoving)
	{
		this.numCar=numCar;
		this.carAfterMoving=carAfterMoving;
	}
	
	/**
	 * gets the number of the car which is moved
	 * @return the number
	 */
	public int getNumCar()
	{
		return this.numCar;
	}

	/**
	 * Gets the car positions where the car has to be moved
	 * @return a car
	 */
	public Car getCarAfterMoving()
	{
		return this.carAfterMoving;
	}

	
	
}
