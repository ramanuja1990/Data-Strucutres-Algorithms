import java.math.BigInteger;
import java.util.Scanner;

public class BigSum {
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		BigInteger bd = new BigInteger("922337203685477582012312321");
		long ad = 12345;
	
		bd.add(BigInteger.valueOf(ad));
	}
}
