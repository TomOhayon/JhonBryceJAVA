package ticTacToe;

public class Game {
	// ---------properties--------
	private static int gameCount;
	char board[][] = new char[3][3];
	// -----------get+set----------

	public static int getGameCount() {
		return gameCount;
	}

	public static void setGameCount(int gameCount) {
		Game.gameCount = gameCount;
	}

	public char[][] getBoard() {
		return board;
	}

	public void setBoard(char[][] board) {
		this.board = board;
	}

	// -------------constructor-------

	public Game() {
		this.StartGame();
	}

	// -----------functions----------

	public void StartGame() {
		int k = 1;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = (char) (k + 48);
				k++;
			}
		}
	}

	public void changeCell(int cellNum, char turnPlayer) {
		int k = 1;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (k == cellNum) {
					if (board[i][j] != 'x' && board[i][j] != 'o') {
						(board[i][j]) = (char) turnPlayer;
					}
				}
				k++;
			}
		}
	}

	public void checkWin(char turnPlayer) {
		boolean win = false;
		for (int i = 0; i < board.length; i++) {
			// rows&columns
			if (board[i][0] == board[i][1] && board[i][0] == board[i][2]
					|| board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
				win = true;
			}
			// diagonal
			else {
				if (board[0][0] == board[1][1] & board[0][0] == board[2][2]
						|| board[2][0] == board[1][1] & board[0][0] == board[0][2]) {
					win = true;
				}
			}
		}
		System.out.println("player " + turnPlayer + " has won?:" + win);

	}

	public void printBoard() {
		System.out.println("-------------");
		for (int i = 0; i < 3; i++) {
			System.out.print("| ");
			for (int j = 0; j < 3; j++) {
				System.out.print((char) board[i][j] + " | ");
			}
			System.out.println();
			System.out.println("-------------");
		}
	}

	public void checkValid() {

	}
}
