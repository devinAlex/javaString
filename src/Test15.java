import java.util.Scanner;



public class Test15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		System.out.println(sb.reverse().toString());
	}
}
