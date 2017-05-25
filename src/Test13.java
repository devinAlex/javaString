import java.util.Scanner;


public class Test13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			int num = sc.nextInt();
			if(num >0 && num <=150){
				sum += num;
			}
		}
		int avr = sum / 4;
		System.out.println(sum + " " + avr);
	}
}
