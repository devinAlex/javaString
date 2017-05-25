import java.util.Scanner;


public class Test29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int count = 0;
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == '('){
				count++;
			}
			if(str.charAt(i) == ')'){
				count--;
			}
		}
		if(count == 0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
