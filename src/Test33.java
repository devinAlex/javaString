import java.util.Scanner;


public class Test33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(str.length() <= 255){
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < str.length(); i++){
				if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
					sb.insert(0, String.valueOf(str.charAt(i)).toLowerCase());
				}
				if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
					sb.insert(0, String.valueOf(str.charAt(i)).toUpperCase());
				}
			}
			System.out.println(sb.toString());
		}
	}
}
