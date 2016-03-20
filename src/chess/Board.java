package chess;
/**
 * 
 * @author Ben Bancala and Michael Shafran
 *
 */
public class Board {
	private Piece[][] theBoard;
	public Board(){
		theBoard = new Piece[8][8];
		for(int i = 0; i<theBoard.length; i++){
			for(int j = 0; j<theBoard[i].length; j++){
				theBoard[i][j] = null;
			}
		}
	}
	public String toString(){
		String output = "";
		for(int i = theBoard.length-1; i>=0; i--){
			for(int j = 0; j<theBoard[i].length; j++){
				if(theBoard[i][j] != null)
					output += theBoard[i][j];
				else{
					if((i%2 == 0 && j%2 == 0) || (i%2 == 1 && j%2 == 1))
						output += "## ";
					else
						output += "   ";
				}
					
			}
			output += i+1;
			output += "\n";
		}
		output += " a  b  c  d  e  f  g  h";
		return output;
	}
	public boolean getNoCheckmate(){
		return true;
	}

}
