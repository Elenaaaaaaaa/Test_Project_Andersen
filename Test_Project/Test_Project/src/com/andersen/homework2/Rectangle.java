package com.andersen.homework2;

public class Rectangle extends AbstractShape {

    private double rectangleArea;
    private double RectanglePerimeter;

    @Override
    public double calculateArea() {
        double tempArea = randomDouble * randomDouble1;
        rectangleArea = Math.round(tempArea * 100.0) / 100.0;
        System.out.println(" Площадь прямоугольника " + rectangleArea);
        return tempArea;
    }

    @Override
    public double calculatePerimeter() {
        double tempPerimeter = 2 * (randomDouble + randomDouble1);
        RectanglePerimeter = Math.round(tempPerimeter * 100.0) / 100.0;
        System.out.println("Периметр прямоугольника = " + RectanglePerimeter);
        return tempPerimeter;
    }
}
