package chess;
/**
 * 
 * @author Ben Bancala and Michael Shafran
 *
 */
public class Pawn extends Piece{
/**
 * 
 * @param color sets the name to wp or bp
 */
	public Pawn (char color){
		this.setName(color + "p");
	}
	
	public boolean validMove(String start, String finish) {
		int s1 = start.charAt(0) - 64;
		int s2 = start.charAt(1)-1;	
		
		int f1 = finish.charAt(0) -64;
		int f2 = finish.charAt(1)-1;
		
		if(this.getName().charAt(0)=='w'){	//cant go backwards
			if(f1-s1>=1){
				return false;
			}
		}else{
			if(f1-s1<1){
				return false;
			}
		}
		
		
		if(this.getMoved()==false){	//can go 2 spaces on its first move
			if(s2==f2&&(s1-f1==2||s1-f1==-2)){
				return true;
			}else if(s2==f2&&(s1-f1==1||s1-f1==-1)){
				return true;
			}
		}else{
			if(s2==f2&&(s1-f1==1||s1-f1==-1)){
				return true;
			}
		}
		
		if(s2-f2!=1||s2-f2!=-1){	//can go diagonally if it is trying to capture
			return false;
		}else{
		
			if(this.getName().charAt(0)=='w'){
				if(s1-f1==1){
					return true;
				}
			}else{
				if(f1-s1==1){
					return true;
				}
			}
		}
		return false;
	}

}
