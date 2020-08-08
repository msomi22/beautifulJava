/**
 * 
 */
package demo.other;

import java.util.regex.Pattern;

/**
 * @author pmnjeru
 *
 */
public class PhoneNumberValidator {

	/**
	 * 
	 * @param mobileNo, this a mobile number 10/12 digit long
	 * @return return whether the mobile number is valid or not
	 */
	public static boolean isValidMobile(String mobileNo) {
		if(mobileNo.isEmpty()) {
			return false;
		}else if(mobileNo.length() < 10 || mobileNo.length() > 12) {
			return false;
		}else if(!Pattern.matches("[0-9]+", mobileNo)) {
			return false;
			/**
			 * our assumption is that all mobile number should start with  07 or 254
			 * read more on truth table
			 *
			 */
		}else if(mobileNo.startsWith("07") || mobileNo.startsWith("2547")) {
			return true;
		}else {
			return false;
		}
		/**
		 * read more about this 
		 * 
		 * return mobileNo.isEmpty() ? false : true;
		 * 
		 */
	}
	
	
}
