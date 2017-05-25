import java.util.Scanner;


public class Test12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int count = 0;
		if(str.length() <= 50){
			String[] s = str.split(",");
			if(s.length <= 50){
				for (String temp : s) {
					if(Integer.parseInt(temp)%3 == 0){
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
