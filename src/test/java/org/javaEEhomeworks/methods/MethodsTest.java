package org.javaEEhomeworks.methods;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MethodsTest {

    @Test
   public void firstMTest(){
       Methods methods = new Methods();
       Assert.assertNotEquals(0,methods.inputIntegers(5,6));
   }

   @Test
   public void returnMyCHar2(){
        Methods methods = new Methods();
        Assert.assertEquals('a',methods.returningChars('a'));
   }

   @Test
   public void testMethod3(){
        Methods methods = new Methods();
        Assert.assertNotEquals(methods.returningFloats(2.0f,3.2f),3.2f,3.2f);
   }



}