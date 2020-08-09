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

        ArrayList<Double> numbers = new ArrayList<>(ARRAY_SIZE);
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
    public void sumOfSquaresOfEvenPositiveTest() {
        int ARRAY_SIZE = 1024;
        int RANDOM_BOUND = ARRAY_SIZE * 2;

        ArrayList<Integer> numbers = new ArrayList<>(ARRAY_SIZE);
        Integer sum = Integer.valueOf(0);

        Random random = new Random();

        for (int i = 0; i < ARRAY_SIZE; i++) {
            int nextInt = random.nextInt(RANDOM_BOUND) - RANDOM_BOUND / 2;

            numbers.add(nextInt);

            if (nextInt > 0) {
                int square = nextInt * nextInt;

                if (square % 2 == 0) {
                    sum += square;
                }
            }
        }

        Assert.assertEquals(sum, ListDoubleOperations.sumOfEvenSquaresOfPositive(numbers));
    }
}
