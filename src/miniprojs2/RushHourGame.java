package miniprojs2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
	private final Grid gameGrid;

	/**
	 * cars that are on the grid (first car is the red one)
	 */
	public ArrayList cars;

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
	 */
	public RushHourGame()
	{
		this.nbCars = 6;
		int i = 0;
		this.nbMoves = 0;
		this.isGameFinished = false;
		this.gameGrid = new Grid();
		this.cars = new ArrayList(nbCars);
		cars.add(0, new Car(new Position(1, 3), 2, Direction.EAST));
		i++;
		while (i < this.nbCars)
		{
			cars.add(1, new Car(new Position(i, i + 1), (i % 2) + 2, Direction.NORTH));
			// TODO Directions settings
		}
		this.player = new Player();

	}

	/**
	 * Checks if the given move is possible in the current state of the grid
	 * 
	 * @param move
	 *            The given move
	 * @return true if the move is valid, false if it isn't valid
	 */
	private boolean isMoveValid(Move move)
	{
		Car movedCar = getCarFromFrontPosition(move.getFrontOfMovedCar());
		if (movedCar == NULL)
			return false;

		Direction directionOfMovedCar = movedCar.getCarDirection();

		if (!(directionOfMovedCar.getAxis().equals(move.getAxis())))) return false;
			
		if ((directionOfMovedCar == Direction.EAST || directionOfMovedCar == Direction.WEST)
				&& move.getFrontOfMovedCar().moveAxis(move.getFrontAfterMoving()) == Axis.HORIZONTAL)
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
		/*
		 * else if ((directionOfMovedCar==Direction.NORTH ||
		 * directionOfMovedCar==Direction.SOUTH) &&
		 * Position.moveAxis(move.getFrontOfMovedCar
		 * (),move.getFrontAfterMoving()) == Axis.VERTICAL) { for (int i=0;
		 * i<Math
		 * .abs(movedCar.getFrontPosition().getY()-move.getFrontAfterMoving
		 * ().getY());i++) {
		 * 
		 * } }
		 */

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
	 */
	private boolean isSegmentFree(int nbOfCaseMoved, Direction directionOfMovedCar, Move move)
	{
		// TODO Auto-generated method stub
		if (directionOfMovedCar == Direction.EAST && nbOfCaseMoved < 0)
		{
			for (int i = 1; i <= Math.abs(nbOfCaseMoved); i++)
			{
				return isCaseFree(new Position(move.getFrontOfMovedCar().getX() - (i + 1), move.getFrontOfMovedCar().getY()));
			}
		}
		else if (directionOfMovedCar == Direction.WEST && nbOfCaseMoved > 0)
		{
			for (int i = 1; i <= Math.abs(nbOfCaseMoved); i++)
			{
				return isCaseFree(new Position(move.getFrontOfMovedCar().getX() + (i + 1), move.getFrontOfMovedCar().getY()));
			}
		}
		else if (directionOfMovedCar == Direction.SOUTH && nbOfCaseMoved < 0)
		{
			for (int i = 1; i <= Math.abs(nbOfCaseMoved); i++)
			{
				return isCaseFree(new Position(move.getFrontOfMovedCar().getX(), move.getFrontOfMovedCar().getY() - (i + 1)));
			}
		}
		else if (directionOfMovedCar == Direction.NORTH && nbOfCaseMoved > 0)
		{
			for (int i = 1; i <= Math.abs(nbOfCaseMoved); i++)
			{
				return isCaseFree(new Position(move.getFrontOfMovedCar().getX(), move.getFrontOfMovedCar().getY() + (i + 1)));
			}
		}
		return false;

	}

	/**
	 * Check if a case is free
	 * 
	 * @param position
	 *            case we want to check
	 * @return true if the case is free, else false
	 */
	private boolean isCaseFree(Position position)
	{
		if (getCarFromFrontPosition(position) == NULL
				|| getCarFromFrontPosition(new Position(position.getX() + 1, position.getY())).getCarDirection() == Direction.NORTH
				|| getCarFromFrontPosition(new Position(position.getX() - 1, position.getY())).getCarDirection() == Direction.SOUTH
				|| getCarFromFrontPosition(new Position(position.getX(), position.getY() + 1)).getCarDirection() == Direction.EAST
				|| getCarFromFrontPosition(new Position(position.getX(), position.getY() - 1)).getCarDirection() == Direction.WEST)
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
	 */
	public void play()
	{
		while (!(this.isGameFinished))
		{
			Move move = null;
			do
			{
				move = this.player.getMove();
			}
			while (!this.isMoveValid(move));
			// this.cars[move.getNumCar()].setPosition(move.getCarAfterMoving());
			this.nbMoves = this.nbMoves + 1;
			if (((Car) this.cars.get(0)).getFrontPosition() == (this.gameGrid.getExit()))
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
	public Car getCarFromFrontPosition(Position position)
	{
		int i = 0;
		while (i < this.nbCars)
		{
			if (this.cars.get(i).getFrontPosition() == position)
				return this.cars[i];
		}
		return NULL;
	}
}
