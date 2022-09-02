package com.dublez.study.itanton.lesson_00.hw.figures;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.Function;

public class RegularPolygon extends FlatFigure implements IsRegularFigure {
    int sides;
    double sideLength;

    public RegularPolygon(int sides, double sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }

    @Override
    public double getPerimeter() {
        return sides * sideLength;
    }

    @Override
    public double getSquare() {
        return this.getInscribedCircleRadius() * this.getPerimeter() / 2;
    }

    @Override
    public double getSideLength() {
        return sideLength;
    }

    @Override
    public double getInscribedCircleRadius() {
        return getCircleRadius(RadiusType.INSCRIBED);
    }

    @Override
    public double getOutscribedCircleRadius() {
        return getCircleRadius(RadiusType.OUTSCRIBED);
    }

    private enum RadiusType {INSCRIBED, OUTSCRIBED}

    private double getCircleRadius(RadiusType radiusType){
        double denominator = 0;

        switch(radiusType) {
            case INSCRIBED:
                denominator = 2 * Math.sin(Math.PI / sides);
                break;
            case OUTSCRIBED:
                denominator = 2 * Math.tan(Math.PI / sides);
                break;
            default:
                throw new ArithmeticException("Denominator is zero");
        }
        denominator = Util.roundDecimal(denominator);
        return Util.roundDecimal(sideLength / denominator);
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
