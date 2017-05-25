import java.util.Scanner;

public class Test14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int assNum = sc.nextInt();
		String str = Integer.toBinaryString(num);
		if (str.length() > assNum) {
			num = num - (int)Math.pow(2, assNum);
		}
		System.out.println(num);
	}
}
