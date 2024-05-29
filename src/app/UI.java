package app;

import chess.ChessPiece;

public class UI {
	public static void printBoard(ChessPiece[][] pieces) {
		for(int i = 0; i < pieces.length; i++) {
			System.out.print((8 - i) + " "); //para imprimir o numero da linha
			for(int j = 0; j < pieces.length; j++) {
				printPiece(pieces[i][j]);
			}
			System.out.println(); //para dar uma quebra de linha ao terminar de imprimir uma linha
		}
		System.out.print("  a b c d e f g h");
	}
	
	private static void printPiece(ChessPiece piece) {
		if(piece == null) {
			System.out.print("-");
		} else {
			System.out.print(piece);
		}		
		System.out.print(" ");
	}
}
