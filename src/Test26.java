import java.util.Scanner;


public class Test26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num = num1/10 + num1%10*100 + num2/10*10 + num2%10*1000;
		System.out.println(num);
	}
}
