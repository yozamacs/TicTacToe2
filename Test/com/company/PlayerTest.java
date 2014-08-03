package com.company;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class PlayerTest {



    @Test
    public void whenPlayerMovesBoardDrawsPlayersSymbolInPosition() throws IOException {
        Board board = mock(Board.class);
        BufferedReader reader = mock(BufferedReader.class);
        PrintStream out = mock(PrintStream.class);
        Player player = new Player(board, reader, out, "player");
        when(reader.readLine()).thenReturn("1").thenReturn("X");
        player.move();
        verify(board).mark("1","X");
    }

}