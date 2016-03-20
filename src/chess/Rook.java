package chess;
/**
 * 
 * @author Ben Bancala and Michael Shafran
 *
 */
public class Rook extends Piece{
/**
 *  
 * @param color sets name to bR or wR
 */
	public Rook (char color){
		this.setName(color + "R");
	}
	public boolean validMove(String start, String finish) {
		int s1 = start.charAt(0) - 64;
		int s2 = start.charAt(1)-1;	
		
		int f1 = finish.charAt(0) -64;
		int f2 = finish.charAt(1)-1;
		
		if(s1==f1&&s2!=f2){	//same row. can move any amount of spaces.
			return true;
		}else if(s1!=f1&&s2==f2){	//same column. can move any amount of spaces.
			return true;
		}
		
		return false;
	}

}
