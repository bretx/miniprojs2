package miniprojs2;

/**
 * Represents the car that are used in a rush hour game
 * @author bretx
 */
public class Car
{
	/**
	 * Position of the front of the car
	 */
	private Position frontPosition;
	
	/**
	 * Position of the back of the car
	 */
	private Position rearPosition;

	/**
	 * Creates a new car with given postions
	 * @param frontPosition front's position of the car
	 * @param rearPosition back's position of the car
	 */
	public Car(Position frontPosition, Position rearPosition)
	{
		super();
		this.frontPosition = frontPosition;
		this.rearPosition = rearPosition;
	}

	// TODO (done) write comment
	/**
	 * get the position of the front of the car
	 * @return the front position
	 */
	public Position getFrontPosition()
	{
		return this.frontPosition;
	}
	
	/**
	 * get the position of the back of the car
	 * @return the rear position
	 */
	public Position getRearPosition()
	{
		return this.rearPosition;
	}

	// TODO (done) fix comment
	/**
	 * used to move a car using its two positions
	 * @param car car which is moved
	 */
	public void setPosition(Car car)
	{
		this.frontPosition = car.frontPosition;
		this.rearPosition = car.rearPosition;
	}
}
