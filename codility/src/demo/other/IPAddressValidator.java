/**
 * 
 */
package demo.other;

/**
 * @author pmnjeru
 *
 */
public class IPAddressValidator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		isIPValid("");

	}
	
	/**
	 * Java method to validate IP v4
	 * 
	 * We are going to learn how to validate IP address V4
	 *
	 * Let's first understand what is an IP address V4
	 * 
	 * An IP "Internet Protocol" address, is an unique number assigned to a network equipped device,
	 * Network devices normally use this number to identify each other, without an unique identifier, 
	 * networking would not be possible in the first place and consequently, communication over network would not be possible. 
	 * 
	 * Ideally, IP V4 is a 32 binary bits number. It has four numbers separated by dots. 
	 * 
	 * Each number is the decimal (base-10) representation for an eight-digit binary (base-2) number, also called an "octet" - they are 8 digits.
	 * 
	 * For instance, 
	 * 
	 * 255.255.255.255 in decimal or 11111111.11111111.11111111.11111111 in binary. 
	 * 
	 * Note:
	 * Due to reasons that will become apparent in the next paragraph, IP V4 is being replace with IPv6 which uses 128 binary bit.
	 * 
	 * At the dawn of IPv4 addressing, the Internet wasn't the as large as it is today, we had just few computers connected. 
	 * Most networks were private and closed off from other networks around the world. 
	 * 
	 * When the Internet exploded in the late 1990s, having only a 32 bits number as a unique identifier caused concerns 
	 * that we'd run out of IP addresses before long. 
	 * 
	 * Under IPv4, there are 232 possible combinations! "I hope you understand how..."
	 * 
	 * 2^32 "2 to the power of 32" is 4,294,967,296 addresses. This offers just under 4.3 billion unique addresses. 
	 *  
	 * IPv6 which is a 128 binary bit number raised that to a stress-relieving 2,128 possible addresses. "2^128 IP addresses".
	 * 
	 * This would translate to  340,282,366,920,938,463,463,374,607,431,768,211,456 IP V6 addresses. 
	 * 
	 * A good history there!
	 * 
	 * Anyway, let continue with our task.
	 * 
	 * Implement the below method as described. Don't use regex
	 * 
	 * 
	 * @param ipv4 an IP address to be validated. Examples of valid addresses are 255.255.255.0  and 192.168.100.14 
	 * @return return whether the provided IP V4 is valid or not 
	 */
	public static boolean isIPValid(String ipv4) {
		System.out.println(Integer.toBinaryString(255)); //11111111
		return false;
	}

}
