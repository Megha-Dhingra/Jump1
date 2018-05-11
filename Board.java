import java.awt.Graphics;

public class Board {
	//private Snake snake;
	private RedThing red; 
	public Board( ) {
		//snake = new Snake();
		red = new RedThing(); 
	}

	public void draw (Graphics g) {
		snake.draw(g);
		red.draw(g); 
	}
}
