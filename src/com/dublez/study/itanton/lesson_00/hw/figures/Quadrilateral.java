package com.dublez.study.itanton.lesson_00.hw.figures;

import java.util.Arrays;

public class Quadrilateral extends FlatFigure{
    double[] diagonals = new double[2];
    double[] sideLengths = new double[4];
    double angle;

    public Quadrilateral(double diag0, double diag1, double angle, double side0, double side1, double side2, double side3) {
        this.diagonals[0] = diag0;
        this.diagonals[1] = diag1;
        this.sideLengths[0] = side0;
        this.sideLengths[1] = side1;
        this.sideLengths[2] = side2;
        this.sideLengths[3] = side3;
        this.angle = angle;
    }
    @Override
    public double getPerimeter() {
        return Util.roundDecimal(Arrays.stream(sideLengths).sum());
    }

    @Override
    public double getSquare() {
        return Util.roundDecimal(diagonals[0] * diagonals[1] * Math.sin(angle) / 2);
    }
}
