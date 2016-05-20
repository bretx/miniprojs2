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
	 * @param position
	 *            car which is moved
	 */
	public void setPosition(PositionOnRushHourGrid position)
	{
		this.frontPosition = position;
	}

	/**
	 * Gets the size of the car
	 * @return the size
	 */
	public int getSize()
	{
		return this.size;
	}
	
	public boolean isCarAtPosition(PositionOnRushHourGrid position)
	{
		if (this.frontPosition==position)
			return true;
		else if (this.carDirection == Direction.NORTH)
			if (this.getSize() == 2)
				if (this.getFrontPosition())
				|| this.cars.get(this.getCarFromFrontPosition(new PositionOnRushHourGrid(position.getX(), position.getY() - 1))).getCarDirection() == Direction.SOUTH
				|| this.cars.get(this.getCarFromFrontPosition(new PositionOnRushHourGrid(position.getX() + 1, position.getY()))).getCarDirection() == Direction.EAST
				|| this.cars.get(this.getCarFromFrontPosition(new PositionOnRushHourGrid(position.getX() - 1, position.getY()))).getCarDirection() == Direction.WEST
				|| (this.cars.get(this.getCarFromFrontPosition(new PositionOnRushHourGrid(position.getX(), position.getY() + 2))).getCarDirection() == Direction.NORTH && this.cars.get(this.getCarFromFrontPosition(new PositionOnRushHourGrid(position.getX(), position.getY() + 2))).getSize()==3)
				|| (this.cars.get(this.getCarFromFrontPosition(new PositionOnRushHourGrid(position.getX(), position.getY() - 2))).getCarDirection() == Direction.SOUTH && this.cars.get(this.getCarFromFrontPosition(new PositionOnRushHourGrid(position.getX(), position.getY() + 2))).getSize()==3)
				|| (this.cars.get(this.getCarFromFrontPosition(new PositionOnRushHourGrid(position.getX() + 2, position.getY()))).getCarDirection() == Direction.EAST && this.cars.get(this.getCarFromFrontPosition(new PositionOnRushHourGrid(position.getX(), position.getY() + 2))).getSize()==3)
				|| (this.cars.get(this.getCarFromFrontPosition(new PositionOnRushHourGrid(position.getX() - 2, position.getY()))).getCarDirection() == Direction.WEST && this.cars.get(this.getCarFromFrontPosition(new PositionOnRushHourGrid(position.getX(), position.getY() + 2))).getSize()==3)
)
		{
			return false;
		}
		else
			return true;
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
