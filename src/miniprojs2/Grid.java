package miniprojs2;

public class Grid
{
	/**
	 *  Default height of the grid
	 */
	private static final int DEFAULT_HEIGHT = 6;
	/**
	 * Default lenght of the grid
	 */
	private static final int DEFAULT_LENGHT = 6;
	
	
	private final int height;
	private final int lenght;
	private final Position exit;
	/*private final Position[] toleft;
	private final Position[] toright;
	private final Position[] totop;
	private final Position[] tobottom;*/
	
	public Grid()
	{
		this.height = Grid.DEFAULT_HEIGHT;
		this.lenght = Grid.DEFAULT_LENGHT;
		Position exit = new Position();
		this.exit= exit;
	}
	
	public Grid(int H, int L, Position E)
	{
		this.height = H;
		this.lenght = L;
		this.exit = E;
	}
	
}
