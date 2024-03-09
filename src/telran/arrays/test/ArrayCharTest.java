package telran.arrays.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.arrays.ArrayChar;

class ArrayCharTest {

	@Test
	void compareToTest() {
		char[] ar1 = {'1','2','3'};
		char[] ar2 = {'9'};
		char[] ar3 = {'1','2','3'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);
		assertEquals(8, arrayChar2.compareTo(arrayChar1));
		assertEquals(-8, arrayChar1.compareTo(arrayChar2));
		assertEquals(1, new ArrayChar(new char[] {'a','a'}).compareTo(new ArrayChar(new char[] {'a'})));
		assertEquals(-1, new ArrayChar(new char[] {'a'}).compareTo(new ArrayChar(new char[] {'a','a'})));
		assertEquals(0, arrayChar1.compareTo(arrayChar3));
		}
	@Test
	void indexOfTest() {
		char[] ar1 = {'1','2','3','2'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		assertEquals(1, arrayChar1.indexOf('2'));
		assertEquals(-1, arrayChar1.indexOf('9'));
	}
	@Test
	void lastIndexOfTest() {
		char[] ar1 = {'1','2','3','2'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		assertEquals(3, arrayChar1.lastIndexOf('2'));
		assertEquals(-1, arrayChar1.lastIndexOf('9'));
	}
	@Test
	void countTest() {
		char[] ar1 = {'1','2','3','2'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		assertEquals(2, arrayChar1.count('2'));
		assertEquals(1, arrayChar1.count('1'));
		assertEquals(0, arrayChar1.count('9'));
	}
	@Test
	void compareToIgnporeCaseTest() {
		compareToTest();
		assertEquals(0, new ArrayChar(new char[] {'a','A'}).compareToIgnporeCase(new ArrayChar(new char[] {'A','a'})));
	}
	@Test
	void containsTest() {
	char[] ar1 = {'H','e','l','L','o'};
	ArrayChar arrayChar1 = new ArrayChar(ar1);
	assertTrue (arrayChar1.contains('H'));
	assertTrue (arrayChar1.contains('e'));
	assertFalse (arrayChar1.contains('h'));
	assertFalse (arrayChar1.contains('A'));
	}
	@Test
	void equalsTest() {
		char[] ar1 = {'H','e','l','L','o'};
		char[] ar2 = {'H','e','l','l','o'};
		char[] ar3 = {'H','e','l','l','o'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);
		assertTrue (arrayChar2.equals(arrayChar3));
		assertFalse (arrayChar1.equals(arrayChar3));
	}
	@Test
	void equalsIgnoreCaseTest() {
		char[] ar1 = {'h','e','l','L','o'};
		char[] ar2 = {'H','e','l','l','o'};
		char[] ar3 = {'H','e','l','l','o'};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);
		assertTrue (arrayChar2.equalsIgnoreCase(arrayChar3));
		assertTrue (arrayChar1.equalsIgnoreCase(arrayChar3));
	}
}
