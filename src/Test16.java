import java.util.Scanner;

public class Test16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int apples = sc.nextInt();
		int baskets = sc.nextInt();
		if(apples>=0 && apples <=10 && baskets >=1 && baskets <=10){
			System.out.println(allot(apples,baskets));
		}
	}
	public static int allot(int apples, int baskets){
		if(apples < 0){
			return 0;
		}
		if(apples == 0 || baskets == 1){
			return 1;
		}
		return allot(apples - baskets, baskets) + allot(apples,baskets - 1);
		
	}
}
