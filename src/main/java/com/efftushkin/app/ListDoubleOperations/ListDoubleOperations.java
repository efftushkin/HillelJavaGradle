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

    public static Double sumOfSquaresOfPositive(List<Double> numbers) {
        if (numbers == null) {
            return null;
        }

        boolean isThereAnyPositive = false;
        Double sum = Double.valueOf(0);

        for (Double number : numbers) {
            if (number == null || number < 0) {
                continue;
            }

            sum += number * number;
            isThereAnyPositive = true;
        }

        if (isThereAnyPositive) {
            return sum;
        }

        return null;
    }
}
