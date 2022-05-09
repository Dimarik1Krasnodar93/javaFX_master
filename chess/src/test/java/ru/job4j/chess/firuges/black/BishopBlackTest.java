package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.*;
import ru.job4j.chess.firuges.Cell;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void positionTest() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        int x = bishopBlack.position().getX();
        int y = bishopBlack.position().getY();
        int xExpected = 0;
        int yExpected = 7;
        Assert.assertEquals(x, xExpected);
        Assert.assertEquals(y, yExpected);
    }

    @Test
    public void copyTest() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        BishopBlack bishopBlack2 = (BishopBlack) bishopBlack.copy(bishopBlack.position());
        Cell cell = bishopBlack2.position();
        int x = bishopBlack.position().getX();
        int y = bishopBlack.position().getY();
        int xExpected = 0;
        int yExpected = 7;
        Assert.assertEquals(x, xExpected);
        Assert.assertEquals(y, yExpected);
    }

    @Test
    public void wayTest() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] cellWay = bishopBlack.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Assert.assertEquals(cellWay, expected);
    }
}