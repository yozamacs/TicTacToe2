package com.company;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BoardTest {

    private PrintStream out;
    private Board board;
    String[] positions = {" "," "," "," "," "," "," "," "," "};

    @Before
    public void setUp() throws Exception {
        out = mock(PrintStream.class);
        board = new Board(out, positions);
    }

    @Test
    public void shouldPrintBoardOnScreenWhenDrawBoardIsCalled(){
        board.draw();
        verify(out).println("\n  |   |  \n---------\n  |   |  \n---------\n  |   |  \n");
    }

    @Test
    public void shouldPrintSymbolInPositionOnScreenWhenMarkBoardIsCalled(){
        board.mark("1","X");
        verify(out).println("\nX |   |  \n---------\n  |   |  \n---------\n  |   |  \n");
    }

    @Test
    public void shouldPreventMarkingInTakenSpotWhenMarkBoardIsCalledOnTakenSpot(){
        board.mark("1","X");
        board.mark("1","X");
        verify(out).println("Invalid move");
    }
}