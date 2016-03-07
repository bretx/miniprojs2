package miniprojs2;

// TODO update comment (find a link to a description of the game, in english)
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
	private int nbmove;
	
	/**
	 * allow to check if the game has ended or not
	 */
	private boolean finish;
	
	// TODO (done) write comment
	/**
	 * grid of the game
	 */
	private final Grid gamegrid;
	
	// TODO (done) instead of positions, consider representing cars as objects
	/**
	 * cars that are on the grid (first car is the red one)
	 */
	private Car[] cars;
	
	// TODO (done) fix comment (ask for advice)
	/**
	 * Create a new Rush Hour game,  ready to be played
	 * The grid is placed with cars on it and the move counter is set at 0 
	 * and the game isn't finished
	 */
	public RushHourGame()
	{
		this.nbmove =0;
		this.finish = false;
		this.gamegrid = new Grid();
		
	}

	/**
	 * Play the game (...)
	 */
	public void play()
	{
		// TODO Auto-generated method stub
		
	}
	
	
}
