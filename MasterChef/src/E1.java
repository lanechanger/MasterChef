import java.util.Scanner;

/* https://www.codechef.com/problems/E1
 * Practice --> Easy --> The White Knight
 */
class E1 {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int T = input.nextInt();

			while (T-- > 0) {
				// get size of the chessboard
				int N = input.nextInt();
				// make a more friendly board out of the original string input
				// [x][x][0] will be where the original board is stored, [x][x][1] for the temp.
				// results to avoid redundant calculations
				int[][][] board = new int[N][N][2];
				int knightRow = 0;
				int knightCol = 0;

				for (int i = 0; i < N; i++) {
					String line = input.next().toLowerCase();
					for (int j = 0; j < N; j++) {
						if (line.charAt(j) == 'k') { // knight coordinates found
							knightRow = i;
							knightCol = j;
						} else if (line.charAt(j) == 'p') { // pawn found
							board[i][j][0] = 1;
						}

					}
				}
				System.out.println(score(board, knightRow, knightCol));
			}
		}
	}

	private static int score(int[][][] board, int knightRow, int knightCol) {
		// base case: score 0 when the knight eventually moves out of bounds
		// submission timed out, blocking this out and embedding it below
		/*
		 * if (knightRow < 0 || knightRow >= board.length || knightCol >= board.length)
		 * { return 0; }
		 */

		// if we've already calculated this, save the redundancy and return it
		if (board[knightRow][knightCol][1] != 0) {
			return board[knightRow][knightCol][1];
		}

		int move1 = 0;
		int move2 = 0;
		int move3 = 0;
		int move4 = 0;

		// recurse over all 4 possible moves but don't bother if it goes beyond board
		// length
		if (knightRow - 2 >= 0 && knightCol + 1 < board.length) {
			move1 = score(board, knightRow - 2, knightCol + 1);
		}
		if (knightRow - 1 >= 0 && knightCol + 2 < board.length) {
			move2 = score(board, knightRow - 1, knightCol + 2);
		}
		if (knightRow + 1 < board.length && knightCol + 2 < board.length) {
			move3 = score(board, knightRow + 1, knightCol + 2);
		}
		if (knightRow + 2 < board.length && knightCol + 1 < board.length) {
			move4 = score(board, knightRow + 2, knightCol + 1);
		}

		// now we can mark down and return the max value for this location
		int result = board[knightRow][knightCol][0] + Math.max(move1, Math.max(move2, Math.max(move3, move4)));
		board[knightRow][knightCol][1] = result;
		return result;
	}
}