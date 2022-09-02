package com.dublez.study.itanton.lesson_00.hw.figures;

public class Circle extends FlatFigure{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return Util.roundDecimal(2 * Math.PI * radius);
    }

    @Override
    public double getSquare() {
        return Util.roundDecimal(Math.PI * Math.pow(radius, 2));
    }
}
