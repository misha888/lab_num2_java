package com.lab1;

import java.util.Arrays;

public class Squares {
    private Square[] squares;

    public Squares() {
        squares = new Square[0];
    }

    public Squares(int length) {
        this.squares = new Square[length];
    }

    public Square[] getSquares() {
        return squares;
    }

    public void setSquareAt(int index, Square square) {
        squares[index] = square;
    }

    public void add(Square square) {
        int n = 0;
        for (Square square1 : squares)
            if (square1 == null)
                break;
            else
                n++;

        //  if (squares.length == n)
        //    resize(n+1);

        setSquareAt(n, square);
    }

    public void resize(int newLength) {
        Square[] tempSquares = new Square[newLength];
        {
            tempSquares = Arrays.copyOf(squares, newLength);
        }
        squares = tempSquares;
    }

    public double getMax() {
        int maxIndex = 0;
        double max = 0;
        for (int i = 0; i < squares.length; i++) {
            if (squares[i].getArea() > max) {
                max = squares[i].getArea();
                maxIndex = i;
            }
        }
        return max;
    }
}
