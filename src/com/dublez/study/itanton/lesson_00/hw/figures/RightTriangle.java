package com.dublez.study.itanton.lesson_00.hw.figures;

public class RightTriangle extends Triangle{
    double[] legLengths = new double[2];

    public RightTriangle(double side0, double side1) {
        super(side0, side1, Util.roundDecimal(Math.sqrt(Math.pow(side0,2) + Math.pow(side1,2))));
        this.legLengths[0] = side0;
        this.legLengths[1] = side1;
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public double getSquare() {
        return Util.roundDecimal(legLengths[0] * legLengths[1] / 2);
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
                + ", InscribedCircleRadius: " + getInscribedCircleRadius()
                + ", OutscribedCircleRadius: " + getOutscribedCircleRadius();
    }
}
