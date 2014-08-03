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
    private String title;


    public Player(Board board, BufferedReader reader, PrintStream out, String title) {
        this.board = board;
        this.reader = reader;
        this.out = out;
        this.title = title;
    }

    public void move() {
        out.println(title + " enter a location and symbol separated by the return key to play");
        String position = getInput();
        String symbol = getInput();
        board.mark(position, symbol);
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
