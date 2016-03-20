package chess;
/**
 * 
 * @author Ben Bancala and Michael Shafran
 *
 */
public class Knight extends Piece{
/**
 * 
 * @param color sets the name of the piece to wN or bN
 */
	public Knight(char color){
		this.setName(color + "N");
	}
	
	public boolean validMove(String start, String finish) {
		int s1 = start.charAt(0) - 64;
		int s2 = start.charAt(1)-1;	
		
		int f1 = finish.charAt(0) -64;
		int f2 = finish.charAt(1)-1;
		
		if(s1-f1==2||s1-f1==-2){	//move up or down 2 spaces
			if(s2-f2==1||s2-f2==-1){	//move left or right 1 space
				return true;
			}
		}
		
		if(s2-f2==2||s2-f2==-2){	//move right or left 2 spaces
			if(s1-f1==1||s1-f1==-1){	//move up or down 1 space
				return true;
			}
		}
		
		return false;
	}

}
