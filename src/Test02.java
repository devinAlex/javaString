import java.util.Scanner;

/**
 * 实现在一个字符串中，统计指定字符出现的次数
 * @author Administrator
 *
 */
public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请按以下格式输入：字符串+空格+字符");
		String str = sc.next();
		String charStr = sc.next();
		char c = charStr.charAt(0);
		int count = 0;
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == c){
				count++;
			}
		}
		System.out.println(count);
	}
}
