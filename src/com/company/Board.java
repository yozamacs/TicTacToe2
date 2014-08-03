package com.company;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

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

    public boolean hasWin() {
        String winnerString = " ";
        List<Integer []> lines = new ArrayList<Integer[]>();
        lines.add(new Integer[]{0,1,2});
        lines.add(new Integer[]{3,4,5});
        lines.add(new Integer[]{6,7,8});
        lines.add(new Integer[]{0,3,6});
        lines.add(new Integer[]{1,4,7});
        lines.add(new Integer[]{2,5,8});
        lines.add(new Integer[]{0,4,8});
        lines.add(new Integer[]{2,4,6});
        for (Integer [] line:lines){
               if(isWin(line)){
                winnerString = positions[line[0]];
                 printWinner(winnerString);
                return true;
                }
            }
            return false;
    }

    private boolean isWin(Integer[] selection) {
        if(positions[selection[0]].equals(positions[selection[1]])&&positions[selection[1]].equals(positions[selection[2]])&&!positions[selection[0]].equals(" ")){
            return true;
        }
        return false;
    }

    private void printWinner(String winnerString) {
        int winnerNumber = 0;
        if(winnerString=="X"){
            winnerNumber = 1;
        }
        else if(winnerString=="O"){
            winnerNumber = 2;
        }
        out.println("Player " + winnerNumber + " wins");
    }
}
