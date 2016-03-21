package miniprojs2;

/**
 * Represents a game of rush hour, 
 * https://en.wikipedia.org/wiki/Rush_Hour_%28board_game%29
 * @author bretx
 * 
 */
public class RushHourGame
{
	/**
	 * counter of the numbers of moves
	 */
	private int nbMove;
	
	/**
	 * allow to check if the game has ended or not
	 */
	private boolean finish;
	
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
	private int nbCars;

	/**
	 * Player who's giving instructions to move the cars
	 */
	private Player player;
	
	/**
	 * Create a new Rush Hour game,  ready to be played
	 * The grid is setup with cars on it and the move counter is set at 0 
	 * and the game isn't finished
	 */
	public RushHourGame()
	{
		int i=0;
		this.nbMove =0;
		this.finish = false;
		this.gameGrid = new Grid();
		this.cars = new Car[this.nbCars];
		this.cars[i] = new Car(new Position(0,3), new Position(1,3));
		i++;
		while (i<this.nbCars){
			this.cars[i] = new Car(new Position(i,i+1), new Position(i+2,i+1));
		}
		this.player = new Player();
		
	}
	
	/**
	 * Checks if the given move is possible in the current state of the grid
	 * @param move The given move
	 * @return true if the move is valid, false if it isn't valid
	 */
	private boolean isMoveValid(Move move)
	{
		int a = 0;
		
		while (a < this.nbCars)
		{
			if (a!=move.getNumCar() &&
				((move.getCarAfterMoving().getFrontPosition().getX() == this.cars[a].getFrontPosition().getX()) ||
				(move.getCarAfterMoving().getFrontPosition().getX() == this.cars[a].getRearPosition().getX())))		
				{
				}
		}
		return true;
	}

	/**
	 * Play the game i.e : it starts a loop in which the player have to make his moves 
	 * until he wins or give up, the total number of moves and total time are
	 * counted. 
	 * while (game is not over)
	 * 	do
	 *   <ask player for a move>
	 *  while (<move is not valid>)
	 *  <process move>
	 *  update counter
	 *  update game status
	 */
	public void play()
	{	
		while (!(this.finish))
		{
			Move move = null;
			do 
			{
				move = this.player.getMove();
			}
			while (!this.isMoveValid(move));
			this.cars[move.getNumCar()].setPosition(move.getCarAfterMoving());
			this.nbMove++;
			if (this.cars[0].getFrontPosition() == (this.gameGrid.getExit()))
			{
				this.finish=true;
			}
		}
	}
}
