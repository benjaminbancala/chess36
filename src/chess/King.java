package chess;
/**
 * 
 * @author Ben Bancala and Michael Shafran
 *
 */

public class King extends Piece{
/**
 * 
 * @param color sets the name of the piece to wK or bK
 */
	public King (char color){
		this.setName(color + "K");
	}
	
	public boolean validMove(String start, String finish) {
		int s1 = start.charAt(0) - 64;
		int s2 = start.charAt(1)-1;	
		
		int f1 = finish.charAt(0) -64;
		int f2 = finish.charAt(1)-1;
		
		if(s1==f1){						//check if moving in same row
			if(s2-f2==1||s2-f2==-1){
				return true;
			}
		}
		
		else if(s2==f2){				//check if moving in same column
			
			if(s1-f1==1||s1-f1==-1){
				return true;
			}else if((s1-f2==2||s1-f2==-2)&&getMoved()==false){
				
				
				
				
				
				//IMPLEMENT CASTLING
				
				
				
				
				
			}
		}
		
		else{							//check if moving 1 diagonally
			if((s1-f1==1||s1-f1==-1)&&(s2-f2==1||s2-f2==-1)){
				return true;
			}
		}
		
		return false;
	}

}
