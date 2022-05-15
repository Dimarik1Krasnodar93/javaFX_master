package ru.job4j.chess;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

import java.io.IOException;

public class LogicTest {

    @Test
    public void move()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        try {
            logic.move(Cell.C1, Cell.H6);
        } catch (OccupiedCellException ex) {
            Assert.assertEquals("Ячейка уже занята", ex.getMessage());
        }
    }

    @Test (expected =  ImpossibleMoveException.class)
    public void moveImpossibleMove()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        try {
            logic.move(Cell.C1, Cell.C2);
        } catch (ImpossibleMoveException ex) {
            ex.getMessage();
        }
    }

    @Test
    public void moveFigureNotFoundException()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C4));
        try {
            logic.move(Cell.C1, Cell.C2);
        } catch (FigureNotFoundException ex) {
            Assert.assertEquals("Фигуры нет в клетке", ex.getMessage());
        }
    }
}