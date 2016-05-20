package miniprojs2;

import java.util.ArrayList;

/**
 * Represents a game of rush hour,
 * https://en.wikipedia.org/wiki/Rush_Hour_%28board_game%29
 * 
 * @author bretx
 * 
 */
public class RushHourGame
{

	/**
	 * Defines a car that doesn't exist
	 */
	private static final Car NULL = null;

	// TODO (done) rename field
	/**
	 * counter of the numbers of moves
	 */
	private int nbMoves;

	// TODO (done) rename field
	/**
	 * allow to check if the game has ended or not
	 */
	private boolean isGameFinished;

	/**
	 * grid of the game
	 */
	private final RushHourGrid gameGrid;

	/**
	 * cars that are on the grid (first car is the red one)
	 */
	public ArrayList<Car> cars;

	/**
	 * Number of cars.
	 */
	private final int nbCars;

	/**
	 * Player who's giving instructions to move the cars
	 */
	private Player player;

	/**
	 * Create a new Rush Hour game, ready to be played The grid is setup with
	 * cars on it and the move counter is set at 0 and the game isn't finished
	 * @throws PositionOutOfGridException 
	 */
	public RushHourGame() throws PositionOutOfGridException
	{
		this.nbCars = 6;
		int i = 0;
		this.nbMoves = 0;
		this.isGameFinished = false;
		this.gameGrid = new RushHourGrid();
		this.cars = new ArrayList<Car>(this.nbCars);
		this.cars.add(0, new Car(new PositionOnRushHourGrid(1, 3), 2, Direction.EAST));
		i++;
//		while (i < this.nbCars)
//		{
//			this.cars.add(i, new Car(new PositionOnRushHourGrid(i, i + 1), (i % 2) + 2, Direction.NORTH));
//			
//		}
		this.cars.add(1, new Car(new PositionOnRushHourGrid(1),(1) , Direction.NORTH));

		this.player = new Player();

	}

	/**
	 * Checks if the given move is possible in the current state of the grid
	 * 
	 * @param move
	 *            The given move
	 * @return true if the move is valid, false if it isn't valid
	 * @throws PositionOutOfGridException 
	 */
	private boolean isMoveValid(Move move) throws PositionOutOfGridException
	{
		Car movedCar = this.cars.get(getCarFromFrontPosition(move.getFrontOfMovedCar()));
		if (movedCar == NULL)
			return false;

		Direction directionOfMovedCar = movedCar.getCarDirection();
			
		if (move.getAxis()==Axis.HORIZONTAL)
		{
			int nbOfCaseMoved = move.numberOfCaseMoved(Axis.HORIZONTAL);
			if (nbOfCaseMoved != 0)
			{
				return (isSegmentFree(nbOfCaseMoved, directionOfMovedCar, move));
			}
			else
			{
				return false;
			}

		}
		else if (move.getAxis()==Axis.VERTICAL)
		{
			int nbOfCaseMoved = move.numberOfCaseMoved(Axis.VERTICAL);
			if (nbOfCaseMoved != 0)
			{
				return (isSegmentFree(nbOfCaseMoved, directionOfMovedCar, move));
			}
			else
			{
				return false;
			}
		}

		return true;
	}

	/**
	 * Checks if all the case of a line are free
	 * 
	 * @param nbOfCaseMoved
	 *            number of cases that should be checked
	 * @param directionOfMovedCar
	 *            Direction faced by the moved car
	 * @param move
	 *            move we want to do
	 * @return true if all the cases on the given segment are free, else false
	 * @throws PositionOutOfGridException 
	 */
	private boolean isSegmentFree(int nbOfCaseMoved, Direction directionOfMovedCar, Move move) throws PositionOutOfGridException
	{
		boolean isFree = true;
		// TODO Auto-generated method stub
		if (directionOfMovedCar == Direction.EAST && nbOfCaseMoved < 0)
		{
			for (int i = 1; i <= Math.abs(nbOfCaseMoved); i++)
			{
				isFree=isFree && isCaseFree(new PositionOnRushHourGrid(move.getFrontOfMovedCar().getX() - (i + 1), move.getFrontOfMovedCar().getY()));
			}
		}
		else if (directionOfMovedCar == Direction.WEST && nbOfCaseMoved > 0)
		{
			for (int i = 1; i <= Math.abs(nbOfCaseMoved); i++)
			{
				isFree=isFree && isCaseFree(new PositionOnRushHourGrid(move.getFrontOfMovedCar().getX() + (i + 1), move.getFrontOfMovedCar().getY()));
			}
		}
		else if (directionOfMovedCar == Direction.SOUTH && nbOfCaseMoved < 0)
		{
			for (int i = 1; i <= Math.abs(nbOfCaseMoved); i++)
			{
				isFree=isFree && isCaseFree(new PositionOnRushHourGrid(move.getFrontOfMovedCar().getX(), move.getFrontOfMovedCar().getY() - (i + 1)));
			}
		}
		else if (directionOfMovedCar == Direction.NORTH && nbOfCaseMoved > 0)
		{
			for (int i = 1; i <= Math.abs(nbOfCaseMoved); i++)
			{
				isFree=isFree && isCaseFree(new PositionOnRushHourGrid(move.getFrontOfMovedCar().getX(), move.getFrontOfMovedCar().getY() + (i + 1)));
			}
		}
		else return false;
		
		return isFree;

	}

	/**
	 * Check if a case is free
	 * 
	 * @param position
	 *            case we want to check
	 * @return true if the case is free, else false
	 * @throws PositionOutOfGridException
	 */
	private boolean isCaseFree(PositionOnRushHourGrid position) throws PositionOutOfGridException
	{
		
		if ((this.getCarFromFrontPosition(position) != -1)
				|| this.cars.get(this.getCarFromFrontPosition(new PositionOnRushHourGrid(position.getX(), position.getY() + 1))).getCarDirection() == Direction.NORTH
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
	 * Play the game i.e : it starts a loop in which the player have to make his
	 * moves until he wins or give up, the total number of moves and total time
	 * are counted. while (game is not over) do <ask player for a move> while
	 * (<move is not valid>) <process move> update counter update game status
	 * @throws PositionOutOfGridException 
	 */
	public void play() throws PositionOutOfGridException
	{
		while (!(this.isGameFinished))
		{
			Move move = null;
			do
			{
				move = this.player.getMove();
			}
			while (!this.isMoveValid(move));
			
			this.cars.get(this.getCarFromFrontPosition(move.getFrontOfMovedCar())).setPosition(move.getFrontAfterMoving());
			this.nbMoves = this.nbMoves + 1;
			if (((Car) this.cars.get(1)).getFrontPosition() == (this.gameGrid.getExit()))
			{
				this.isGameFinished = true;
			}
		}
	}

	/**
	 * Cheks if there is a front of a car at the given position
	 * 
	 * @param position
	 *            Position where we want to find a car
	 * @return true if there is a car at the given position, false else
	 */
	public int getCarFromFrontPosition(PositionOnRushHourGrid position)
	{
		int i = 0;
		while (i < this.nbCars)
		{
			if (((Car) this.cars.get(i)).getFrontPosition() == position)
				return i ;
		}
		return -1;
	}
}
