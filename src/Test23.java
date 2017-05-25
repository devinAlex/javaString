import java.util.Arrays;
import java.util.Scanner;


public class Test23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) > '0' && str.charAt(i) < '9'){
				sb.append(str.charAt(i));
			}
		}
		if(sb.length() > 0){
			char[] c = sb.toString().toCharArray();
			Arrays.sort(c);
			sb = new StringBuilder();
			for(int i = 0; i < c.length; i++){
				sb.append(c[i]);
			}
			System.out.println(sb.toString());
		}
	}
}
