package rafaelferreros.chess.board;

import org.springframework.stereotype.*;

@Service
public class BoardService {

    public Board initializeBoard() {

        byte[] boardMatrix = new byte[64];

        boardMatrix[0] = Piece.BLACK_ROOK_INIT.getCode();
        boardMatrix[1] = Piece.BLACK_KNIGHT.getCode();
        boardMatrix[2] = Piece.BLACK_BISHOP.getCode();
        boardMatrix[3] = Piece.BLACK_QUEEN.getCode();
        boardMatrix[4] = Piece.BLACK_KING_INIT.getCode();
        boardMatrix[5] = Piece.BLACK_BISHOP.getCode();
        boardMatrix[6] = Piece.BLACK_KNIGHT.getCode();
        boardMatrix[7] = Piece.BLACK_ROOK_INIT.getCode();
        boardMatrix[8] = Piece.BLACK_PAWN_INIT.getCode();
        boardMatrix[9] = Piece.BLACK_PAWN_INIT.getCode();
        boardMatrix[10] = Piece.BLACK_PAWN_INIT.getCode();
        boardMatrix[11] = Piece.BLACK_PAWN_INIT.getCode();
        boardMatrix[12] = Piece.BLACK_PAWN_INIT.getCode();
        boardMatrix[13] = Piece.BLACK_PAWN_INIT.getCode();
        boardMatrix[14] = Piece.BLACK_PAWN_INIT.getCode();
        boardMatrix[15] = Piece.BLACK_PAWN_INIT.getCode();

        boardMatrix[48] = Piece.PAWN_INIT.getCode();
        boardMatrix[49] = Piece.PAWN_INIT.getCode();
        boardMatrix[50] = Piece.PAWN_INIT.getCode();
        boardMatrix[51] = Piece.PAWN_INIT.getCode();
        boardMatrix[52] = Piece.PAWN_INIT.getCode();
        boardMatrix[53] = Piece.PAWN_INIT.getCode();
        boardMatrix[54] = Piece.PAWN_INIT.getCode();
        boardMatrix[55] = Piece.PAWN_INIT.getCode();
        boardMatrix[56] = Piece.ROOK_INIT.getCode();
        boardMatrix[57] = Piece.KNIGHT.getCode();
        boardMatrix[58] = Piece.BISHOP.getCode();
        boardMatrix[59] = Piece.QUEEN.getCode();
        boardMatrix[60] = Piece.KING_INIT.getCode();
        boardMatrix[61] = Piece.BISHOP.getCode();
        boardMatrix[62] = Piece.KNIGHT.getCode();
        boardMatrix[63] = Piece.ROOK_INIT.getCode();


        return new Board(boardMatrix);
    }



}
