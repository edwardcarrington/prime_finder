package co.grandcircus;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PrimesTest {

	@Test
	void test1() {
		int expected = 2;
		int actual = Primes.getNthPrime(1);
		assertEquals(expected, actual);

	}

	@Test
	void test2() {
		int expected = 3;
		int actual = Primes.getNthPrime(2);
		assertEquals(expected, actual);

	}

	@Test
	void test3() {
		int expected = 5;
		int actual = Primes.getNthPrime(3);
		assertEquals(expected, actual);

	}

	@Test
	void test4() {
		int expected = 29;
		int actual = Primes.getNthPrime(10);
		assertEquals(expected, actual);

	}

	@Test
	void test5() {
		int expected = 47;
		int actual = Primes.getNthPrime(15);
		assertEquals(expected, actual);

	}

	@Test
	void test6() {
		int expected = 7919;
		int actual = Primes.getNthPrime(1000);
		assertEquals(expected, actual);

	}
}
