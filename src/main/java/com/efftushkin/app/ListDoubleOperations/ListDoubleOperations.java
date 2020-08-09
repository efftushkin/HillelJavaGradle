package com.efftushkin.app.ListDoubleOperations;

import java.math.BigDecimal;
import java.util.List;

public final class ListDoubleOperations {
    private ListDoubleOperations() {
    }

    public static Double mean(List<Double> numbers) {
        if (numbers == null) {
            return null;
        }

        Double sum = Double.valueOf(0);
        int counter = 0;

        for (Double number : numbers) {
            if (number == null) {
                continue;
            }

            sum += number;
            counter++;
        }

        if (counter == 0) {
            return null;
        }

        return sum / counter;
    }

    public static Integer sumOfEvenSquaresOfPositive(List<Integer> numbers) {
        if (numbers == null) {
            return null;
        }

        boolean isThereAnyPositive = false;
        Integer sum = Integer.valueOf(0);

        for (Integer number : numbers) {
            if (number == null || number < 0) {
                continue;
            }

            int square = number * number;

            if (square % 2 == 0) {
                sum += square;
                isThereAnyPositive = true;
            }
        }

        if (isThereAnyPositive) {
            return sum;
        }

        return null;
    }
}
