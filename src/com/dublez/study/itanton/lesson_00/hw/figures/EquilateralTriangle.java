package com.dublez.study.itanton.lesson_00.hw.figures;

public class EquilateralTriangle extends Triangle implements IsRegularFigure {
    double sideLength;

    public EquilateralTriangle(double sideLength) {
        super(sideLength, sideLength, sideLength);
        this.sideLength = sideLength;
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public double getSquare() {
        return super.getSquare();
    }

    @Override
    public double getSideLength() {
        return sideLength;
    }

    @Override
    public double getInscribedCircleRadius() {
        return super.getInscribedCircleRadius();
    }

    @Override
    public double getOutscribedCircleRadius() {
        return super.getOutscribedCircleRadius();
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
