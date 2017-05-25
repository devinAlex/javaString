import java.util.Scanner;


public class Test25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str1 = str.replace("*", " ");
		String str2 = str1.trim();
		String str3 = str2.replace(" ", "*");
		String str4 = str2.replace(" ", "");
		String s = str.replace(str3, str4);
		System.out.println(s);
	}
}
