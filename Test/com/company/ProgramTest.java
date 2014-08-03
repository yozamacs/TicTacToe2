package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ProgramTest {

    private Program program;
    private Board board;
    private Player player1;
    private Player player2;

    @Before
    public void setUp() throws Exception {
        board = mock(Board.class);
        player1 = mock(Player.class);
        player2 = mock(Player.class);
        program = new Program(board, player1, player2);

    }

    @Test
    public void WhenProgramStartsDrawBoard(){
        program.start();
        verify(board).draw();
    }

    @Test
    public void promptPlayer1ToMoveOnStart(){
        program.start();
        verify(player1).move();
    }

    @Test
    public void promptPlayer2ToMoveOnStart(){
        program.start();
        verify(player2).move();
    }

}