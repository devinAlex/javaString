import java.util.Scanner;


public class Test20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if(num1 > 0 && num2 > 0){
			System.out.println(minCommon(num1,num2));
		}
	}
	public static int minCommon(int num1, int num2){
		int MAX_COMMON_DIV = 0;
		for (int i = 1; i <= num1; i++) {
			if(num1%i==0 && num2%i == 0){
				MAX_COMMON_DIV = i;
			}
		}
		return num1*num2/MAX_COMMON_DIV;
	}
}
