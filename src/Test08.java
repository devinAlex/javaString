import java.util.Scanner;



public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String binary = "0000000" + Integer.toBinaryString(sc.nextInt());
		String bin = binary.substring(binary.length() - 8);
		StringBuilder sb = new StringBuilder();
		sb.append(bin);
		sb.reverse();
		int outBun = Integer.parseInt(sb.toString(), 2);
		System.out.println(outBun);
		
	}
}
