import java.util.Scanner;


public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if(str.length() <= 10){
			String binary = "000" + Integer.toBinaryString(Integer.parseInt(str,16));
			StringBuilder sb = new StringBuilder();
			String bin = binary.substring(binary.length() - str.length() * 4);
			sb.append(bin);
			sb.reverse();
			String reverseString = Integer.toHexString(Integer.valueOf(sb.toString(), 2));
			System.out.println(reverseString);
		}
	}
}
