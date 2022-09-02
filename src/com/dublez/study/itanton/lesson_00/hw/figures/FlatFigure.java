package com.dublez.study.itanton.lesson_00.hw.figures;

import java.util.List;

public abstract class FlatFigure {

    public abstract double getPerimeter();
    public abstract double getSquare();

    @Override
    public String toString() {
        return this.getClass().getName() + "||" + " Perimeter: "+getPerimeter() + ", Square: "+ getSquare();
    }
}
