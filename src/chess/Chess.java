package chess;
/**
 * 
 * @author Ben Bancala and Michael Shafran
 *
 */


import java.util.Scanner;

public class Chess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board b = new Board();
		Scanner in = new Scanner(System.in);
		String move;
		boolean whiteturn = true;
		boolean nocheckmate = true;
		
		move = in.next();
		System.out.println(formatMove(move));
		
//		while(nocheckmate){
//			System.out.println(b);
//			if(whiteturn)
//				System.out.println("White's move:");
//			else
//				System.out.println("Black's move:");
//			move = in.next();
//			
//			nocheckmate = b.getNoCheckmate();
//			
//		}

	}
	public static boolean formatMove(String move){
		String moveString = "([a-h][1-8])(\\b)";
		return move.matches(moveString);
		
	}

}
