package com.dublez.study.itanton.lesson_00.hw.figures;

import java.util.Arrays;

public class Triangle extends FlatFigure implements HasInscribedCircle, HasOutscribedCircle{
    double[] sideLengths = new double[3];

    public Triangle(double side0, double side1, double side2) {
        this.sideLengths[0] = side0;
        this.sideLengths[1] = side1;
        this.sideLengths[2] = side2;
    }

    @Override
    public double getPerimeter() {
        return Arrays.stream(sideLengths).sum();
    }

    @Override
    public double getSquare() {
        double s = this.getPerimeter() / 2;
        return Util.roundDecimal(Math.sqrt(s * (s - sideLengths[0]) * (s - sideLengths[1]) * (s - sideLengths[2])));
    }

    @Override
    public double getInscribedCircleRadius() {
        double s = this.getPerimeter() / 2;
        return Util.roundDecimal(this.getSquare() / s);
    }

    @Override
    public double getOutscribedCircleRadius() {
        return Util.roundDecimal(sideLengths[0] * sideLengths[1] * sideLengths[2] / (4 * this.getSquare()));
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "||" +
                " Perimeter: "+getPerimeter()
                + ", Square: "+ getSquare()
                + ", InscribedCircleRadius: " + getInscribedCircleRadius()
                + ", OutscribedCircleRadius: " + getOutscribedCircleRadius();
    }
}
