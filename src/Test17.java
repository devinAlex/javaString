import java.util.Scanner;


public class Test17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String s = "[\\da-zA-Z_\\.]+@[\\da-zA-Z]+(.com)";
		if(str.matches(s)){
			System.out.println(1);
		}else{
			System.out.println(0);
		}
	}
}
