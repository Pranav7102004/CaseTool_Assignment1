package assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Smart_CalculatorTest {

	@Test
	void test()
	{
		//fail("Not yet implemented");
	Smart_Calculator s = new Smart_Calculator();
	assertEquals(2000,s.Smart_Calculator());
	}
	
	@Test
	void test2()
	{
	Smart_Calculator s = new Smart_Calculator();
	assertEquals(1102500,s.Compound_Interest());
	}
	
	@Test
	void test3()
	{	
	Smart_Calculator s = new Smart_Calculator();
	assertEquals(3,s.mean());
	}

	@Test
	void test4()
	{
	Smart_Calculator s = new Smart_Calculator();
	int result = s.Factorial(5);
	assertEquals(120,result);
	}
	
	@Test
	void test5()
	{	
	Smart_Calculator s = new Smart_Calculator();
	assertEquals(96,s.Percentage());
	}	
}