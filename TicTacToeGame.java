package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	
	public static char playerSymbol;
	public static char cpuSymbol;
	static char[] board = new char[10];
	
	public static char[] createBoard() {
		char[] board = new char[10];
		for(int i=0;i<9;i++) {
			board[i]= '-';
		}
		return board;	
	}
	public static void showBoard() {
		System.out.println("**Play Board Display**\n");
		System.out.println(" | "+board[0]+" "+board[1]+" "+board[2]+" |\n");
		System.out.println(" | "+board[3]+" "+board[4]+" "+board[5]+" |\n");
		System.out.println(" | "+board[6]+" "+board[7]+" "+board[8]+" |\n");

	}
	
	public static void main(String[] args) {
		char[] board = createBoard();
		System.out.println("Select the Letter you wanted \n  press 1 . Choose X \n  Press 2 . Choose O\n\nEnter your Choice : ");
		Scanner scan =new Scanner(System.in);
		int choice = scan.nextInt();
		switch(choice){
			case 1 : {
				playerSymbol='X';
				cpuSymbol='O';
				break;
			}
			case 2 :{
				playerSymbol='O';
				cpuSymbol='X';
				break;
			}
			default: {
				System.out.println("Invalid Choice . Retry Again!");
				return;
			}
			
		}
		
		TicTacToeGame.showBoard();
	
	}

}


