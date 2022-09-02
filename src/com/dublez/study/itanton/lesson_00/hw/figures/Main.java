package com.dublez.study.itanton.lesson_00.hw.figures;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        List<FlatFigure> figures = new ArrayList<>();
        Circle circle = new Circle(5);
        Triangle triangle1 = new EquilateralTriangle(5);
        Triangle triangle2 = new RightTriangle(3,4);
        Triangle triangle3 = new Triangle(3,4,5);
        Quadrilateral quadrilateral = new Quadrilateral(
                8.89,
                6.4,
                (91.07 / 180) * Math.PI,
                3.91,
                6.42,
                7.16,
                4.82);
        RegularPolygon regularPolygon = new RegularPolygon(5,4);
        Square square = new Square(4);
        figures.add(circle);
        figures.add(triangle1);
        figures.add(triangle2);
        figures.add(triangle3);
        figures.add(quadrilateral);
        figures.add(regularPolygon);
        figures.add(square);

        for(FlatFigure f: figures){
            System.out.println(f);
        }
    }
}
