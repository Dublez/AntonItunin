package com.dublez.study.itanton.lesson_00.hw.figures;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Properties;

import static java.lang.Integer.parseInt;

public class Util {
    public static final double roundDecimal(double value){
        BigDecimal valueBD = new BigDecimal(Double.toString(value));
        valueBD = valueBD.setScale(3, RoundingMode.HALF_UP);
        return valueBD.doubleValue();
    }

}
