package com.lab1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Square {
    double sideLength;
    public  Square() {
    }
    public  Square(double sideLength) {this.sideLength = sideLength;}

    public static double checkSides(double value){
        return (value) > 0 ? (value) : -1;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength > 0 ? sideLength : -1;
    }

    public double getPerimetr() {
        return this.sideLength*4;
    }


    public double getArea() {
        return this.sideLength*this.sideLength;
    }


    public double getDiagon() {
        return Math.sqrt(2)*this.sideLength;
    }


    @Override
    public String toString() {
        return this.sideLength>0 ?
         String.format("Square{" +
                " side =" + String.format("%6.2f",this.sideLength) +
                " perimetr =" + String.format("%6.2f",getPerimetr()) +
                " area =" + String.format("%6.2f",getArea()) +
                " diagonal =" + String.format("%6.2f",getDiagon())+
                '}'): "Error: side = " + this.sideLength;
    }
}
