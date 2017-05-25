import java.util.Calendar;
import java.util.Scanner;



public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, sc.nextInt());
		c.set(Calendar.MONTH, sc.nextInt()-1);
		c.set(Calendar.DAY_OF_MONTH, sc.nextInt());
		int day = c.get(Calendar.DAY_OF_WEEK)-1;
		if(day == 0){
			day = 7;
		}
		System.out.println(day);
	}
}
