package ru.job4j.chess;

public class FigureNotFoundException extends Exception {
    public FigureNotFoundException() {
        super("Фигуры нет в клетке");
    }
}
