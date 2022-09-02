package com.dublez.study.itanton.lesson_00.hw.figures;

public class Square extends RegularPolygon{

    public Square(double sideLength) {
        super(4, sideLength);
    }

    @Override
    public double getSideLength() {
        return super.sideLength;
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public double getSquare() {
        return Math.pow(this.getSideLength(), 2);
    }

    @Override
    public double getInscribedCircleRadius() {
        return this.getSideLength() / 2;
    }

    @Override
    public double getOutscribedCircleRadius() {
        return Util.roundDecimal(this.getSideLength() / Math.sqrt(2));
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "||" +
                " Perimeter: "+getPerimeter()
                + ", Square: "+ getSquare()
                + ", SideLength: " + getSideLength()
                + ", InscribedCircleRadius: " + getInscribedCircleRadius()
                + ", OutscribedCircleRadius: " + getOutscribedCircleRadius();
    }
}
