package rafaelferreros.chess.board;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public enum Piece {
    PAWN((byte) 1, '♙'),
    PAWN_INIT((byte) (1 + 10), '♙'),
    PAWN_ADVANCED((byte) (1 + 11),'♙'),
    KNIGHT((byte) 2, '♘'),
    BISHOP((byte) 3, '♗'),
    ROOK((byte) 4, '♖'),
    ROOK_INIT((byte) (4 + 10), '♖'),
    QUEEN((byte) 9, '♕'),
    KING_INIT((byte) 99, '♔'),
    KING((byte) 100, '♔'),

    BLACK_PAWN((byte) -1, '♟'),
    BLACK_PAWN_INIT((byte) (-1 - 10), '♟'),
    BLACK_PAWN_ADVANCED((byte) (-1 - 11), '♟'),
    BLACK_KNIGHT((byte) -2, '♞'),
    BLACK_BISHOP((byte) -3, '♝'),
    BLACK_ROOK((byte) -4, '♜'),
    BLACK_ROOK_INIT((byte) (-4 - 10), '♜'),
    BLACK_QUEEN((byte) -9, '♛'),
    BLACK_KING_INIT((byte) -99, '♚'),
    BLACK_KING((byte) -100, '♚'),
    ;

    private final byte code;

    private final char unicode;

    private static final Map<Byte, Piece> BY_CODE =
            Arrays.stream(values())
                    .collect(Collectors.toUnmodifiableMap(
                            Piece::getCode,
                            Function.identity()
                    ));

    Piece(byte code, char unicode) {
        this.code = code;
        this.unicode = unicode;
    }

    public byte getCode() {
        return code;
    }

    public char getUnicode() {
        return unicode;
    }

    public static Piece fromCode(byte code) {
        return BY_CODE.get(code);
    }




}
