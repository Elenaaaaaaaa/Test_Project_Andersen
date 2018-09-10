package com.andersen.homework2;

public class Square extends AbstractShape {

    private double squareArea;
    private double squarePerimeter;

    @Override
    public double calculateArea() {
        double tempArea = Math.pow(randomDouble, 2);
        squareArea = Math.round(tempArea * 100.0) / 100.0;
        System.out.println("Площадь квадрата = " + squareArea);
        return tempArea;
    }

    @Override
    public double calculatePerimeter() {
        double tempPerimeter = 4 * randomDouble;
        squarePerimeter = Math.round(tempPerimeter * 100.0) / 100.0;
        System.out.println("Периметр квадрата = " + squarePerimeter);
        return tempPerimeter;
    }
}
