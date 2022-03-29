package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {

  FizzBuzz fb = new FizzBuzz();

  @Test
  public void returnsFizzIfNumberDivisibleByThree(){

    assertEquals("fizz", fb.fizzBuzz(3));

  }

  @Test
  public void returnBuzzIfNumberDivisibleByFive(){

    assertEquals("buzz", fb.fizzBuzz(5));

  }

  @Test
  public void returnFizzBuzzIfBoth(){
    assertEquals("fizzbuzz", fb.fizzBuzz(15));
  }

  @Test
  public void returnsNumberAsStringIFNotDivisibleByThreeOrFive(){
    assertEquals("7", fb.fizzBuzz(7));
  }

}




