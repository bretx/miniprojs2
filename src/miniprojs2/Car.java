package miniprojs2;

/**
 * Represents the car that are used in a rush hour game
 * 
 * @author bretx
 */
public class Car
{
	/**
	 * Position of the front of the car
	 */
	private PositionOnRushHourGrid frontPosition;
	
	/**
	 * Size of the car
	 */
	private final int size;
	
	/**
	 * Direction of the car
	 */
	private final Direction carDirection;

	
	/**
	 * Creates a new car with given paramaters
	 * @param frontPosition Position of the front part of the car
	 * @param size Size of the car (2 or 3)
	 * @param carDirection Direction which the car is facing
	 */
	public Car(PositionOnRushHourGrid frontPosition, int size, Direction carDirection)
	{
		this.frontPosition = frontPosition;
		this.size = size;
		this.carDirection = carDirection;
	}

	/**
	 * get the position of the front of the car
	 * 
	 * @return the front position
	 */
	public PositionOnRushHourGrid getFrontPosition()
	{
		return this.frontPosition;
	}

	/**
	 * used to move a car using its two positions
	 * 
	 * @param car
	 *            car which is moved
	 */
	public void setPosition(Car car)
	{
		this.frontPosition = car.frontPosition;
	}

	/**
	 * Gets the size of the car
	 * @return the size
	 */
	public int getSize()
	{
		return this.size;
	}

	/**
	 * Gets the direction of the car
	 * @return Direction which the car is facing
	 */
	public Direction getCarDirection()
	{
		return this.carDirection;
	}

}
