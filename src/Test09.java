import java.util.Scanner;


public class Test09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(add(num));
	}
	public static int add(int num){
		if(num == 0){
			return 0;
		}
		return num%10 + add(num/10);
	}
}
