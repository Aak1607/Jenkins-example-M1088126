package com.mindtree.testing;

public class FizzBuzz {

    public String play(int number) {
	//Aak1607
        if (number == 0) throw new IllegalArgumentException("Number must not be 0");
        if (number % 3 == 0) return "Fizz";
        if (number % 5 == 0) return "Buzz";


        return String.valueOf(number);
    }
}
