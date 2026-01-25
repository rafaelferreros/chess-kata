package rafaelferreros.chess;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import rafaelferreros.chess.board.*;

@SpringBootApplication
public class ChessKataApplication implements CommandLineRunner {

    public ChessKataApplication(BoardService boardService) {
        this.boardService = boardService;
    }

    static void main(String[] args) {
        SpringApplication.run(ChessKataApplication.class, args);
    }

    private final BoardService boardService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("App started!");
        Board board = boardService.initializeBoard();
        board.printBoard();
    }
}
