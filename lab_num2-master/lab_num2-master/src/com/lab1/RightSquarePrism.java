package com.lab1;

public class RightSquarePrism extends Square {
    private double height;

    public RightSquarePrism(double sideLength, double height) {
        super(sideLength);
        setHeight(height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height > 0 ? height : -1;
    }

    public double getVolume() {
        return super.getArea() * getHeight();
    }

    /*
        @Override
        public void move(Square side) {
            super.move(side);
            System.out.println(this.getClass().getSimpleName());
        }
    */
    @Override
    public String toString() {
        return "Prism{" + "side = " + getSideLength()
                + ", height=" + height + ", capacity = " + this.getVolume() + '}';
    }

}
