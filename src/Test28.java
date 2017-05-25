import java.util.Scanner;


public class Test28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String s = "[a-zA-Z]";
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i++){
			if(String.valueOf(str.charAt(i)).matches(s)){
				sb.append(str.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}
}
