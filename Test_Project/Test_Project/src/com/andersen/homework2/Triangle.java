package com.andersen.homework2;

public class Triangle extends AbstractShape {

    private double triangleArea;
    private double trianglePerimeter;

    @Override
    public double calculateArea() {
        double tempArea = (Math.sqrt(3) / 4) * Math.pow(randomDouble, 2);
        triangleArea = Math.round(tempArea * 100.0) / 100.0;
        System.out.println("Площадь треугольника = " + triangleArea);
        return tempArea;
    }

    @Override
    public double calculatePerimeter(){
        double tempPerimeter = randomDouble + randomDouble + randomDouble;
        trianglePerimeter = Math.round(tempPerimeter * 100.0) / 100.0;
        System.out.println("Периметр треугольника = " + trianglePerimeter);
        return tempPerimeter;
    }
}
