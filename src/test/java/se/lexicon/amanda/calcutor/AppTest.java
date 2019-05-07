package se.lexicon.amanda.calcutor;


import org.junit.Assert;
import org.junit.Test;

import se.lexicon.amanda.calculator.App;


public class AppTest 
 
{ 	
	@Test
	public void test_add_return_expected_result() {
	 //Setting up
	 double num1 = 10.0;
	 double num2 = 2.0;
	 double expected = 12.0;


	 //making the method call
	 double actual = App.add(num1, num2);
	 
	//Comparing
	 Assert.assertEquals(expected, actual, 0);
 }
	
	
	@Test
	public void test_sub_return_expected_result() {
	 //Setting up
	 double num1 = 10.0;
	 double num2 = 2.0;
	 double expected = 8.0;


	 //making the method call
	 double actual = App.sub(num1, num2);
	 
	//Comparing
	 Assert.assertEquals(expected, actual, 0);
 }
	

	@Test
	public void test_multi_return_expected_result() {
	 //Setting up
	 double num1 = 10.0;
	 double num2 = 2.0;
	 double expected = 20.0;


	 //making the method call
	 double actual = App.multi(num1, num2);
	 
	//Comparing
	 Assert.assertEquals(expected, actual, 0);
 }
	
	@Test
	public void test_div_return_expected_result() {
	 //Setting up
	 double num1 = 10.0;
	 double num2 = 2.0;
	 double expected = 5.0;


	 //making the method call
	 double actual = App.div(num1, num2);
	 
	//Comparing
	 Assert.assertEquals(expected, actual, 0);
 }
	
}
