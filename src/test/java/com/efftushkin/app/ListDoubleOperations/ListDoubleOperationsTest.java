package com.efftushkin.app.ListDoubleOperations;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListDoubleOperationsTest {
    @Test
    public void meanTest() {
        int ARRAY_SIZE = 1024;

        List<Double> numbers = new ArrayList<>(ARRAY_SIZE);
        Double sum = Double.valueOf(0);

        Random random = new Random();

        for (int i = 0; i < ARRAY_SIZE; i++) {
            double nextDouble = random.nextDouble() - 0.5;
            numbers.add(nextDouble);
            sum += nextDouble;
        }

        Assert.assertEquals(sum / ARRAY_SIZE, ListDoubleOperations.mean(numbers), 0.00000000001);
    }

    @Test
    public void sumOfSquaresOfPositiveTest() {
        int ARRAY_SIZE = 1024;

        List<Double> numbers = new ArrayList<>(ARRAY_SIZE);
        Double sum = Double.valueOf(0);

        Random random = new Random();

        for (int i = 0; i < ARRAY_SIZE; i++) {
            double nextDouble = random.nextDouble() - 0.5;

            numbers.add(nextDouble);

            if (nextDouble > 0) {
                sum += nextDouble * nextDouble;
            }
        }

        Assert.assertEquals(sum, ListDoubleOperations.sumOfSquaresOfPositive(numbers), 0.00000000001);
    }
}
