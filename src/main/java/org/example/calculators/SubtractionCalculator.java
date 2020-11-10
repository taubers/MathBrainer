package org.example.calculators;

import org.example.calculators.AbstractCalculator;

public class SubtractionCalculator extends AbstractCalculator {

    @Override
   public void calculateExpectedResult(){ this.result = getFirstNumber() - getSecondNumber();
    }
}
