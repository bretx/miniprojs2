package miniprojs2;

/**
 * Represents a game of rush hour, 
 * https://en.wikipedia.org/wiki/Rush_Hour_%28board_game%29
 * @author bretx
 * 
 */
public class RushHourGame
{
	
	//TODO rename field (non compliant with coding conventions)
	/**
	 * counter of the numbers of moves
	 */
	private int nbmove;
	
	/**
	 * allow to check if the game has ended or not
	 */
	private boolean finish;
	
	//TODO rename field (non compliant with coding conventions)
	/**
	 * grid of the game
	 */
	private final Grid gamegrid;
	
	/**
	 * cars that are on the grid (first car is the red one)
	 */
	private Car[] cars;
	
	/**
	 * Create a new Rush Hour game,  ready to be played
	 * The grid is setup with cars on it and the move counter is set at 0 
	 * and the game isn't finished
	 */
	public RushHourGame()
	{
		this.nbmove =0;
		this.finish = false;
		this.gamegrid = new Grid();
		
	}

	// TODO detail (algorithm)
	/**
	 * Play the game (...)
	 */
	public void play()
	{
		// TODO Auto-generated method stub
		
	}
	
	
}
