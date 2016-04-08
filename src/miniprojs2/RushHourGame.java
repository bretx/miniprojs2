package miniprojs2;

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
	private Car[] cars;

	/**
	 * Number of cars.
	 */
	private final int nbCars;

	/**
	 * get the number of car in the game
	 * @return the number of car
	 */
	public int getNbCars()
	{
		return this.nbCars;
	}

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
		this.nbCars=6;
		int i = 0;
		this.setNbMove(0);
		this.isGameFinished = false;
		this.gameGrid = new Grid();
		this.cars = new Car[this.nbCars];
		this.cars[i] = new Car(new Position(1, 3),2,Direction.EAST);
		i++;
		while (i < this.nbCars)
		{
			this.cars[i] = new Car(new Position(i, i + 1), (i%2)+2, Direction.NORTH );
			// TODO Directions settings
		}
		this.player = new Player();

	}

	/**
	 * Checks if the given move is possible in the current state of the grid
	 * 
	 * @param move The given move
	 * @return true if the move is valid, false if it isn't valid
	 */
	private boolean isMoveValid(Move move)
	{
		Car movedCar = isFrontCar(move.getFrontOfMovedCar());
		Direction directionOfMovedCar;
		
		if (movedCar!= NULL)
		{
			directionOfMovedCar = movedCar.getCarDirection();
			if ((directionOfMovedCar==Direction.EAST || directionOfMovedCar==Direction.WEST) && 
					movedCar.getFrontPosition().getY()==move.getFrontAfterMoving().getY())
			{
				
				for (int i=0; i<Math.abs(movedCar.getFrontPosition().getX()-move.getFrontAfterMoving().getX());i++)
				{
					
				}
			}
			else if ((directionOfMovedCar==Direction.NORTH || directionOfMovedCar==Direction.SOUTH) && 
					movedCar.getFrontPosition().getX()==move.getFrontAfterMoving().getX())
			{
				for (int i=0; i<Math.abs(movedCar.getFrontPosition().getY()-move.getFrontAfterMoving().getY());i++)
				{
					
				}
			}
		}
		
		return false;
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
			this.setNbMove(this.getNbMove() + 1);
			if (this.cars[0].getFrontPosition() == (this.gameGrid.getExit()))
			{
				this.isGameFinished = true;
			}
		}
	}

	/**
	 * Gets the current number of moves of the game
	 * 
	 * @return the number of moves
	 */
	public int getNbMove()
	{
		return this.nbMoves;
	}

	/**
	 * modifies the current number of moves of the game
	 * 
	 * @param nbMove
	 *            number of moves
	 */
	public void setNbMove(int nbMove)
	{
		this.nbMoves = nbMove;
	}
	
	/**
	 * Cheks if there is a front of a car at the given position
	 * @param position Position where we want to find a car
	 * @return true if there is a car at the given position, false else
	 */
	public Car isFrontCar(Position position)
	{
		int i=0;
		while (i < this.nbCars)
		{
			if (this.cars[i].getFrontPosition() == position)
				return this.cars[i];
		}
		return NULL;
	}
}
