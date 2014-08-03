package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by maryumstyles on 8/2/14.
 */
public class Player {
    private Board board;
    private BufferedReader reader;
    private PrintStream out;
    private String symbol;
    private String title;


    public Player(Board board, BufferedReader reader, PrintStream out, String symbol, String title) {
        this.board = board;
        this.reader = reader;
        this.out = out;
        this.symbol = symbol;
        this.title = title;
    }

    public void move() {
        out.println(title + " enter a location between 1 and 9");
        String position = getInput();
        boolean moveIsValid = board.mark(position, symbol);
        while(!moveIsValid) {
            out.println("Try Again");
            symbol = getInput();
            moveIsValid = board.mark(position, symbol);
        }
    }

    private String getInput() {
        String inputLn = "";
        try {
            inputLn = reader.readLine();
            if(inputLn.length()==0){
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputLn;
    }
}
