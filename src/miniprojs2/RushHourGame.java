package miniprojs2;

// TODO update comment (find a link to a description of the game, in english)
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
	
	// TODO write comment
	private final Grid gamegrid;
	
	// TODO instead of positions, consider representing cars as objects
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
	
	// TODO fix comment (ask for advice)
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
