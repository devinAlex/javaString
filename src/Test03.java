import java.util.Scanner;

/**
 * 颠倒数字相加
 * @author Administrator
 *
 */

public class Test03 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("请输入格式：数字+空格+数字 ");
		String str1 = sc.next();
		String str2 = sc.next();
		int sum = getReverseNum(str1) + getReverseNum(str2);
		System.out.println(sum);
		
	}
	public static int getReverseNum(String str){
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		return Integer.parseInt(sb.reverse().toString());
	}
}
