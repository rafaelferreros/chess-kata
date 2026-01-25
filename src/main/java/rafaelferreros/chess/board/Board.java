package rafaelferreros.chess.board;

import java.util.stream.*;

public record Board(byte[] spaces) {

    public void printBoard() {
        for (int i = 0; i < 64; i++) {
            if (spaces[i] == 0) {
                System.out.print(". ");
            } else {
                Piece piece = Piece.fromCode(spaces[i]);
                System.out.print(piece.getUnicode() + " ");
            }

            if (i % 8 == 7) {
                System.out.println();
            }
        }
    }
}
