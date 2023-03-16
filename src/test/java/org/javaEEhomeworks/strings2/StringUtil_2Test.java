package org.javaEEhomeworks.strings2;

import org.javaEEhomeworks.strings.StringUtil;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtil_2Test {
    @Test
    public void stringsTesting1(){
        StringUtil_2 stringTestUtil = new StringUtil_2();
        Assert.assertEquals("aba",stringTestUtil.isPalindrome("aba"));
    }

}