package demo.other;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestPhoneNumberValidator {

	//TDD - provided by QA
	String mobile1 = "0718953974";
	String mobile2 = "254718953974";
	
	String mobile3 = "071895397a";
	String mobile4 = "";
	String mobile5 = "abcabcabcab";
	String mobile6 = "1234567890";

	@Test
	public void testIsValidMobile1() {
		Assert.assertArrayEquals(
				new boolean[]{
						PhoneNumberValidator.isValidMobile(mobile1),
						PhoneNumberValidator.isValidMobile(mobile2)
						}
				, new boolean[]{
						true,
						true
						}); 
	}
	
	@Test
	public void testIsValidMobile2() {
		Assert.assertArrayEquals(
				new boolean[]{
						PhoneNumberValidator.isValidMobile(mobile3),
						PhoneNumberValidator.isValidMobile(mobile4),
						PhoneNumberValidator.isValidMobile(mobile5),
						PhoneNumberValidator.isValidMobile(mobile6)
						}
				, new boolean[]{
						false,
						false,
						false,
						false
						}); 
	}
	
}
