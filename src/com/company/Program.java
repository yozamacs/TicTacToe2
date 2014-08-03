package com.company;

/**
 * Created by maryumstyles on 8/2/14.
 */
public class Program {
    private Board board;
    private Player player1;
    private Player player2;

    public Program(Board board, Player player1, Player player2) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        board.draw();
        while(!board.isFull()) {
            player1.move();
            player2.move();
        }
    }

}
