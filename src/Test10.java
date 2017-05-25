import java.util.Scanner;



public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numStr = sc.next();
		StringBuilder sb = new StringBuilder();
		boolean flag = false;
		if(numStr.charAt(0)== '-'){
			flag = true;
			numStr = numStr.substring(1);
		}
		for(int i = numStr.length() - 1; i >= 0; i--){
			if(sb.indexOf(String.valueOf(numStr.charAt(i))) == -1){
				sb.append(numStr.charAt(i));
			}
		}
		if(flag){
			sb.insert(0, '-');
		}
		System.out.println(Integer.parseInt(sb.toString()));
		
	}
}
