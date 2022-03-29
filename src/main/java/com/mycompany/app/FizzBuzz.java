package com.mycompany.app;

public class FizzBuzz {

  public String fizzBuzz(int num){
    if(num % 3 == 0 && num % 5 == 0){
      return "fizzbuzz";
    } else if(num % 3 == 0) {
      return "fizz";
    } else if(num % 5 == 0){
      return "buzz";
    } else {
      return String.valueOf(num);
    }
  }

}
