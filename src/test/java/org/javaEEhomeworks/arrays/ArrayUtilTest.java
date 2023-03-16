package org.javaEEhomeworks.arrays;

import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;


import static org.junit.Assert.*;

public class ArrayUtilTest {
    @Test
    public void firstTest(){
        ArrayUtil arrayUtil = new ArrayUtil();
        Assert.assertEquals(5,arrayUtil.reverseElementsOrder());
    }

    @Test
    public void secondTest(){
        ArrayUtil arrayUtil = new ArrayUtil();
        Assert.assertNotEquals(arrayUtil.removingZeroes(),0);
    }

    @Test
    public void thirdTest(){
        ArrayUtil arrayUtil = new ArrayUtil();
        Assert.assertNotEquals(arrayUtil.countMatches(200000),5);
    }

    @Test
    public void fourthTest(){
        ArrayUtil arrayUtil = new ArrayUtil();
        Assume.assumeTrue(arrayUtil.gettingSumArray());
    }

    @Test
    public void fifthTest(){
        ArrayUtil arrayUtil = new ArrayUtil();
        Assume.assumeNoException(arrayUtil.printingLargestElement());
    }


}