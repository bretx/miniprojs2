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

	// TODO write comment
	public Position getFrontPosition()
	{
		return this.frontPosition;
	}
	
	public Position getRearPosition()
	{
		return this.rearPosition;
	}

	// TODO fix comment
	/**
	 * @param frontPosition
	 * @param rearPosition
	 */
	public void setPosition(Position frontPosition, Position rearPosition)
	{
		this.frontPosition = frontPosition;
		this.rearPosition = rearPosition;
	}
}
