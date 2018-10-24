package ticTacToe;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Game B = new Game();
		B.StartGame();
		B.printBoard();
		B.changeCell(1, 'x');
		B.changeCell(5, 'x');
		B.changeCell(9, 'x');
		B.printBoard();
		B.checkWin('x');

	}

}
