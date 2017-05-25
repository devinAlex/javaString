import java.util.Scanner;


public class Test11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String s = "[1-9a-zA-Z_\\.]+@[1-9a-zA-Z]+(.com)";
		if(str.matches(s)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}

}
