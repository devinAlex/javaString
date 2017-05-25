import java.util.Scanner;



public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.next();
		if(inputStr.contains(",")){
			String[] str = inputStr.split(",");
			StringBuilder sb = new StringBuilder();
			for (String temp : str) {
				if(Integer.parseInt(temp)%7 !=0 && temp.indexOf("7") == -1){
					sb.append(temp).append(",");
				}
			}
			if(sb.length() != 0){
				sb.deleteCharAt(sb.length()-1);
			}
			System.out.println(sb.toString());
		}
	}
}
