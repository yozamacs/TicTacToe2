package com.company;

import java.io.PrintStream;

/**
 * Created by maryumstyles on 8/2/14.
 */
public class Board {
    private PrintStream out;
    private String[] positions;

    public Board(PrintStream out, String[] positions) {
        this.out = out;
        this.positions = positions;
    }

    public void draw() {
        out.println("\n"+positions[0]+" |"+positions[1]+"  | "+positions[2]+"\n---------\n"+positions[3]+" |"+positions[4]+"  | "+positions[5]+"\n---------\n"+ positions[6]+" |"+positions[7]+"  | "+positions[8]+"\n");
    }

    public void mark(String position, String symbol) {
        int location = Integer.parseInt(position) - 1;
        if (positions[location]==" ") {
            positions[location] = symbol;
            draw();
        }
        else
            out.println("Invalid Move");
    }
}