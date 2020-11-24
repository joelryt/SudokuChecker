import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

//implement tests to test Sudokuverifier with boundary values.  Use templates from Task 1 to derive and document test cases.
	
// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891
String c = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
String i = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
String i2 = "A23456789912345678891234567789123456678912345567891234456789123345678912234567891";
String i3 = "023456789912345678891234567789123456678912345567891234456789123345678912234567891";
String i4 = "821154396965327148347689752593468271472513689618972435786235914154796823239841567";
String i5 = "827154396965327148431689752593468271472513689618972435786235914154796823239841567";
String i6 = "4173698256321589479587243168254371697915864323469127582896435715732916841648752933";
String i7 = "41736982563215894795872431682543716979158643234691275828964357157329168416487529";
String i8 = "#17369825632158947958724316825437169791586432346912758289643571573291684164875293";
SudokuVerifier v = new SudokuVerifier();

	@Test
	public void testCorrectString() {
		int a = v.verify(c);
		assertEquals("correct string", a, 0);
	}

	@Test	// Digit appears more than once in a sub-grid
	public void testIncorrectString() {
		int a = v.verify(i);
		assertEquals("incorrect string", a, -2);
		
	}
	
	@Test	// Input involves character that is not a number
	public void testIncorrectString2() {
		int a = v.verify(i2);
		int b = v.verify(i8);
		assertEquals("incorrect string (a)", a, 1);
		assertEquals("incorrect string (b)", b, 1);
		
	}
	
	@Test	// Input involves digit 0
	public void testIncorrectString3() {
		int a = v.verify(i3);
		assertEquals("incorrect string", a, -1);
		
	}
	
	@Test	// Digit appears more than once in a row
	public void testIncorrectString4() {
		int a = v.verify(i4);
		assertEquals("incorrect string", a, -3);
		
	}
	
	@Test	// Digit appears more than once in a column
	public void testIncorrectString5() {
		int a = v.verify(i5);
		assertEquals("incorrect string", a, -4);
		
	}
	
	@Test	// Too long input
	public void testIncorrectString6() {
		int a = v.verify(i6);
		assertEquals("incorrect string", a, -1);
		
	}
	
	@Test	// Too short input
	public void testIncorrectString7() {
		int a = v.verify(i7);
		assertEquals("incorrect string", a, -1);
		
	}
}
