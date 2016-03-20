package chess;
/**
 * 
 * @author Ben Bancala and Michael Shafran
 *
 */
public class Queen extends Piece{
/**
 * 
 * @param color sets the name to wQ or bQ
 */
	public Queen (char color){
		this.setName(color + "Q");
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
		
		int lr;
		int sr;
		int lc;
		int sc;
		
		if(s1>f1){	
			lr = s1;
		}else{
			lr = f1;
		}
		
		if(s1<f1){
			sr = s1;
		}else{
			sr = f1;
		}
		
		if(s2>f2){
			lc = s2;
		}else{
			lc = f2;
		}
		
		if(s2<f2){
			sc = s2;
		}else{
			sc = f2;
		}
		
		if((lr-sr)==(lc-sc)){   //if the amount of moves in columns = rows you are moving diagonally.
			return true;
		}
		
		return false;
	}

}
