import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class Test30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			String str = sc.next();
			if(str.length() > 0){
				handleNum(str);
			}
		}
	}
	public static void handleNum(String str){
		String[] strs = str.split(",");
		Set<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < strs.length; i++) {
			set.add(strs[i]);
		}
		String data = set.toString();
		System.out.println(data.substring(1, data.length()-1));
	}
}
