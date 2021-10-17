package com.lab1;

import java.util.ArrayList;

public class Prismas {

    public ArrayList<RightSquarePrism> list;

    public Prismas() {
        this.list = new ArrayList<>();
    }

    /*
        public double getMax() {
            // ArrayList<RightSquarePrism> list= new ArrayList<>();
            int maxIndex = 0;
            double max = 0;
            // Square[] squares= new Square[maxIndex];
            for (int i = 0; i < squares[i].length; i++) {
                if (squares[i].getDiagon() > max) {
                    max = squares[i].getDiagon();
                    maxIndex = i;
                }
            }
            return max;
        }
    */
    public double getMaxDiagon() {
        int maxIndex = 0;
        double max = 0;

        //   for (final Square square : squares) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getDiagon() > max) {
                max = list.get(i).getDiagon();
                maxIndex = i;
                // maxIndex = i;
                //area += list.g;
            }

            // return max / square.length;
            // }
        }
        return max;
    }
}

