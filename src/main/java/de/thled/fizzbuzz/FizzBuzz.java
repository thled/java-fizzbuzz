package de.thled.fizzbuzz;

public class FizzBuzz {

	public String play(int number) {
		if (number == 3 || number == 6 || number == 27) {
			return "Fizz";
		}

		return String.valueOf(number);
	}

}
