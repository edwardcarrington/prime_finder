package co.grandcircus;

import java.util.Scanner;

public class Primes {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		boolean keepGoing = true;
		int num;
		String morePrimes;

		System.out.println("Welcome to PRIME time!");
		System.out.println("Ever wondered what the 10th prime number was? The 208th? The 1000th?\n"
				+ "We bet you have! Well you're in luck because we have all the answers you seek right HERE!");

		while (keepGoing) {
			num = Validator.getInt(scnr,
					"Which prime would you like to discover today? (Please enter a number 1 or greater): ", 1);

			System.out.println(getNthPrime(num) + " is the number " + num + " prime!");

			morePrimes = Validator.getStringMatchingRegex(scnr, "Would you like to explore more prime numbers?",
					"y|n|yes|no", false);

			if (morePrimes.toLowerCase().startsWith("y")) {
				keepGoing = true;
			}

			else {
				keepGoing = false;
				System.out.println("Thanks for joining us for PRIME time! Goodbye.");
			}
		}
	}

	public static int getNthPrime(int num) {
		int nthPrime = 1;
		int currentPrime = 2;

		while (nthPrime != num) {
			currentPrime++;

			if (isPrime(currentPrime)) {
				nthPrime++;
			}
		}

		return currentPrime;
	}

	private static boolean isPrime(int currentPrime) {
		if (currentPrime > 2 && currentPrime % 2 == 0) {
			return false;
		}
		for (int i = 3; i <= Math.sqrt(currentPrime); i += 2) {
			if (currentPrime % i == 0) {
				return false;
			}
		}

		return true;

	}

}