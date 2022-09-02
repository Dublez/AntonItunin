package com.dublez.study.itanton.lesson_00.hw.figures;

public interface IsRegularFigure extends HasInscribedCircle, HasOutscribedCircle{
    public double getSideLength();

    @Override
    double getInscribedCircleRadius();

    @Override
    double getOutscribedCircleRadius();
}
