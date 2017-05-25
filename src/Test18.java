import java.util.Scanner;


public class Test18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int capacity = 20;
		while(true){
			String str = sc.next();
			if("in".equals(str)){
				capacity++;
			}
			if("out".equals(str)){
				capacity--;
			}
			if("end".equals(str)){
				if(capacity > 20){
					System.out.println("regect");
				}else{
					System.out.println("allow");
				}
				return;
			}
		}
	}
}
