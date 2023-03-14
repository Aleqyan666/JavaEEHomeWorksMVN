package org.javaEEhomeworks;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class ClassCalculatorTest {
    @Test
    public void twoPlusTwoShouldBeFour(){
        ClassCalculator calculator = new ClassCalculator();
         Assert.assertEquals(4, calculator.addNumbers(2, 2));

    }

}