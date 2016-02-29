package miniprojs2;

public class Position
{
	private static final int DEFAULT_X = 0;
	private static final int DEFAULT_Y = 0;
	
	private final int x;
	private final int y;
	
	public Position()
	{
		this.x = Position.DEFAULT_X;
		this.y = Position.DEFAULT_Y;
	}
	
	public Position(int x0, int y0)
	{
		this.x = x0;
		this.y = y0;
	}
	
}
