package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) {
    String[] positions = {" "," "," "," "," "," "," "," "," "};
    Board board = new Board(System.out, positions);
    Player player1 = new Player(board, new BufferedReader(new InputStreamReader(System.in)), System.out, "X","Player 1" );
    Player player2 = new Player(board, new BufferedReader(new InputStreamReader(System.in)), System.out, "O","Player 2" );
    Program program = new Program(board, player1, player2);
    program.start();
    }
}
