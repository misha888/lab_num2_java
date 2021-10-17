package com.lab1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nPart of squares:");

        Scanner scanner= new Scanner(System.in);
        Square square;
        double side = -1;
        while (Square.checkSides((side = Math.random() * 11 - 5)) < 0) {
           // System.out.println(side);
        }
        square = new Square(side);
        Squares squares = new Squares(5);
        squares.setSquareAt(0, square);

        squares.add(new Square(7));
        squares.add(new Square(6));
        squares.add(new Square(11));
        squares.add(new Square(10));

        for (int i = 0; i < squares.getSquares().length; i++) {
            System.out.println(squares.getSquares()[i]);
        }


        System.out.println("\nSquare with max area:" + squares.getMax());
        for (int i = 0; i < squares.getSquares().length; i++)
            if (squares.getSquares()[i].getArea() == squares.getMax())
                System.out.println(squares.getSquares()[i]);

        System.out.println("\nPart of prismas:");

        RightSquarePrism prism = new RightSquarePrism(5, 4);
        System.out.println(prism);

        Prismas prismas = new Prismas();
        prismas.list.add(prism);
        prismas.list.add(new RightSquarePrism(10,6));
        prismas.list.add(new RightSquarePrism(3,7));

        System.out.println("\nList of prismas:");
        for (int i = 0; i < prismas.list.size(); i++)
            System.out.println(prismas.list.get(i));

        System.out.println("\nPrism with max diagonal:" + String.format("%6.2f",prismas.getMaxDiagon()));
        for (int i = 0; i < prismas.list.size(); i++) {
            if (prismas.list.get(i).getDiagon() == prismas.getMaxDiagon())
                System.out.println(prismas.list.get(i));
        }
    }
}
