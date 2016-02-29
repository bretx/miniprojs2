package miniprojs2;

/**
 * Represents a game of rush hour
 * @author bretx
 * 
 */
public class RushHourGame
{
	
	/**
	 * counter of the numbers of moves
	 */
	private int nbmove;
	/**
	 * allow to check if the game has ended or not
	 */
	private boolean finish;
	private final Grid gamegrid;
	/**
	 * Position of the red car
	 */
	private Position redcar;
	/**
	 * List of the blue cars' positions
	 */
	private Position[] bluecar;
	/**
	 * List of the blue trucks' positions
	 */
	private Position[] bluetruck;
	
	/**
	 * Create a new Rush Hour game which move counter is set to 0
	 * a grid is created with the cars and trucks placed on it
	 */
	public RushHourGame()
	{
		int i=0;
		this.nbmove =0;
		this.finish = false;
		this.gamegrid = new Grid();
		this.redcar = new Position();
		while (i<=4)
	}
	
	
}
