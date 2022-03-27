package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {

  FizzBuzz fb = new FizzBuzz();

  @Test

  public void returnsFizzIfNumberDivisibleByThree(){

    assertEquals("fizz", fb.fizzBuzz(3));

  }

}




