package com.andersen.homework2;

import java.util.Random;

public abstract class AbstractShape implements ShapeInterface {

    Random random = new Random();
    public double randomDouble = genDouble();

    public double randomDouble1 = genDouble();

    public double genDouble() {
        return random.nextDouble();
    }
}
