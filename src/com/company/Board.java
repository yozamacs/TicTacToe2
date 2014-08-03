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

    public boolean mark(String position, String symbol) {
        int location = Integer.parseInt(position) - 1;
        if (positions[location]==" ") {
            positions[location] = symbol;
            draw();
            return true;
        }
        else {
            out.println("Location already taken");
            return false;
        }
    }

    public boolean isFull() {
        int counter = 0;
        for(int i=0;i<positions.length;i++){
            if(positions[i]!=" "){
                counter++;
            }
        }
        if(counter==positions.length){
            out.println("Game is a draw");
            return true;
        }
        return false;
    }
}
