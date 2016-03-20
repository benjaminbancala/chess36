package chess;

public abstract class Piece {
	private boolean moved = false;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String in) {
		name = in;
	}
	public boolean getMoved(){
		return moved;
	}
	public void move(){
		moved = true;
	}
	public abstract boolean validMove(String start, String finish);

}
